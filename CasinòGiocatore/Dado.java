package CasinòGiocatore;

import java.util.Random;

public class Dado {
	public Dado() {
		dado = new Random();
	}
	
	public boolean check(int numero) {
		int n = dado.nextInt(6);
		if(n == numero)
			return true;
		return false;
	}
	
	public Random dado;
}
