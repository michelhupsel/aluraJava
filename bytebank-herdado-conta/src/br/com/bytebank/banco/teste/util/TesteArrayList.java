package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {

		//exemplo generics
		List<Conta> lista = new LinkedList<Conta>();
		
		ArrayList<String> nomes = new ArrayList<String>();

//		Cliente cliente = new Cliente();
//		lista.add(cliente);
		
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);

		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);

		System.out.println("Tamanho: " + lista.size());
		Conta ref = (Conta) lista.get(0); //cast desnecessário
		System.out.println(ref.getNumero());

		lista.remove(0);

		System.out.println("Tamanho: " + lista.size());

		Conta cc3 = new ContaCorrente(33, 11);
		lista.add(cc);
		Conta cc4 = new ContaCorrente(22, 44);
		lista.add(cc2);

//		for (int i = 0; i < lista.size(); i++) {
//			Object oRef = lista.get(i);
//			System.out.println(oRef);
//		}

		for (Conta o : lista) {
			System.out.println(o);
		}
		
//		for (Object o : lista) {
//			System.out.println(o);
//		}
		
	}

}
