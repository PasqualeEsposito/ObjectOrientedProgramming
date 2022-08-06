package asl;

import java.util.ArrayList;

public class Paziente {

	public Paziente(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
		cure = new ArrayList<>();
	}
	
	public void addCura(String s) {
		cure.add(s);
	}
	
	public void aggiornaInterventi() {
		numeroInterventi++;
	}
	
	public String getCodiceFiscale() {
		return codiceFiscale;
	}
	
	public boolean equals(Object a) {
		if(a == null)
			return false;
		if(getClass().getName() != a.getClass().getName())
			return false;
		Paziente b = (Paziente) a;
		return this.codiceFiscale.equalsIgnoreCase(b.codiceFiscale);
		}
	
	public String toString() {
		String s = "";
		for(int i = 0; i < cure.size(); i++) {
			s += "[Cura " + i + ": " + cure.get(i) + "]";
		}
		return getClass().getName() + ": [CF: "  + codiceFiscale + "][Numero interventi: " + numeroInterventi + "]" + s;
	}
	
	private String codiceFiscale;
	private int numeroInterventi;
	ArrayList<String> cure;
}
