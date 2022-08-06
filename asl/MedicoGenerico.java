package asl;

import java.util.ArrayList;
import java.util.Random;

public class MedicoGenerico extends Medico{
	
	public MedicoGenerico(int codice, String nome, String cognome) {
		super(codice, nome, cognome);
		listaPazienti = new ArrayList<>();
	}
	
	public void nuovaVisita(Paziente p) {
		Random num = new Random();
		for(int i = 0; i < listaPazienti.size(); i++) {
			if(listaPazienti.get(i).equals(p)) {
				return;
			}
		}
		
		p.addCura(cure[num.nextInt(5)]);
		aggiornaVisite();
	}
	
	public String toString() {
		return super.toString(); 
	}
	
	public void aggiungiPaziente(Paziente p) {
		listaPazienti.add(p);
	}
	
	private ArrayList<Paziente> listaPazienti;
	private final static String[] cure = {"Antibiotico", "Riposo", "Cortisone", "Ricovero", "Riabilitazione", "Intervento"};
}
