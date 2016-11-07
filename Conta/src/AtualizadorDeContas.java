
public class AtualizadorDeContas {

	private double saldoTotal = 0;
	private double selicAtualizador;

	public AtualizadorDeContas(double selic) {
		this.selicAtualizador = selic;
	}

	public double getSaldoTotal() {
		return this.saldoTotal;
	}

	public void atualizaContas(Conta c) {
		System.out.println("Saldo anterior: " + c.getSaldo());
		c.atualiza(this.selicAtualizador);
		System.out.println("Saldo atualizado: " + c.getSaldo());
		this.saldoTotal += c.getSaldo();
	}

}
