

public class FuncionarioTest {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Lucas Guedes Vieira", "Juridico", 500, new Data(04, 10, 2016), "987654321");
		Funcionario f2 = new Funcionario("Mariana Guedes Vieira", "RH", 500.0, new Data(04, 10, 2016), "123456789");

		if (f1 == f2) {
			System.out.println("Funcionarios sao iguais!");
		} else {
			System.out.println("Funcionarios sao diferentes!");
		}

		f1.setRecebeAumento(100);
		f1.getAtributosFuncionario();
		f2.getAtributosFuncionario();

		System.out.println("Numero ID do(a) funcionario(a) " + f1.getNomeFuncionario() + ": " + f1.getIdentificador());
		System.out.println("Numero ID do(a) funcionario(a) " + f2.getNomeFuncionario() + ": " + f2.getIdentificador());
	}
}
