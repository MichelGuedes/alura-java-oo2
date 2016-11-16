public class TestandoReferenciaNula {

	public static void main(String[] args) {
		Math i = null;
		
		//idealmente, deveria ser instanciado um objeto como a Classe conta do outro projeto pra poder jogar o erro...
		System.out.println("Valor de i: " + i);
	}

}
