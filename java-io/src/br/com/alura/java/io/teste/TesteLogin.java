package br.com.alura.java.io.teste;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class TesteLogin {

	public static void main(String[] args) throws IOException {
	//import deve ser java.util.Properties
	Properties keyValue = new Properties(); 
	keyValue.setProperty("login", "alura"); //chave, valor
	keyValue.setProperty("senha", "alurapass");
	keyValue.setProperty("endereco", "www.alura.com.br");
	
	
	keyValue.store(new FileWriter("conf.properties"), "algum comentário");
	
	}
}
