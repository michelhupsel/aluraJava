package com.conexao.java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercaoComParametro {

	public static void main(String[] args) throws SQLException {
		// String nome = "Mouse'";
		// String descricao = "Mouse sem fio); delete from produto";

		ConnectionFactory factory = new ConnectionFactory();
		try (Connection connection = factory.recuperarConexao()) {
			connection.setAutoCommit(false); // controle da transa��o manual

			// teste de inser��o
			// String sql = "INSERT INTO PRODUTO (nome, descricao) VALUES ('" + nome + "',
			// '" + descricao + "')";
			// System.out.println(sql);

			// try com recurso
			// PreparedStatement trata os par�metros recebidos
			try (PreparedStatement stm = connection.prepareStatement(
					"INSERT INTO PRODUTO (nome, descricao) VALUES (?,?)", Statement.RETURN_GENERATED_KEYS)) {
				adicionarVariavel("SmartTV", "45 polegadas", stm);
				adicionarVariavel("Radio", "Radio de bateria", stm);

				// se o PreparedStatement estiver ok executa o commit
				connection.commit();
				stm.close();
				System.out.println("COMMIT EXECUTADO!");
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("ROLLBACK EXECUTADO!");
				// se o PreparedStatement n�o estiver ok, mant�m o estado da transa��o
				connection.rollback();
			}
			// connection.close();
		}
	}

	// metodo de inser��o na tabela produto
	private static void adicionarVariavel(String nome, String descricao, PreparedStatement stm) throws SQLException {
		stm.setString(1, nome);
		stm.setString(2, descricao);

		// teste de erro na inser��o
//		if(nome.equals("Radio")) {
//			throw new RuntimeException("N�o foi poss�vel adicionar o produto.");
//		}

		stm.execute();

		try (ResultSet rst = stm.getGeneratedKeys()) {
			while (rst.next()) {
				Integer id = rst.getInt(1);
				System.out.println("O id criado foi: " + id);
			}
			// rst.close();
		}
	}

}
