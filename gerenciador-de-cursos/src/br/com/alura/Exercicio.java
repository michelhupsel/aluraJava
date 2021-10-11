package br.com.alura;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> pessoas = new HashMap<>();

		pessoas.put(21, "Leonardo Cordeiro");
		pessoas.put(27, "Fabio Pimentel");
		pessoas.put(19, "Silvio Mattos");
		pessoas.put(23, "Romulo Henrique");

//		javaColecoes.getAlunos().forEach(aluno -> {
//			System.out.println(aluno);
//		});
		
        pessoas.keySet().forEach(idade -> {
            System.out.println(pessoas.get(idade));
        });
	}

}
