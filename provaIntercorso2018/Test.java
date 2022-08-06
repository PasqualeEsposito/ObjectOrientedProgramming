package provaIntercorso2018;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		Random generatore = new Random();
		Combattimento gioco = new Combattimento();
		for(int i = 0; i < 20; i++) {
			int n = generatore.nextInt(3);
			switch(n) {
				case 0:
					gioco.aggiungiMostro(new MostroDiFuoco("Mostro " + i, generatore.nextInt(11) + 40, generatore.nextInt(31)
							+ 10, generatore.nextInt(10) + 1));
							break;
				case 1:
					gioco.aggiungiMostro(new MostroDiAcqua("Mostro " + i, generatore.nextInt(11) + 40, generatore.nextInt(31)
							+ 10, generatore.nextInt(20) + 1));
							break;
				case 2:
					gioco.aggiungiMostro(new MostroDiPietra("Mostro " + i, generatore.nextInt(11) + 40, generatore.nextInt(31)
							+ 10, generatore.nextInt(30) + 1));
							break;
			}
		}
		
		//System.out.print(gioco.toString() + "\n\n\n");
		
		for(int i = 0; i < 200; i++) {
			int j, k;
			j = generatore.nextInt(19);
			k = generatore.nextInt(19);
			while(j == k)
				j = generatore.nextInt(19);
			gioco.combatti(j, k);
		}
		gioco.rimuovi();
		System.out.print(gioco.toString());
	
	}
	
}
