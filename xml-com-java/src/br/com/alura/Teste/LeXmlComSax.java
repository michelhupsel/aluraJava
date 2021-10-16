package br.com.alura.Teste;

import java.io.FileInputStream;
import java.io.InputStream;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import br.com.alura.handlers.ProdutosHandler;

import org.xml.sax.InputSource;

//ler arquivo xml
public class LeXmlComSax {

	public static void main(String[] args) throws Exception {
		
		XMLReader leitor = XMLReaderFactory.createXMLReader();
		
		ProdutosHandler logica = new ProdutosHandler();
		leitor.setContentHandler(logica);
		
		InputStream ips = new FileInputStream("src/vendas.xml");
		InputSource is = new InputSource(ips);
		leitor.parse(is);
		
		//logica.produtos = null;
		
		System.out.println(logica.getProdutos());
	}

}
