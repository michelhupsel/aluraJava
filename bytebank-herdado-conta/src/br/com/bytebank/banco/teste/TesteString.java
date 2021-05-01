package br.com.bytebank.banco.teste;

import java.util.Iterator;

public class TesteString {

	public static void main(String[] args) {

		int a = 3;
		String nome = "Alura";
		// String outro = new String("Alura");

		String outra = nome.replace("A", "a").toUpperCase();
		System.out.println("NOME: " + outra);

		char c = nome.charAt(2);
		System.out.println("CARACTERE: " + c);

		int pos = nome.indexOf("ur");
		System.out.println("POSIÇÃO: " + pos);

		String sub = nome.substring(1);
		System.out.println("SUBSTRING: " + sub);

		int tamanho = nome.length();
		System.out.println("TAMANHO STRING: " + tamanho);
		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		String vazio = " ";
		String outroVazio = vazio.trim();
		System.out.println(outroVazio.isEmpty());
		
		System.out.println("CONTAINS: " + nome.contains("Alu"));
		
	}

}
