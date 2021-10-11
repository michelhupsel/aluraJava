package br.com.alura;

public class Recibo implements Comparable<Recibo> {

	private String nome;
	private int codigo;

	public Recibo(String nome, int codigo) {
		this.nome = nome;
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

//	@Override
//	public int compareTo(Recibo recibo) {
//		return this.nome.compareTo(recibo.nome);
//	}
	
	@Override
	public int compareTo(Recibo recibo) {
		return Integer.compare(this.codigo, recibo.getCodigo());
	}
	//https://stackoverflow.com/questions/57836294/compareto-error-cannot-invoke-comparetoint-on-the-primitive-type-int

}
