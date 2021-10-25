package br.com.alura.tdd;

public class CalculadoraTestes {

	public static void main(String[] args) {
		Calculadora c = new Calculadora();
		
		int soma = c.somar(3, 7);
		System.out.println(soma);
		
		soma = c.somar(3, 0);
		System.out.println(soma);
		
		soma = c.somar(0, 0);
		System.out.println(soma);
		
		soma = c.somar(3, -1);
		System.out.println(soma);
	}

}
