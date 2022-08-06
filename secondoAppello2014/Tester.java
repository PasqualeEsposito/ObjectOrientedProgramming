package secondoAppello2014;

import java.util.GregorianCalendar;
import java.util.Random;

public class Tester {
	public static void main(String[] args) {
		ServizioMensa s = new ServizioMensa();
		int[] stringa = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0} ;
		Random r = new Random();
		for(int i = 0; i < 10; i++)
			switch(r.nextInt(2)) {
			case 0:
				stringa[i] = r.nextInt();
				s.aggiungiTesserino(new TesserinoStudente(stringa[i], "Alfredo", "Barone", r.nextBoolean(),
						"alfsiwi2324", new GregorianCalendar(r.nextInt(31), r.nextInt(12), r.nextInt(21) + 2000), 100, 'A', r.nextBoolean()));
				break;
			case 1:
				stringa[i] = r.nextInt();
				s.aggiungiTesserino(new TesserinoPersonale(stringa[i], "Giovanni", "Baccuccio", r.nextBoolean(), "Informatica", 1));
				break;
			}
		
		try {
			for(int i = 0; i < 30; i++)
				s.usaTesserino(stringa[r.nextInt(10)]);
		}
		catch(TesserinoScadutoException e) {
			
		}
		
		System.out.println(s.calcolaCosto());
	}
}
