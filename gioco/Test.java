package gioco;

import java.util.Random;

public class Test {
	
	public static void main(String[] args) {
		Random r = new Random();
		Cliente c = new Cliente("Nicola Serra", r.nextInt(51) + 50);
		System.out.println(c.toString() + "\n");
		for(int i = 0; i < 10; i++)
			if(r.nextInt(2) == 0) 
				System.out.println(c.giocaAmbata(new Ambata(50)) + "\n");
			else
				System.out.println(c.giocaCartaAlta(new CartaAlta(10)) + "\n");
		
		System.out.println(c.toString());
	}
}
