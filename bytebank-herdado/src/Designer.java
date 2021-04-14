
public class Designer extends Funcionario{
	
	@Override
	public double getBonificacao() {
		System.out.println("Chamando o método bonificação Designer");
		return 200;
	}
	
}
