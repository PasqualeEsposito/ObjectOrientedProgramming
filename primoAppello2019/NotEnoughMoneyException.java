package primoAppello2019;

public class NotEnoughMoneyException extends Exception {

	public NotEnoughMoneyException() {
		
	}
	
	public NotEnoughMoneyException(String msg) {
		super(msg);
	}
	
	private static final long serialVersionUID = -472336350120590618L;

}
