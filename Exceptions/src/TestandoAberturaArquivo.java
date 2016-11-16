import java.io.FileNotFoundException;

public class TestandoAberturaArquivo {

	public static void main(String[] args) throws FileNotFoundException {
		try {
			new java.io.FileInputStream("arquivo.txt");	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception ex){
			ex.printStackTrace();
		}
		
	}

}
