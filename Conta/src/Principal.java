
public class Principal {
	public static void main(String[] args) {
		Conta c = new ContaCorrente();
		c.deposita(100);

		System.out.println(c.getSaldo());
	}
}
