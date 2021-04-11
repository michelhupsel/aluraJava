
public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 18;
		int quantidadePessoas = 2;
		boolean acompanhado = quantidadePessoas >= 2;

		System.out.println(acompanhado);
		
		if (idade >= 18 && acompanhado) {
			System.out.println("seja bem vindo!");
		} else {
			System.out.println("Infelizmente você não pode entrar.");
		}
	}
}
