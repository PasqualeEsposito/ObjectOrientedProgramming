package primoAppello2019;

import java.util.Random;

public class PartitaCalcio extends Partita {
	
	public PartitaCalcio(Squadra a, Squadra b, double costo, String data) throws BadDataException, SameElementException, NotEnoughMoneyException {
		super(a, b, data);
		this.costo = costo;
		gioca(a, b);
	}
	
	public PartitaCalcio(Squadra a, Squadra b, String data) throws BadDataException, SameElementException, NotEnoughMoneyException {
		super(a, b, data);
		costo = 100;
		gioca(a, b);
	}
	
	public String toString() {
		return super.toString() + "[Costo: " + costo + "]";
	}
	
	public void changeCosto(int costo) {
		this.costo = costo; 
	}
	
	public void gioca(Squadra a, Squadra b) throws NotEnoughMoneyException {
		Random r = new Random();
		int risA = r.nextInt(11), risB = r.nextInt(11);
		if(a.getBudget() < costo*2/3 || b.getBudget() < costo*2/3)
			throw new NotEnoughMoneyException();
		a.updatePartite();
		b.updatePartite();
		updateRisA(risA);
		updateRisA(risB);
		if(risA > risB) {
			a.updatePunti(3);
			a.updateBudget(costo*1/3);
			b.updateBudget(costo*2/3);
		}
		else {
			if(risA < risB) {
				b.updatePunti(2);
				a.updateBudget(costo*2/3);
				b.updateBudget(costo*1/3);
			}
			else {
				a.updatePunti(1);
				b.updatePunti(1);
				a.updateBudget(costo*1/2);
				a.updateBudget(costo*1/2);
			}
		}
		
	}
	
	private double costo;
}
