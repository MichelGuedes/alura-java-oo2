class Conta{
  protected double saldo;

  public double getSaldo(){
    return this.saldo;
  }

  public void deposita(double valor){
    if (valor > 0){
      this.saldo += valor;
    }
  }

  public void saca(double valor){
    if ((valor > 0) && (valor < this.saldo)){
      this.saldo -= valor;
    }
  }

  public void atualiza(double taxa){
    this.saldo += this.saldo * taxa;
  }
}

/*****************************************************************************/

class ContaPoupanca extends Conta{
  public void atualiza (double taxa){
    this.saldo += this.saldo * (taxa *3);
  }

  public void deposita(double valor){
    double taxaParaDeposito = 0.10;
    if (valor > 0){
      this.saldo += (valor-taxaParaDeposito);
    }
  }
}
/*****************************************************************************/

class ContaCorrente extends Conta{
  public void atualiza (double taxa){
    this.saldo += this.saldo * (taxa *2);
  }
}

/*****************************************************************************/

class AtualizadorDeContas{
  private double saldoTotal = 0;
  private double selicAtualizador;

  public AtualizadorDeContas(double selic){
    this.selicAtualizador = selic;
  }

  public double getSaldoTotal(){
    return this.saldoTotal;
  }

  public void atualizaContas (Conta c){
    System.out.println("Saldo anterior: " + c.getSaldo());
    c.atualiza(this.selicAtualizador);
    System.out.println("Saldo atualizado: " + c.getSaldo());
    this.saldoTotal += c.getSaldo();
  }
}

/*****************************************************************************/

class TestaContas{
  public static void main(String[] args) {
    Conta c = new Conta();
    ContaCorrente cc = new ContaCorrente();
    ContaPoupanca cp = new ContaPoupanca();

    c.deposita(1000);
    cc.deposita(1000);
    cp.deposita(1000);

    /*c.atualiza(0.01);
    cc.atualiza(0.01);
    cp.atualiza(0.01);

    /*c.saca(1);
    cc.saca(1);
    cp.saca(1);*/

    AtualizadorDeContas at = new AtualizadorDeContas(0.01);

    at.atualizaContas(c);
    at.atualizaContas(cc);
    at.atualizaContas(cp);

    System.out.println("Saldo da conta: " + c.getSaldo());
    System.out.println("Saldo da conta corrente: " + cc.getSaldo());
    System.out.println("Saldo da conta poupanca: " + cp.getSaldo());

    System.out.println("Saldo total de todas as contas: " + at.getSaldoTotal());

  }
}
