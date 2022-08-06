package primoAppello2019;

import java.util.Random;

public class PartitaBasket extends Partita {
	public PartitaBasket(Squadra a, Squadra b, String data) throws BadDataException, SameElementException {
		super(a, b, data);
		gioca(a, b);
	}

	public void gioca(Squadra a, Squadra b) {
		Random r = new Random();
		int risA = r.nextInt(21) + 60, risB = r.nextInt(21) + 60, ris2A = 0, ris2B = 0;
		while (ris2A == ris2B) {
			ris2A = r.nextInt(21);
			ris2B = r.nextInt(21);
		}
		if(risA == risB)
			overcome = r.nextInt(5);
		else
			overcome = 0;
		a.updatePartite();
		b.updatePartite();
		updateRisA(risA + ris2A);
		updateRisA(risB + ris2B);
		if(risA + ris2A > risB + ris2B)
			a.updatePunti(2);
		else
			b.updatePunti(2);
	}
	
	public String toString() {
		return super.toString() + "[Overcome: " + overcome + "]";
	}
	
	private int overcome;
}
