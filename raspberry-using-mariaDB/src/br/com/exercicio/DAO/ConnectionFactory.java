package br.com.exercicio.DAO;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {

	public DataSource dataSource;

	public ConnectionFactory() {

		// pool de conexões configurado
		ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
		comboPooledDataSource.setJdbcUrl("jdbc:mariadb://192.168.0.109:3306/loja_virtual");
		comboPooledDataSource.setUser("root");
		comboPooledDataSource.setPassword("root");

		// setar o numero maximo de conexoes
		comboPooledDataSource.setMaxPoolSize(15);

		this.dataSource = comboPooledDataSource;
	}

	public Connection recuperarConexao() throws SQLException {

		return this.dataSource.getConnection();

	}
}