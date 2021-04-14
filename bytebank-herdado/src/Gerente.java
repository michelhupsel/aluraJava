
public class Gerente extends FuncionarioAutenticavel{

	public double getBonificacao() {
		System.out.println("CHAMANDO A BONIFICAÇÃO DO GERENTE");
		return super.getSalario();
	}
		
//	@Override
//	public double getBonificacao() {
//		return this.getSalario();
//	}
}
