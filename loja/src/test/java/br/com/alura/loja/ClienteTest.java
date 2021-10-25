package br.com.alura.loja;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import junit.framework.Assert;

import org.junit.Test;

public class ClienteTest {

    @Test
    public void testaQueAConexaoComOServidorFunciona() {
    	//faz as requisi��es para o servidor
        Client client = ClientBuilder.newClient();
        //URI base
        WebTarget target = client.target("http://www.mocky.io");
        //baseado na URI e criado um web target
        String conteudo = target.path("/v2/52aaf5deee7ba8c70329fb7d").request().get(String.class);
        
        System.out.println(conteudo);
        
        Assert.assertTrue(conteudo.contains("<rua>Rua Vergueiro 3185"));
    }
}