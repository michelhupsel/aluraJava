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
		
		//O m�todo devolve true quando o seu resultado � um java.sql.ResultSet e false caso contr�rio (update, delete, etc)
		stm.execute("INSERT INTO PRODUTO (nome, descricao) VALUES ('Mouse', 'Mouse sem fio')",
				 Statement.RETURN_GENERATED_KEYS);

		ResultSet rst = stm.getGeneratedKeys();
		while(rst.next()) {
			Integer id = rst.getInt(1); //corresponde ao �ndice da coluna no banco
			System.out.println("O id criado foi: " + id);
		}
		
		
	}

}
