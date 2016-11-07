public class Funcionario {
	private String nomeFuncionario;
	private String departamentoFuncionario;
	private double salarioFuncionario;
	private Data dataEntradaFuncionario;
	private String rgFuncionario;
	private int identificador;
	private static int proximoIdentificador; // static ficara como sendo uma
												// variavel global. static só
												// enxerga static!

	public String getNomeFuncionario() {
		return this.nomeFuncionario;
	}

	public String getDepartamentoFuncionario() {
		return this.departamentoFuncionario;
	}

	public double getSalarioFuncionario() {
		return this.salarioFuncionario;
	}

	public Data getDataEntradaFuncionario() {
		return this.dataEntradaFuncionario;
	}

	public String getRgFuncionario() {
		return this.rgFuncionario;
	}

	public int getIdentificador() {
		return this.identificador;
	}

	public Funcionario(String nome, String depto, double salario, Data dataEntrada, String rg) {
		this.nomeFuncionario = nome;
		this.departamentoFuncionario = depto;
		this.salarioFuncionario = salario;
		this.rgFuncionario = rg;
		this.dataEntradaFuncionario = dataEntrada;
		proximoIdentificador++;
		this.identificador = proximoIdentificador;
	}

	public void setRecebeAumento(double valorAumentado) {
		if (valorAumentado >= 0) {
			this.salarioFuncionario += valorAumentado;
		}
	}

	public double getCalculaGanhoAnual() {
		return this.salarioFuncionario * 12;
	}

	public void getAtributosFuncionario() {
		System.out.println("\n");
		System.out.println("Dados do funcionario: ");
		System.out.println("Nome: " + this.nomeFuncionario);
		System.out.println("Departamento: " + this.departamentoFuncionario);
		System.out.println("Data de Admissao: " + this.dataEntradaFuncionario.devolveData());
		System.out.println("RG: " + this.rgFuncionario);
		System.out.println("Salario atual = " + this.salarioFuncionario);
		System.out.println("Ganho anual = " + this.getCalculaGanhoAnual());
	}
}