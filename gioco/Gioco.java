package gioco;

import java.util.Random;

public abstract class Gioco {

	public Gioco(int costo) {
		r = new Random();
		this.costo = costo;
	}
	
	public int randomNumber(int numero) {
		return r.nextInt(numero);
	}
	
	public int getCosto() {
		return costo;
	}
	
	public abstract boolean gioca();
	public abstract int dammiVincita();
	
	private Random r;
	private int costo;
}
