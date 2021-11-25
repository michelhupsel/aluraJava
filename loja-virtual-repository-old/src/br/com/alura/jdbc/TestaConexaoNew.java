package br.com.alura.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestaConexaoNew {

	public static void main(String[] args) throws Exception {
//		Connection connection = DriverManager
//				.getConnection("jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC","root","root");
//		System.out.println("Fechando conexão");
		
	    ConnectionFactoryNew connectionFactory = new ConnectionFactoryNew();
	    Connection connection = connectionFactory.recuperarConexao();
		
	    System.out.println("Fechando Conexão...");
		
		connection.close();
	}

}
