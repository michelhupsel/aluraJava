 package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {

		//Conta[] contas = new Conta[5]; //cria um array de referências
		Object[] referencias = new Object[5]; //cria um array de referências

		System.out.println(referencias.length);
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		referencias[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(33, 44);
		referencias[1] = cc2;
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;
		
		//ContaPoupanca ref = (ContaPoupanca) referencias[1];
		//ContaCorrente ref = (ContaCorrente) contas[1]; //ClassCastException
		
		//System.out.println(ref.getAgencia());
		//System.out.println(contas[0]); 
	}

}
