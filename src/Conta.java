//commit git 2
public class Conta {

	private double saldo;
	private int numero;
	private int agencia;
	Cliente titular;
	public static int total = 0;

	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("O tatal de contas é: " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 100;
		System.out.println("Estou criando uma conta " + this.numero);
	}

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

	public boolean trasnfere(double valor, Conta destino) {
		if (this.saca(valor)) {
			destino.deposita(valor);
			return true;
		}
		return false;

	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero > 0) {
			this.numero = numero;
		}
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia > 0) {
			this.agencia = agencia;
		}
	}
}
