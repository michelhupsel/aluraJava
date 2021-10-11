package br.com.alura;

import java.util.Comparator;

public class Funcionario implements Comparator<Funcionario> {

	private String nome;
	private int idade;

	public Funcionario(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {

		this.nome = nome;

	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	// minha implementação
//	@Override
//	public int compare(Funcionario f1, Funcionario f2) {
//		return Integer.compare(f1.idade, f2.idade);
//	}

	@Override
	public int compare(Funcionario funcionario, Funcionario outroFuncionario) {
		return funcionario.getIdade() - outroFuncionario.getIdade();
	}

}
