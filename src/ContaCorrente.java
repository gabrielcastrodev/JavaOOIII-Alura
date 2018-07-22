
public class ContaCorrente extends Conta {
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}

	// Reescrita de um método da classe Super
	// Método especifico (Especifico é baseado nas classes filhos)
	// Sempre que o método é chamado, é tomado como base o método especifico, não o genérico (Classe mãe)
	@Override
	public boolean saca(double valor) {
		double ValorSacar = valor + 0.20;
		return super.saca(ValorSacar);
	}
}
