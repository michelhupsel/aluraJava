package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayReferencias {

	public static void main(String[] args) {

		ContaCorrente[] contas = new ContaCorrente[5]; //cria um array de referências
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		contas[0] = cc1;
		
		ContaCorrente cc2 = new ContaCorrente(33, 44);
		contas[1] = cc2;
		
		System.out.println(contas[1].getAgencia());
		
		ContaCorrente ref = contas[1];
		
		System.out.println(ref.getAgencia());
		
		//System.out.println(contas[0]); 
	}

}
