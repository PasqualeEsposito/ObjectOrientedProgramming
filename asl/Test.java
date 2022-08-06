package asl;

import java.util.ArrayList;
import java.util.Random;


public class Test {

	public static void main(String[] args) {
		ArrayList<Paziente> listaPazienti = new ArrayList<>();
		listaPazienti.add(new Paziente("Pippo Cattaneo"));
		listaPazienti.add(new Paziente("Vincenzo Deufemia"));
		listaPazienti.add(new Paziente("Monica Sebillo"));
		listaPazienti.add(new Paziente("Adele Rescigno"));
		listaPazienti.add(new Paziente("Elmo Benedetto"));
		listaPazienti.add(new Paziente("Michele Deufemia"));
		listaPazienti.add(new Paziente("Costantino Delizia"));
		listaPazienti.add(new Paziente("Marcella Anselmo"));
		listaPazienti.add(new Paziente("Nicola Serra"));
		listaPazienti.add(new Paziente("Antonio Russo"));
		
		AziendaOspedaliera LoretoMare = new AziendaOspedaliera();
		LoretoMare.aggiungiMedico(new MedicoGenerico(1, "Antonio", "Montefusco"));
		LoretoMare.aggiungiMedico(new MedicoGenerico(2, "Armando", "Rippa"));
		LoretoMare.aggiungiMedico(new MedicoGenerico(3, "Pasquale", "Scozzarella"));
		LoretoMare.aggiungiMedico(new MedicoGenerico(4, "Felice", "Di Pace"));
		LoretoMare.aggiungiMedico(new MedicoGenerico(5, "Armando", "Rippa"));
		LoretoMare.aggiungiMedico(new MedicoSpecialista(6, "Andrea", "Terlizzi", "Urologo"));
		LoretoMare.aggiungiMedico(new MedicoSpecialista(7, "Francesco", "Donna", "Psichiatra"));
		LoretoMare.aggiungiMedico(new MedicoSpecialista(8, "Franco", "Cirillo", "Fisiologo"));
		LoretoMare.aggiungiMedico(new MedicoSpecialista(9, "Alessandro", "Ricchetti", "Dermatologo"));
		LoretoMare.aggiungiMedico(new MedicoSpecialista(10, "Giuseppe", "Fortunato", "Ginecologo"));
		
		Random r = new Random();
		
		for(int i = 0; i < 20; i++)
			LoretoMare.effettuaVisita(r.nextInt(10) + 1, listaPazienti.get(r.nextInt(10)));
		
		System.out.println("Medico con maggiori visite:\n" + LoretoMare.medicoMaxVisite().toString() + "\n\n");
		for(int i = 0; i < 10; i++)
			for(int j = 0; j < 10; j++) {
				LoretoMare.opera(i, listaPazienti.get(j));
			}
		
		for(int i = 0; i < listaPazienti.size(); i++)
			System.out.println("Paziente " + i + ": " + listaPazienti.get(i));
	}
}
