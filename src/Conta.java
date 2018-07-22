//Classe mãe
public class Conta {

	private double saldo;
	private int numero;
	private int agencia;
	public Cliente titular; //Pré-definido na Classe "Cliente", corresponde ao atributo Cliente.nome
	public static int total = 0; //Inicialização da variável (atributo) que servirá de count

	//Contrutor Padrão da classe mãe
	public Conta(int agencia, int numero) {
		Conta.total++; //Conta as contas criadas (Adiciona sempre +1 a cada chamado)
		System.out.println("O tatal de contas é: " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 100;
		System.out.println("Estou criando uma conta " + this.numero);
	}
	
	//Métodos (Ações que podem ser realizadas por métodos)
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

	//Getters and Setters (Alguns com condições)
	//Get sempre vai ser "void" pois não devolve nenhum valor, apenas adiciona à variavel
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	//Get serve para mostrar o valor armazenado 
	//Sempre deve ser acompanhado de um tipo antes de sua declaração
	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero > 0) { // Condição para que possa ser adicionado um número à variável
			this.numero = numero;
		}
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia > 0) { //Condição para que possa ser adicionado um número à variável
			this.agencia = agencia;
		}
	}
	
	public void setTitular(Cliente titular) {
		if(titular != null) {
			this.titular = titular;
		}
		
	}
	
	public Cliente getTitular() {
		return titular;
	}
}
