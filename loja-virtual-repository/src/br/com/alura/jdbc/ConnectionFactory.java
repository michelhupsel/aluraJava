package br.com.alura.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

//cria conexão
public class ConnectionFactory {
	
	//datasource expõe para a aplicação
	public DataSource dataSource;
	
	public ConnectionFactory() {
		//pool de conexões configurado
		ComboPooledDataSource comboPooledDataSource =  new ComboPooledDataSource();
		comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC");
		comboPooledDataSource.setUser("root");
		comboPooledDataSource.setPassword("321719");
		
		//setar o numero maximo de conexoes
		comboPooledDataSource.setMaxPoolSize(15);
		
		this.dataSource = comboPooledDataSource;
	}
	
	
	public Connection recuperarConexao() throws SQLException {
		
		return this.dataSource.getConnection();
		
		//o uso do datasource substitui o uso do DriverManager
//		return DriverManager.getConnection(
//				"jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC", "root", "321719");
	}
}
