public class TesteErro {
	public static void main(String[] args) {
		System.out.println("inicio do main");
		try{
		metodo1();
		}
		catch(ArrayIndexOutOfBoundsException exI){
			System.out.println("Erro ao executar o método 1: " + exI);
		}
		System.out.println("fim do main");
	}

	static void metodo1() {
		System.out.println("inicio do metodo1");
		//try{
		metodo2();
		//}
		//catch(ArrayIndexOutOfBoundsException exI){
		//	System.out.println("Erro ao executar o método 2: " + exI);
		//}
		System.out.println("fim do metodo1");
	}

	static void metodo2() {
		System.out.println("inicio do metodo2");
		int[] array = new int[10];

		for (int i = 0; i <= 15; i++) {
			//try {
				array[i] = i;
				System.out.println(i);
			//} catch (ArrayIndexOutOfBoundsException ex) {
			//	System.out.println("Erro ao tentar executar o metodo2, índice de array acessado é inválido: " + ex);
			//}
		}
		
		System.out.println("fim do metodo2");
	}
}
