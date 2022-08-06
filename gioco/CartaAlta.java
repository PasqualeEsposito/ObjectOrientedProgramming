package gioco;

public class CartaAlta extends Gioco {

	public CartaAlta(int costo) {
		super(costo);
		carteGiocatore = new int[2];
		carteVincenti = new int[2];
		for(int i = 0; i < 2; i++) {
			carteVincenti[i] = randomNumber(10) + 1;
			carteGiocatore[i] = randomNumber(10) + 1;
		}
	}
	
	public boolean gioca() {
		for(int i = 0; i < 2; i++)
			if(carteGiocatore[i] <= carteVincenti[i])
				return false;
		return true;
	}
	
	public int dammiVincita() {
		return getCosto() * 5;
	}
	
	public String toString() {
		String s = "Numeri giocatore: " + carteGiocatore[0] + " " +  carteGiocatore[1] + "\n";
		s += "Carte banco: " + carteVincenti[0] + " " + carteVincenti[1];
		return s;
	}
	
	private int[] carteGiocatore;
	private int[] carteVincenti;
}
