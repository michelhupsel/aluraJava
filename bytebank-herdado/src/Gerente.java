
public class Gerente extends FuncionarioAutenticavel{

	public double getBonificacao() {
		System.out.println("CHAMANDO A BONIFICA��O DO GERENTE");
		return super.getSalario();
	}
		
//	@Override
//	public double getBonificacao() {
//		return this.getSalario();
//	}
}
