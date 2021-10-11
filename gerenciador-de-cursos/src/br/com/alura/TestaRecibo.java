package br.com.alura;

import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class TestaRecibo {

	public static void main(String[] args) {

		Recibo rec1 = new Recibo("Carro", 1234);
		Recibo rec2 = new Recibo("Moto", 5678);
		Recibo rec3 = new Recibo("Caminhão", 13579);
		
		TreeSet<Recibo> minhaLista = new TreeSet<>();
		
		minhaLista.add(rec1);
		minhaLista.add(rec2);
		minhaLista.add(rec3);

		//usado antes do java 8
//		for (Recibo recibo : minhaLista) {
//			System.out.println(recibo.getNome());
//		}
		
		minhaLista.forEach(recibo -> {
			System.out.println("Nome: " + recibo.getNome() + "\nCódigo: " + recibo.getCodigo() + "\n");
		});
		
		System.out.println("------------------------------------");
		
		Iterator<Recibo> iterador = minhaLista.iterator();
		while (iterador.hasNext()) {
			System.out.println(iterador.next());
		}
		
	}

}
