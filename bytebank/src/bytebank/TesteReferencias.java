package bytebank;

public class TesteReferencias {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da primeira: " + primeiraConta.saldo );
		
		Conta segundaConta = primeiraConta;
		
		segundaConta.saldo = 500;
		System.out.println("Saldo da primeira 2: " + primeiraConta.saldo );
		primeiraConta.saldo = 100;
		System.out.println("Saldo da primeira 3: " + primeiraConta.saldo );
		
		if(primeiraConta ==  segundaConta) {
			System.out.println("São a mesmíssima conta!");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}

}
