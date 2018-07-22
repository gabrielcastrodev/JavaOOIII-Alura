
public class TestaContas {

	public static void main(String[] args) {
		
		// Cria��o de objetos a partir do c�digo abaixo
		// Um se refere a cria��o de uma ContaCorrente (Que tamb�m � uma conta (Polimorfismo)
		// Outro se refere � cria��o de uma ContaPoupan�a
		ContaCorrente cc = new ContaCorrente(111, 111);
		ContaPoupanca cp = new ContaPoupanca(111, 111);
		
		// Utiliza o m�todo "Deposita para inserir saldo pela setSaldo"
		cc.deposita(100);
		cp.deposita(200);
		
		// M�todo Saca, retira dinheiro da conta de acordo com os parametros determinados
		cc.saca(10);
		
		// M�todos transfere, transfere um valor para uma outra conta inciada na main
		cc.trasnfere(10, cp);
		
		// Imprime os valores em tela para verificar se os valores est�o corretos
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
		
		
	}
}
