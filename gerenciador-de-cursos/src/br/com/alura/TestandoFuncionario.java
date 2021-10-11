package br.com.alura;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestandoFuncionario {

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario("Jeferson", 28);
		Funcionario f2 = new Funcionario("Franklin", 53);
		Funcionario f3 = new Funcionario("Chico", 37);
		
		Set<Funcionario> funcionarios = new TreeSet<>(new Funcionario());
		
		funcionarios.add(f1);
		funcionarios.add(f2);
		funcionarios.add(f3);
		
		Iterator<Funcionario> iteratorFuncionario = funcionarios.iterator();
		
		while (iteratorFuncionario.hasNext()) {
			System.out.println("Nome: " + iteratorFuncionario.next().getNome());
		}
		
	}

}
