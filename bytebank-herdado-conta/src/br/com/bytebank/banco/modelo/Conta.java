package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * 
 * Classe representa os moldes de uma conta
 * 
 * @author Michel Silva
 * @version 1.0
 *
 */

public abstract class Conta extends Object implements Comparable<Conta>, Serializable{

	protected double saldo;
	private int agencia;
	private int numero;
	private transient Cliente titular;
	private static int total = 0;

	/**
	 * 
	 * Construtor para inicializar o objeto Conta a partir da agencia e n�mero
	 * 
	 * @param agencia
	 * @param numero
	 */
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		// System.out.println("O total de contas � " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		// this.saldo = 100;
		// System.out.println("Estou criando uma conta " + this.numero);
	}

	public abstract void deposita(double valor);

	
/**
 * 
 * Valor precisa ser maior do que o saldo
 * 
 * @param valor
 * @throws SaldoInsuficienteException
 */
	
	public void saca(double valor) throws SaldoInsuficienteException{

		if (this.saldo < valor) {
			// usao da exception
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}

		this.saldo -= valor;

	}

	public void transfere(double valor, Conta destino) {
		this.saca(valor);
		destino.deposita(valor);

	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Nao pode valor menor igual a 0");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Nao pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public static int getTotal() {
		return Conta.total;
	}
	
	@Override
	public boolean equals(Object ref) {
		//cast mais espec�fico 
		Conta outra = (Conta) ref;
		
		if(this.agencia != outra.agencia) {
			return false;
		}
		
		if(this.numero != outra.numero) {
			return false;
		}
		
		return true;
	}
	
	//definir ordem "natural"
	@Override
	public int compareTo(Conta outra) {
		
		return Double.compare(this.saldo, outra.saldo); //poderia chamar o get, mas est� dentro da classe
	}
	
	@Override
	public String toString() {
		return "N�mero: " + this.getNumero() + ", Ag�ncia: " + this.getAgencia() + ", Saldo: " + this.saldo;
	}

}