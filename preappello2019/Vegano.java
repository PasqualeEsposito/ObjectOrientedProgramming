package preappello2019;

import java.util.Random;

public class Vegano extends Panino {

	public Vegano() {
		super();
	}
	
	public void add(Alimento a) {
		if(getNum() == 3)
			return;
		
		if(a.getTipo().compareTo("carne") == 0 || a.getTipo().compareTo("pesce") == 0 || a.getTipo().compareTo("formaggio") == 0)
			throw new FoodNotAvaibleException();
		
		super.getList().add(a);
		updateNum();
	}

	public void autoComponi() {
		Random r = new Random();
		getList().add(getMenu().getStep1(r.nextInt(5)));
		getList().add(getMenu().getStep2(4));
		getList().add(getMenu().getStep5(r.nextInt(5)));
		updateNum(3);
	}

	private static final long serialVersionUID = 3945740451062584833L;
}
