class ContaCorrente extends Conta implements Tributavel {
	public void atualiza(double taxa) {
		this.setSaldo(this.getSaldo() + this.getSaldo() * (taxa * 2));
		//super.atualiza(taxa *2);
	}

	@Override
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}
}