package br.com.alura.Teste;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import br.com.alura.Model.Produto;

public class LeXmlComXPathArquivosDiretorio {
	public static void main(String[] args) throws Exception {

		List<Produto> produtos = new ArrayList<Produto>();

		// pegar a quantidade de arquivos dentro do diretório
		int contador = 0;
		File pasta = new File("src/xml-files");
		File[] listaArquivos = pasta.listFiles();
		// System.out.println(listaArquivos.length);


		// iterar cada arquivo xml
		for (File file : listaArquivos) {

			formataPath(file.toString()); //pode ser chamada direto no builder.parse

			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(file);

			XPath xPath = XPathFactory.newInstance().newXPath();

			String expression = "/venda/produtos/produto";

			XPathExpression xPathExpression = xPath.compile(expression);
			NodeList lista = (NodeList) xPathExpression.evaluate(document, XPathConstants.NODESET);

			for (int i = 0; i < lista.getLength(); i++) {
				Element produto = (Element) lista.item(i);

				String nome = produto.getElementsByTagName("nome").item(0).getTextContent();
				Double preco = Double.parseDouble(produto.getElementsByTagName("preco").item(0).getTextContent());

				Produto prod = new Produto();
				prod.setNome(nome);
				prod.setPreco(preco);

				produtos.add(prod);
			}

		}
		System.out.println(produtos);
		
	}

	
	//criado para alterar as barras do caminho dos arquivos
	//yawintutor.com/java-util-regex-patternsyntaxexception-unexpected-internal-error-near-index-1/
	private static String formataPath(String file) {
		file = file.replaceAll("\\\\", "/");
		return file;
	}
}






