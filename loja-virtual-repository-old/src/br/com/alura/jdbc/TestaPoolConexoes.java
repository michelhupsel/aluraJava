package br.com.alura.jdbc;

import java.sql.SQLException;
import java.util.Iterator;

public class TestaPoolConexoes {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		ConnectionFactory connectionFactory =  new ConnectionFactory();
		
		for (int i = 0; i < 20; i++) {
			connectionFactory.recuperarConexao();
			System.out.println("Conex�o de n�mero: " + i);
		}
	}

}
