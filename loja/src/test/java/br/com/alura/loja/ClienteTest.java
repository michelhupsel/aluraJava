package br.com.alura.loja;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.grizzly.http.server.HttpServer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.thoughtworks.xstream.XStream;

import br.com.alura.loja.modelo.Carrinho;
import br.com.alura.loja.modelo.Produto;
import junit.framework.Assert;

public class ClienteTest {

	private HttpServer server;
	Client client = ClientBuilder.newClient();
	WebTarget target = client.target("http://localhost:8080");

//	@Test
//	public void testaQueAConexaoComOServidorFunciona() {
//		// faz as requisi��es para o servidor
//		Client client = ClientBuilder.newClient();
//		// URI base
//		WebTarget target = client.target("http://www.mocky.io");
//		// baseado na URI e criado um web target
//		String conteudo = target.path("/v2/52aaf5deee7ba8c70329fb7d").request().get(String.class);
//		Assert.assertTrue(conteudo.contains("<rua>Rua Vergueiro 3185")); // testando se a conex�o funciona
//
//	}

	@Before
	public void startServidor() {
		// start server
		this.server = Servidor.inicializaServidor();
	}

	@After
	public void mataServidor() {
		// stop server
		server.stop();
	}

	@Test
	public void testaQueBuscarUmCarrinhoTrazOCarrinhoEsperado() {

//		Client client = ClientBuilder.newClient();
//		WebTarget target = client.target("http://localhost:8080");
		String conteudo = target.path("/carrinhos/1").request().get(String.class);
		Carrinho carrinho = (Carrinho) new XStream().fromXML(conteudo);
		Assert.assertEquals("Rua Vergueiro 3185, 8 andar", carrinho.getRua());

	}

	@Test
	public void testaQueSuportaNovosCarrinhos() {
		Carrinho carrinho = new Carrinho();
		carrinho.adiciona(new Produto(314, "Microfone", 37, 1));
		carrinho.setRua("Rua Vergueiro 3185");
		carrinho.setCidade("Sao Paulo");
		String xml = carrinho.toXML();
		Entity<String> entity = Entity.entity(xml, MediaType.APPLICATION_XML);

		Response response = target.path("/carrinhos").request().post(entity);
		Assert.assertEquals(201, response.getStatus());
		String location = response.getHeaderString("Location");
		String conteudo = client.target(location).request().get(String.class);
		Assert.assertTrue(conteudo.contains("Microfone"));
	}
}