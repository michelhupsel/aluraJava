package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TesteAlunosSemAcentos {

	public static void main(String[] args) {
		Set<String> alunos = new HashSet<>();
		alunos.add("Jose Carlos");
		alunos.add("Otavio Meirelles");
		alunos.add("Joseph Castro");
		alunos.add("Uilton Neves");
		
		System.out.println(alunos.size());
		alunos.add("Otavio Meirelles");
		
		
		boolean adicionou = alunos.add("Jose Carlos");
		System.out.println("Pedro foi adicionado ao Set? " + adicionou);
	}

}
