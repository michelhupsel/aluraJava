package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;


public class TesteCopiarArquivo2 {

	public static void main(String[] args) throws IOException {
		
		InputStream fis = System.in; //new FileOutputStream("lorem3.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream fos = System.out;//new FileOutputStream("lorem3.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		

		String linha = br.readLine();
		
		do {
			bw.write(linha);
			bw.newLine();
			//bw.flush();
			linha = br.readLine();
		} while (linha != null && !linha.isEmpty());
		
		bw.write("\n\nCópia do original.");
		
		br.close();
		bw.close();

	}

}
