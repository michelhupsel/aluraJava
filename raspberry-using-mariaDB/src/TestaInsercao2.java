
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.exercicio.DAO.ConnectionFactory;

public class TestaInsercao2 {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory factory = new ConnectionFactory();
		try (Connection connection = factory.recuperarConexao()) {
			connection.setAutoCommit(false); // controle da transação manual

			try (PreparedStatement stm = connection.prepareStatement(
					"INSERT INTO produto (nome, descricao) VALUES (?,?)", Statement.RETURN_GENERATED_KEYS)) {
				adicionarVariavel("SmartTV", "45 polegadas", stm);
				adicionarVariavel("Radio", "Radio de bateria", stm);
				adicionarVariavel("Celular", "iPhone", stm);

				connection.commit();
				stm.close();
				System.out.println("COMMIT EXECUTADO!");
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("ROLLBACK EXECUTADO!");
				connection.rollback();
			}
		}
	}

	// metodo de inserção na tabela produto
	private static void adicionarVariavel(String nome, String descricao, PreparedStatement stm) throws SQLException {
		stm.setString(1, nome);
		stm.setString(2, descricao);

		stm.execute();

		try (ResultSet rst = stm.getGeneratedKeys()) {
			while (rst.next()) {
				Integer id = rst.getInt(1);
				System.out.println("O id criado foi: " + id);
			}
		}
	}
}
