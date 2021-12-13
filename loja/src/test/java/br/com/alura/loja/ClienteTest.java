package br.com.alura.loja;

import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import com.thoughtworks.xstream.XStream;

import br.com.alura.loja.modelo.Carrinho;
import junit.framework.Assert;

public class ClienteTest {

private HttpServer server;

//	@Test
//	public void testaQueAConexaoComOServidorFunciona() {
//		// faz as requisições para o servidor
//		Client client = ClientBuilder.newClient();
//		// URI base
//		WebTarget target = client.target("http://www.mocky.io");
//		// baseado na URI e criado um web target
//		String conteudo = target.path("/v2/52aaf5deee7ba8c70329fb7d").request().get(String.class);
//		Assert.assertTrue(conteudo.contains("<rua>Rua Vergueiro 3185")); // testando se a conexão funciona
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

		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080");
		String conteudo = target.path("/carrinhos/1").request().get(String.class);
		Carrinho carrinho = (Carrinho) new XStream().fromXML(conteudo);
		Assert.assertEquals("Rua Vergueiro 3185, 8 andar", carrinho.getRua());

	}

}