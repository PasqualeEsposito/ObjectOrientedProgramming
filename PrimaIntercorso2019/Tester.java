package PrimaIntercorso2019;

import java.util.Random;

public class Tester {

	public static void main(String[] args) {
		Random r = new Random();
		String[] colore = {"r", "v", "g", "b"}; //4
		String[] materiale = {"A", "B", "C", "D", "E", "F"}; //6

		//Istanzia un sistema domotico con limite di consumo 3kW
		SistemaDomotico d = new SistemaDomotico(3);
		
		//Aggiunge 15 dispositivi con spegnimento programmato
		for(int i = 0; i < 15; i++) {
			switch(r.nextInt(3)) {
				case 0:
					d.aggiungiDispositivo(new LampadinaRGB(colore[r.nextInt(4)]));
					break;
					
				case 1:
					d.aggiungiDispositivo(new Climatizzatore(r.nextDouble()));
					break;
				
				case 2:
					d.aggiungiDispositivo(new Persiana(materiale[r.nextInt(6)]));
					break;
			}
			d.programmaAccensione(i, r.nextInt(24), r.nextInt(60));
			d.programmaSpegnimento(i, r.nextInt(24), r.nextInt(60));	
		}

		//Aggiunge 15 dispositivi con spegnimento automatico
		for(int i = 0; i < 15; i++) {
			switch(r.nextInt(2)) {
				case 0:
					d.aggiungiDispositivo(new Climatizzatore(r.nextDouble()));
					break;
					
				case 1:
					d.aggiungiDispositivo(new Persiana(materiale[r.nextInt(6)]));
					break;
			}
			d.programmaAccensione(i+15, r.nextInt(24), r.nextInt(60));
		}
		
		//Visualizza le informazioni dei dispositivi del sistema
		System.out.println(d.toString());
		
		d.accendiDispositivi(r.nextInt(24), r.nextInt(60));
		
		//Visualizza il consumo totale dei dispositivi accesi
		System.out.println("Consumo totale dispositivi accesi: " + d.controllaConsumo(r.nextInt(24), r.nextInt(60)));
		
		//Visualizza il consumo dei dispositivi ancora accesi
		System.out.println("\n" + d.informazioniDispositiviAccesi());
		
		//d.attivaRisparmioEnergetico(r.nextInt(24), r.nextInt(60));
		
		//System.out.println(d.informazioniDispositiviAccesi());
	}
}
