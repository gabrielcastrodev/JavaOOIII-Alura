
public class ContaCorrente extends Conta {
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}

	// Reescrita de um m�todo da classe Super
	// M�todo especifico (Especifico � baseado nas classes filhos)
	// Sempre que o m�todo � chamado, � tomado como base o m�todo especifico, n�o o gen�rico (Classe m�e)
	@Override
	public boolean saca(double valor) {
		double ValorSacar = valor + 0.20;
		return super.saca(ValorSacar);
	}
}
