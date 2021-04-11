public class TesteIR {

	public static void main(String[] args) {

		/*
		 * O Jo�o gostaria de criar um programa sobre Imposto de Renda (IR) e verificou
		 * as regras de al�quota. Ele descobriu no site da receita: De 1900.0 at�
		 * 2800.0, o IR � de 7.5% e pode deduzir na declara��o o valor de R$ 142 De
		 * 2800.01 at� 3751.0, o IR � de 15% e pode deduzir R$ 350 De 3751.01 at�
		 * 4664.00, o IR � de 22.5% e pode deduzir R$ 636
		 */

		double salario = 3300.0;
		double ir;

		if (salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("A sua aliquota � de 7%");
            System.out.println("Voc� pode deduzir at� R$ 142");
			salario = salario - ((salario * 7.5) / 100);
		} else if (salario >= 2800.01 && salario <= 3751.0) {
			System.out.println("A sua aliquota � de 15%");
            System.out.println("Voc� pode deduzir at� R$ 350");
			salario = salario - ((salario * 15) / 100);
		} else if (salario >= 3751.01 && salario <= 4664.0) {
			System.out.println("A sua aliquota � de 22.5%");
            System.out.println("Voc� pode deduzir at� R$ 636");
			salario = salario - ((salario * 22.5) / 100);
		}
		System.out.println("Sal�rio com desconto: R$" + salario);
	}
}