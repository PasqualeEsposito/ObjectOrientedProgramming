package venditaSupermercato;

import java.util.GregorianCalendar;

public class Alimentare extends Prodotto{

	public Alimentare(int codice, String descrizione, String marca, double prezzo, int quantità, GregorianCalendar dataScadenza,
			double peso) {
		super(codice, descrizione, marca, prezzo, quantità);
		this.dataScadenza = dataScadenza;
		this.peso = peso;
	}
	
	public boolean èScaduto() {
		GregorianCalendar attuale = new GregorianCalendar();
		long millis1 = dataScadenza.getTimeInMillis();
		long millis2 = attuale.getTimeInMillis();
		long diff = millis1 - millis2;
		if(diff <= 0)
			return true;
		return false;
	}
	
	public boolean acquista(int p) {
		return super.acquista(p);
	}
	
	public String toString() {
		return super.toString() + "[Data scadenza: " + (dataScadenza.getTimeInMillis())/(24*60*60*1000) + "][Peso: " + peso;
	}
	
	private GregorianCalendar dataScadenza;
	private double peso;
}
