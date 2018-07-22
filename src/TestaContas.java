
public class TestaContas {

	public static void main(String[] args) {
		
		// Criação de objetos a partir do código abaixo
		// Um se refere a criação de uma ContaCorrente (Que também é uma conta (Polimorfismo)
		// Outro se refere à criação de uma ContaPoupança
		ContaCorrente cc = new ContaCorrente(111, 111);
		ContaPoupanca cp = new ContaPoupanca(111, 111);
		
		// Utiliza o método "Deposita para inserir saldo pela setSaldo"
		cc.deposita(100);
		cp.deposita(200);
		
		// Método Saca, retira dinheiro da conta de acordo com os parametros determinados
		cc.saca(10);
		
		// Métodos transfere, transfere um valor para uma outra conta inciada na main
		cc.trasnfere(10, cp);
		
		// Imprime os valores em tela para verificar se os valores estão corretos
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
		
		
	}
}
