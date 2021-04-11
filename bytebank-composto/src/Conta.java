public class Conta {
	private double saldo;
	int agencia = 42;
	int numero;
	Cliente titular = new Cliente();

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;

	}

	public boolean transfere(double valor, Conta conta) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			conta.deposita(valor);
			return true;
		}
		return false;
	}

	public double getSaldo() {
		return this.saldo;
	}
	
}
