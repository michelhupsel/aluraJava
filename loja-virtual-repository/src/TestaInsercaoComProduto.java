import java.sql.Connection;

import br.com.alura.jdbc.ConnectionFactoryNew;
import br.com.alura.jdbc.modelo.Produto;

public class TestaInsercaoComProduto {

	public static void main(String[] args) {

		Produto comoda = new Produto("Cômoda", "Cômoda vertical");
		
		
		try(Connection connection = new ConnectionFactoryNew().recuperarConexao()) {
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
