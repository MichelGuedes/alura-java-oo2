
public class ValorInvalidoException extends RuntimeException {

	public ValorInvalidoException() {
		// TODO Auto-generated constructor stub
	}

	public ValorInvalidoException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	
	public ValorInvalidoException(double valor){
		super("Valor informado é inválido: " + valor);
	}
}
