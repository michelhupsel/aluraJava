
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Gerente nico = new Gerente();
		
		nico.setNome("Nico Steppat");
		nico.setCpf("223355646-09");
		nico.setSalario(2600.00);
		//nico.salario = 10000;
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());

	}

}
