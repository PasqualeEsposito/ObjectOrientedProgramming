package preappello2019;

public class FoodNotAvaibleException extends RuntimeException {

	public FoodNotAvaibleException() {
		super();
	}
	
	public FoodNotAvaibleException(String msg) {
		super(msg);
	}
	
	private static final long serialVersionUID = -200437391355515784L;
}
