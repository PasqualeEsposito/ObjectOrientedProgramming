package preappello2019;

import java.util.Random;

public class Vegetariano extends Panino {

	public Vegetariano() {
		super();
	}
	
	public void add(Alimento a) throws StepAlreadyExistsException {
		if(getNum() == 4)
			return;
		
		if(a.getTipo().compareTo("carne") == 0)
			throw new FoodNotAvaibleException();
		
		for(Alimento alim: getList())
			if(alim.getStep() == a.getStep()) throw new StepAlreadyExistsException();
		
		super.getList().add(a);
		updateNum();
	}
	
	public void autoComponi() {
		Random r = new Random();
		getList().add(getMenu().getStep1(r.nextInt(5)));
		getList().add(getMenu().getStep3(r.nextInt(5)));
		getList().add(getMenu().getStep4(r.nextInt(5)));
		getList().add(getMenu().getStep5(r.nextInt(5)));
		updateNum(4);
	}

	private static final long serialVersionUID = 3945740451062584833L;
}
