package br.com.alura.Teste;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import br.com.alura.Model.Produto;

public class Sistema {

	public static void main(String[] args) throws Exception {
		//fabrica
		DocumentBuilderFactory fabrica = DocumentBuilderFactory.newInstance();
		//construção do novo documento
		DocumentBuilder builder = fabrica.newDocumentBuilder();
		//ler arquivo xml a partir do path e salva em uma variável do tipo Document
		Document document = builder.parse("src/vendas.xml");
		
		//pegar conteúdo de atributos da tag
		Element venda = document.getDocumentElement();
		String moeda = venda.getAttribute("moeda");
		System.out.println(moeda);
		
		NodeList produtos = document.getElementsByTagName("produto");
		
		for(int i = 0; i < produtos.getLength(); i++) {
			Element produto = (Element) produtos.item(i);
			
			
			String nome = produto.getElementsByTagName("nome").item(0).getTextContent();
			double preco = Double.parseDouble(produto.getElementsByTagName("preco").item(0).getTextContent());
			Produto prod = new Produto(nome, preco);
			
			System.out.println(prod);
		}
		
//		NodeList formasDePagamento = document.getElementsByTagName("formaDePagamento");
//		Element fdp = (Element) formasDePagamento.item(0);
//		String formaDePagamento = fdp.getTextContent();
//		System.out.println(formaDePagamento);
	}

}
