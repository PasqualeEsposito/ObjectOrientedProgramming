package preappello2019;

import java.io.Serializable;
import java.util.ArrayList;

public class Menu implements Serializable {

	public Menu() {
		step1 = new ArrayList<>();
		step2 = new ArrayList<>();
		step3 = new ArrayList<>();
		step4 = new ArrayList<>();
		step5 = new ArrayList<>();
		
		step1.add(new Alimento("Classic", 1.50, "pane", 1));
		step1.add(new Alimento("Pretzel", 1.50, "pane", 1));
		step1.add(new Alimento("Italian", 1.00, "pane", 1));
		step1.add(new Alimento("Pizza", 2.00, "pane", 1));
		step1.add(new Alimento("Gluten free", 2.00, "pane", 1));
		
		step2.add(new Alimento("Pollo", 5.00, "carne", 2));
		step2.add(new Alimento("Tonno", 3.50, "pesce", 2));
		step2.add(new Alimento("Maiale", 6.00, "carne", 2));
		step2.add(new Alimento("Salmone", 7.00, "pesce", 2));
		step2.add(new Alimento("Veggy", 8.00, "vegano", 2));
		
		step3.add(new Alimento("Cheddar", 1.00, "formaggio", 3));
		step3.add(new Alimento("Provola", 1.50, "formaggio", 3));
		step3.add(new Alimento("Mozzarella", 2.00, "formaggio", 3));
		step3.add(new Alimento("Provolone", 1.00, "formaggio", 3));
		step3.add(new Alimento("Gorgonzola", 2.00, "formaggio", 3));
		
		step4.add(new Alimento("Uovo", 1.00, "farcitura", 4));
		step4.add(new Alimento("Tartufo", 2.50, "farcitura", 4));
		step4.add(new Alimento("Chili", 1.00, "farcitura", 4));
		step4.add(new Alimento("Patate", 1.00, "farcitura", 4));
		step4.add(new Alimento("Zucchine", 1.00, "farcitura", 4));
		
		step5.add(new Alimento("Cipolla", 1.00, "verdura", 5));
		step5.add(new Alimento("Carote", 1.00, "verdura", 5));
		step5.add(new Alimento("Carciofi", 1.50, "verdura", 5));
		step5.add(new Alimento("Funghi", 2.00, "verdura", 5));
		step5.add(new Alimento("Pomodoro", 1.50, "verdura", 5));
	}
	
	public Alimento getStep1(int i) {
		return step1.get(i);
	}
	
	public Alimento getStep2(int i) {
		return step2.get(i);
	}
	
	public Alimento getStep3(int i) {
		return step3.get(i);
	}
	
	public Alimento getStep4(int i) {
		return step4.get(i);
	}
	
	public Alimento getStep5(int i) {
		return step5.get(i);
	}
	
	private ArrayList<Alimento> step1;
	private ArrayList<Alimento> step2;
	private ArrayList<Alimento> step3;
	private ArrayList<Alimento> step4;
	private ArrayList<Alimento> step5;
	private static final long serialVersionUID = 5529649722852473604L;
}
