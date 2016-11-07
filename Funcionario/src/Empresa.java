
public class Empresa {
	private String empresaNome;
	private String empresaCNPJ;
	private int qtdFuncionarios = 0;
	private Funcionario[] funcionariosDaEmpresa;

	public void setFuncionario(Funcionario f) {
		this.funcionariosDaEmpresa[qtdFuncionarios] = f;
		this.qtdFuncionarios += 1;
	}

	public Funcionario getFuncionarioDaEmpresaPorNome(String nomeFunc) {
		boolean r = false;
		int posR = 0;

		for (int i = 0; i < this.funcionariosDaEmpresa.length; i++) {
			if (nomeFunc == this.funcionariosDaEmpresa[i].getNomeFuncionario()) {
				r = true;
				posR = i;
			}
		}

		if (r == true) {
			return this.funcionariosDaEmpresa[posR];
		} else {
			return null;
		}
	}

	public String getEmpresaNome() {
		return this.empresaNome;
	}

	public String GetEmpresaCNPJ() {
		return this.empresaCNPJ;
	}

	public void getEmpregados() {
		for (int i = 0; i < this.qtdFuncionarios; i++) {
			this.funcionariosDaEmpresa[i].getAtributosFuncionario();
		}
	}

	public boolean getContemFuncionario(Funcionario f) {
		boolean r = false;
		for (int i = 0; i < this.funcionariosDaEmpresa.length; i++) {
			if (f == this.funcionariosDaEmpresa[i]) {
				r = true;
				break;
			}
		}

		return r;
	}

	public Empresa(String nomeEmpresa, String CNPJ, Funcionario[] funcs) {
		this.empresaNome = nomeEmpresa;
		this.empresaCNPJ = CNPJ;
		this.funcionariosDaEmpresa = funcs;
	}
}
