package br.com.alura;

import java.util.Collections;
import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		
		Curso curso = new Curso("Curso de Exerc�cios","Jeferson Batista");
		
		List<Aula> aulas = curso.getAulas();
//		curso.getAulas().add(new Aula("Trabalhando com ArrayList", 21)); //o m�todo para de funcionar por conta do unmodifiableList
		curso.adiciona(new Aula("Trabalhando com ArrayList", 21));
		
		System.out.println(aulas);
	}

}
