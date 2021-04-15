
public class TesteFuncionario {

	public static void main(String[] args) {
		
		
		Cliente cliente = new Cliente();
		
		
		Gerente nico = new Gerente();
		nico.setNome("Nico Steppat");
		nico.setCpf("223355646-09");
		nico.setSalario(2600.00);
		//nico.salario = 10000;
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());

	}

}
