class ContaCorrente extends Conta {
	public void atualiza(double taxa) {
		//this.setSaldo(this.getSaldo() + this.getSaldo() * (taxa * 2));
		super.atualiza(taxa *2);
	}
}