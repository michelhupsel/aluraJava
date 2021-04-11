package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200.00;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100.00;
		System.out.println(primeiraConta.saldo);
		
		
		Conta segundaConta =  new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("primeira conta tem: " + primeiraConta.saldo);
		System.out.println("segunda conta tem: " + segundaConta.saldo);
		System.out.println("AGENCIA: " + segundaConta.agencia);
		System.out.println("AGENCIA: " + primeiraConta.agencia);
		System.out.println("NUMERO: " + segundaConta.numero);
		System.out.println("TITULAR: " + segundaConta.titular);
		
		
	}

}
