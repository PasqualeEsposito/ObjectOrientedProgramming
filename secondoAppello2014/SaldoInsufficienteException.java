package secondoAppello2014;

public class SaldoInsufficienteException extends RuntimeException {

	public SaldoInsufficienteException() {
		
	}
	
	public SaldoInsufficienteException(String msg) {
		super(msg);
	}
	
	private static final long serialVersionUID = -3972766681153640675L;

}
