package preappello2019;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Panino implements Serializable {
	
	public Panino() {
		list = new ArrayList<>();
		menu = new Menu();
		num = 0;
	}
	
	public ArrayList<Alimento> getList() {
		return list;
	}
	
	public Menu getMenu() {
		return menu;
	}
	
	public int getNum() {
		return num;
	}
	
	public void updateNum() {
		num ++;
	}
	
	public void updateNum(int n) {
		num = n;
	}
	
	public double calcolaCosto() {
		double sum = 0;
		for(int i = 0; i < num; i++)
			sum += getList().get(i).getCosto();
		return sum;
	}
	
	public String toString() {
		String s = "";
		for(int i = 0; i < num; i++)
			s += list.get(i).toString() + "\n";
		return s;
	}
	
	public abstract void add(Alimento a) throws StepAlreadyExistsException;
	public abstract void autoComponi();
	
	private ArrayList<Alimento> list;
	private Menu menu;
	int num;
	private static final long serialVersionUID = 3945740451062584833L;
}
