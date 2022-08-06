package primoAppello2019;

public class BadDataException extends RuntimeException {

	public BadDataException() {
		
	}
	
	public BadDataException(String msg) {
		super(msg);
	}
	
	private static final long serialVersionUID = 4458003412158540878L;
}
