package br.com.alura.jdbc;

import java.sql.SQLException;

public class TestaPoolConexoesNew {

	public static void main(String[] args) throws SQLException {

		ConnectionFactoryNew connectionFactory =  new ConnectionFactoryNew();
		
		for (int i = 0; i < 40; i++) {  //verificar no banco -> show processlist;
			connectionFactory.recuperarConexao();
			System.out.println("Conex�o de n�mero: " + i);
		}
	}

}
