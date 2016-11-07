
public class Principal {
	public static void main(String[] args) {
		Conta c = new Conta();
		c.deposita(100);

		System.out.println(c.getSaldo());
	}
}
