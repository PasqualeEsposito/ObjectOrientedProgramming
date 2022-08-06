package CasinòGiocatore;

import java.util.Scanner;


public class Partita {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Casinò montecarlo = new Casinò();
		Giocatore paolo = new Giocatore();
		boolean verifica;
		double somma;
		int numero;
		String st;
		Dado d = new Dado();
		
		
		do {
			do {
				System.out.print("Quanti euro vuoi scommettere? (0 per uscire): ");
				somma = sc.nextDouble();
				if(somma > 0)
					break;	
			} while(true);
			
			if(somma > paolo.getConto()) {
				System.out.println("Non puoi scommettere " + somma + "€!\nIl tuo saldo è di " + paolo.getConto() + "€.");
				sc.close();
				return;
			}
			
			do {
				System.out.print("Su quale numero scommetti? ");
				numero = sc.nextInt();
				if(numero >= 0 && numero <= 6)
					break;
			} while(true);
			
			verifica = d.check(numero);
			if(verifica) {
				System.out.println("Hai vinto! :)");
				paolo.incrementa(somma);
				montecarlo.decrementa(somma);
			}
			else {
				System.out.println("Hai perso :(");
				paolo.decrementa(somma);
				montecarlo.incrementa(somma);
			}
			System.out.print("Vuoi continuare a giocare? (Scrivere sì o no): ");
			st = sc.next();
		} while(st.equalsIgnoreCase("sì"));
		
		System.out.println("Il conto rimanente è di " + paolo.getConto() + "€!");
		sc.close();
}


}

