
public class TestaDeposita {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();

		try {
			cc.deposita(-10);
		} catch (IllegalArgumentException iEx) {
			System.out.println("Erro ao usar a função de depósito: " + iEx);
		} catch (ValorInvalidoException viEx) {
			System.out.println("Erro ao usar a função de depósito: " + viEx);
		}
	}
}