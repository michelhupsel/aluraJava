package br.com.alura.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class TestaListagemNew {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		ConnectionFactoryNew connectionFactory = new ConnectionFactoryNew();
		Connection connection = connectionFactory.recuperarConexao();

		PreparedStatement stm = connection.prepareStatement("SELECT ID, NOME, DESCRICAO FROM PRODUTO");

		stm.execute();

		//armazena o conteúdo da tabela
		ResultSet rst = stm.getResultSet();

		//percorre o ResultSet
		while(rst.next()) {
//			Integer id = rst.getInt(1);
			Integer id = rst.getInt("id");
			System.out.print(id + " ");
//			String nome = rst.getString(2);
			String nome = rst.getString("nome");
			System.out.print(nome + " ");
			String descricao = rst.getString("descricao");
			System.out.print(descricao + "\n");
		}

		connection.close();
	}

}
