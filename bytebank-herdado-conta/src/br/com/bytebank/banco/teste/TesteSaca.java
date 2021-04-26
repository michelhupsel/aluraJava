package br.com.bytebank.banco.teste;
import br.com.bytebank.banco.modelo.*;

public class TesteSaca {

	public static void main(String[] args) {

		Conta conta = new ContaCorrente(123, 321);
		conta.deposita(200.00);
		try {
			conta.saca(210.0);
		} catch (SaldoInsuficienteException e) {
			System.out.println("Exception: " + e.getMessage());
		}
		
		System.out.println(conta.getSaldo());
	}

}
