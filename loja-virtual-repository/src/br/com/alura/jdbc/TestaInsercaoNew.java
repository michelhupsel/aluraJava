package br.com.alura.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercaoNew {

	public static void main(String[] args) throws SQLException {

		ConnectionFactoryNew factory = new ConnectionFactoryNew();
		Connection connection = factory.recuperarConexao();
		
		//Statement para executar clausulas sql 
		Statement stm = connection.createStatement();
		
		//O método devolve true quando o seu resultado é um java.sql.ResultSet e false caso contrário (update, delete, etc)
		stm.execute("INSERT INTO PRODUTO (nome, descricao) VALUES ('Mouse', 'Mouse sem fio')",
				 Statement.RETURN_GENERATED_KEYS);

		ResultSet rst = stm.getGeneratedKeys();
		while(rst.next()) {
			Integer id = rst.getInt(1); //corresponde ao índice da coluna no banco
			System.out.println("O id criado foi: " + id);
		}
		
		
	}

}
