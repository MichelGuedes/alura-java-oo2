abstract class Conta {
	private double saldo;

	public double getSaldo() {
		return this.saldo;
	}

	public void deposita(double valor) {
		if (valor > 0) {
			this.setSaldo(this.getSaldo() + valor);
		}else{
			throw new ValorInvalidoException(valor);
		}
	}

	public void saca(double valor) {
		if ((valor > 0) && (valor < this.getSaldo())) {
			this.setSaldo(this.getSaldo() - valor);
		}
	}

	abstract void atualiza(double taxa);

	public void setSaldo(double saldo) {
		if (saldo > 0) {
			this.saldo = saldo;
		}
	}
}

/*****************************************************************************/

class TestaContas {
	public static void main(String[] args) {
		Conta c = new ContaCorrente();
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();

		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);

		/*
		 * c.atualiza(0.01); cc.atualiza(0.01); cp.atualiza(0.01);
		 * 
		 * /*c.saca(1); cc.saca(1); cp.saca(1);
		 */

		AtualizadorDeContas at = new AtualizadorDeContas(0.01);

		at.atualizaContas(c);
		at.atualizaContas(cc);
		at.atualizaContas(cp);

		System.out.printf("Saldo da conta: %.2f \n", c.getSaldo());
		System.out.printf("Saldo da conta corrente : %.2f \n", cc.getSaldo());
		System.out.printf("Saldo da conta poupanca: %.2f \n", cp.getSaldo());

		System.out.println("Saldo total de todas as contas: " + at.getSaldoTotal());

	}
}
