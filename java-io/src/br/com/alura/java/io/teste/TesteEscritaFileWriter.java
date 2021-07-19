package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem4.txt"));
		bw.write("Texto de teste");
		bw.newLine();
		bw.newLine();
		bw.write("Última linha de teste");
		
		bw.close();
	}

}
