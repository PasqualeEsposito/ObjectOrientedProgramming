package CasinòGiocatore;

public class Giocatore {
	public Giocatore() {
		conto = 1000;
	}
	
	public double getConto() {
		return conto;
	}
	
	public void incrementa(double scommessa) {
		conto += scommessa*5;
	}
	
	public void decrementa(double scommessa) {
		conto -= 5*scommessa;
	}
	
	public double conto;
}
