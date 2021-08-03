package br.com.alura;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {
	
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}
	
	public Curso(String nome, String instrutor, Aula aula) {
		this.nome = nome;
		this.instrutor = instrutor;
		this.getAulas().add(aula);
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	
	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }
}
