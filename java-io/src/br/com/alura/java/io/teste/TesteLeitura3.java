package br.com.alura.java.io.teste;

import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura3 {

	public static void main(String[] args) throws Exception {
//		boolean tem = scanner.hasNextLine();
//		System.out.println(tem);

		Scanner scanner = new Scanner(new File("contas.csv"), "UTF-8");

		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			// System.out.println(linha);

			Scanner linhaScanner = new Scanner(linha);
			 linhaScanner.useLocale(Locale.US); // deteminar as regras do padrão americano
			// por conta da exception
			// InputMismatchException
			linhaScanner.useDelimiter(",");

			String valor1 = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numero = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();

			String valorFormatado = String.format("%s - %d %d, %s: %010.2f", valor1, agencia, numero, titular, saldo); //new Locale("pt","BR"),
			System.out.println(valorFormatado);

//			System.out.println(valor1 + "," + valor2 + "," + valor3 + "," + valor4 + "," + valor5);
			linhaScanner.close();

//			String[] valores = linha.split(",");
//			System.out.println(Arrays.toString(valores));
//			System.out.println(valores[1]);
		}

		scanner.close();

		//System.out.println(String.format("Formatando %04d",20));
	}
	
}
