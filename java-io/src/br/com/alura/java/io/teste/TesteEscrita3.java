package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;


public class TesteEscrita3 {

	public static void main(String[] args) throws IOException {
		
		//BufferedWriter bw = new BufferedWriter(new FileWriter("lorem4.txt"));
		
		//PrintStream ps = new PrintStream(new File("lorem2.txt"));
		
		PrintWriter ps = new PrintWriter("lorem2.txt");
		
		
		ps.println("Texto de teste");
		ps.println();
		ps.println("Última linha de teste final");

		ps.close();
	}

}
