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
import br.com.alura.loja.modelo.Projeto;
import junit.framework.Assert;

public class ProjetoTest {
	private HttpServer server;
	
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
    public void testaQueAConexaoComOServidorFuncionaNoPathDeProjetos() {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://localhost:8080");
        String conteudo = target.path("/projetos/").request().get(String.class);
        Projeto projeto = (Projeto) new XStream().fromXML(conteudo);
        Assert.assertTrue(conteudo.contains("<nome>Minha loja"));

    }
	
}