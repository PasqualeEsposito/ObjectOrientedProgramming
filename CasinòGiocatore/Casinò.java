package CasinòGiocatore;

public class Casinò {
	public Casinò() {
		conto = 100000;
	}
	
	public void decrementa(double scommessa) {
		conto -= 5*scommessa;
	}
	
	public void incrementa(double scommessa) {
		conto += scommessa;
	}
	
	public double conto;
}
