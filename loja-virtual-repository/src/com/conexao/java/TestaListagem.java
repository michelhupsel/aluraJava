package com.conexao.java;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaListagem {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		ConnectionFactory criaConexao = new ConnectionFactory();
		Connection connection = criaConexao.recuperarConexao();

		// os comandos like sql são considerados statements dentro do java
		Statement stm = connection.createStatement();
		// stm.execute("select * from produto");
		// boolean resultado = stm.execute("SELECT ID, NOME, DESCRICAO FROM PRODUTO");
		// System.out.println(resultado);

		// passando a clausula atraves do execute()
		// boolean resultado = stm.execute("SELECT ID, NOME, DESCRICAO FROM PRODUTO");
		stm.execute("SELECT ID, NOME, DESCRICAO FROM PRODUTO");

		ResultSet rst = stm.getResultSet();

		while (rst.next()) {
			Integer id = rst.getInt("id");
			System.out.print(id + " ");
			String nome = rst.getString("nome");
			System.out.print(nome + " ");
			String descricao = rst.getString("descricao");
			System.out.print(descricao + "\n");
		}

		connection.close();
	}

}
