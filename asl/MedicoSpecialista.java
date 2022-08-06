package asl;

import java.util.*;

public final class MedicoSpecialista extends Medico{
	
	public MedicoSpecialista(int codice, String cognome, String nome, String specializzazione) {
		super(codice, nome, cognome);
		this.specializzazione = specializzazione;
		listaPazienti = new ArrayList<>();
	}
	
	public void nuovaVisita(Paziente p) {
		listaPazienti.add(p);
		aggiornaVisite();
	}
	
	public void operazionePaziente(Paziente p) {
		int flag = 0;
		int i;
		for(i = 0; i < listaPazienti.size(); i++) {
			if(listaPazienti.get(i).equals(p)) {
				flag = 1;
				break;
			}
		}
		
		if(flag == 1) {
			listaPazienti.get(i).aggiornaInterventi();
			listaPazienti.remove(i);
		}
	}
	
	public String toString() {
		return super.toString() + "[Specializzazione: " + specializzazione + "]";
	}
	
	private String specializzazione;
	private ArrayList<Paziente> listaPazienti;
}

