package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;


public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		
		// Fluxo de Entrada com Arquivo
		FileInputStream fis = new FileInputStream("lorem.txt");
		// Ler arquivo, transforma bits e bytes em caracteres
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		String linha = br.readLine();
		
//		while(linha != null) {
//			System.out.println(linha);
//			linha = br.readLine();
//		}
		
		do {
			System.out.println(linha);
			linha = br.readLine();
		} while (linha != null);
		
		br.close();
	}

}
