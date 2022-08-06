package asl;

import java.util.ArrayList;

public class AziendaOspedaliera {

	public AziendaOspedaliera() {
		listaMedici = new ArrayList<>();
	}
	
	public void aggiungiMedico(Medico m) {
		if(listaMedici.size() == 0) {
			listaMedici.add(m);
			return;
		}
		
		for(int i = 0; i < listaMedici.size(); i++) {
			if(m.getCodice() == listaMedici.get(i).getCodice())
				return;
		}
		
		listaMedici.add(m);
	}
	
	public void effettuaVisita(int codice, Paziente p) {
		for(int i =0; i < listaMedici.size(); i++) {
			if(codice == listaMedici.get(i).getCodice()) {
				if(listaMedici.get(i).getVisite() >= 500)
					return;
				listaMedici.get(i).nuovaVisita(p);
			}
		}
	}
	
	public Medico medicoMaxVisite() {
		Medico maximum = listaMedici.get(0);
		for(Medico m: listaMedici) {
			if(maximum.getVisite() < m.getVisite())
				maximum = m;
		}
		return maximum;
	}
	
	public Medico getMedico(int i) {
		return listaMedici.get(i);
	}
	
	public void opera(int codice, Paziente p) {
		MedicoSpecialista m;
		for(int i = 0; i < listaMedici.size(); i++) {
			if(listaMedici.get(i).getCodice() == codice && (listaMedici.get(i) instanceof MedicoSpecialista)) {
				m = (MedicoSpecialista) listaMedici.get(i);
				m.operazionePaziente(p);
			}
		}
	}
	
	private ArrayList<Medico> listaMedici;
}
