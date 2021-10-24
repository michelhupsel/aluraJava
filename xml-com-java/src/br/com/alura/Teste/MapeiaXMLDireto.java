package br.com.alura.Teste;

import java.io.File;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import br.com.alura.Model.Produto;
import br.com.alura.Model.Venda;

public class MapeiaXMLDireto {

	public static void main(String[] args) throws Exception{
		
		//adicionar as depend�ncias atrav�s do run configurations -> Dependencies -> Modulepath Entries
		//adicionar no VM arguments o "--add-modules java.xml.bind"
		//adicionar os .jar no properties -> Libraries -> Modulepath -> Add External JARS...
		//os jars est�o no jaxb-jars do diret�rio principal 
        JAXBContext jaxbContext = JAXBContext.newInstance(Venda.class);
        
		
        
        //xmlParaObjeto(jaxbContext);
        
        objetoParaXml(jaxbContext);
	}

	private static void objetoParaXml(JAXBContext jaxbContext) throws Exception {
		Marshaller marshaller = jaxbContext.createMarshaller();
		
		Venda venda = new Venda();
		venda.setFormaDePagamento("Cr�di�rio");
		
		List<Produto> produtos = new ArrayList<>();
		produtos.add(new Produto("Livro de Java", 59.90));
		produtos.add(new Produto("Livro de xml", 59.90));
		produtos.add(new Produto("Livro de Orienta��o a Objetos", 59.90));
		venda .setProdutos(produtos);
		
		StringWriter writer = new StringWriter();
		marshaller.marshal(venda, writer);
		
		System.out.println(writer.toString());
		
	}

	private static void xmlParaObjeto(JAXBContext jaxbContext) throws Exception {
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Venda venda = (Venda) unmarshaller.unmarshal(new File("src/vendas.xml"));
        System.out.println(venda);
	}

}
