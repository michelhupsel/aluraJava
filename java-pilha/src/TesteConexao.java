
public class TesteConexao {

	public static void main(String[] args) {

		try (Conexao conexao = new Conexao()) {
			conexao.leDados();
		} catch (IllegalStateException e) {
			System.out.println("Deu erro na conex�o " + e);
		}

		// ----------------------------------

//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//			//con.fecha();
//		} catch (IllegalStateException ex) {
//			System.out.println("Deu erro na conex�o " + ex);
//		}finally {
//			System.out.println("finally");
//			if(con != null) {
//				con.close();
//			}
//			
//		}

	}

}
