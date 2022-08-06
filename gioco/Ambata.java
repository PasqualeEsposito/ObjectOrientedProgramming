package gioco;

public class Ambata extends Gioco {

	public Ambata(int costo) {
		super(costo);
		carteVincenti = new int[10];
		giocatore = randomNumber(45) + 1;
		for(int i = 0; i < 10; i++) {
			carteVincenti[i] = randomNumber(45) + 1;
			for(int j = 0; j < i; j++) {
				if(carteVincenti[i] == carteVincenti[j])
					i--;
			}
		}
	}
	
	public boolean gioca() {
		for(int i = 0; i < 10; i++)
			if(carteVincenti[i] == giocatore)
				return true;
		return false;
	}
	
	public int dammiVincita() {
		return getCosto() * 10;
	}
	
	public String toString() {
		String s = "Ambata: " + giocatore + "\nNumeri vincenti: ";
		for(int i = 0; i < 10; i++)
			s += carteVincenti[i] + " ";
		return s;
	}
	
	public int giocatore;
	public int[] carteVincenti;
}
