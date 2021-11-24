package br.com.alura.jdbc.modelo;

public class Produto {
	private Integer id;
	private String nome;
	private String descricao;
	
	public Produto(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
	}
	
	public Produto(Integer id, String nome, String descricao) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
	}

	
	public String getNome() {
		return nome;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("O produto �: %d, %s, %s", this.id, this.nome, this.descricao);
	}

}
