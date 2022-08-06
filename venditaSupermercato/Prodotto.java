package venditaSupermercato;

import java.util.GregorianCalendar;

public class Prodotto {
	
	public Prodotto(int codice, String descrizione, String marca, double prezzo, int quantità) {
		this.codice = codice;
		this.descrizione = descrizione;
		this.marca = marca;
		this.prezzo = prezzo;
		this.quantità = quantità;
		this.inOfferta = false;
		this.dataScadenzaOfferta = new GregorianCalendar();
		this.percentualeOfferta = 100;
	}
	
	public void mettiInOfferta(double p, GregorianCalendar g) {
		inOfferta = true;
		prezzo = prezzo/100*(100-p);
		dataScadenzaOfferta = g;
	}
	
	public void controllaOfferta() {
		long millis1 = dataScadenzaOfferta.getTimeInMillis();
		GregorianCalendar g = new GregorianCalendar();
		long millis2 = g.getTimeInMillis();
		long diff = millis1 - millis2;
		if(diff <= 0) {
			inOfferta = false;
			prezzo = (prezzo/(100-percentualeOfferta))*100;
		}
	}
	
	public String toString() {
		return "[Codice: " + codice + "][Descrizione: " + descrizione + "][Marca: " + marca + "][Prezzo: " + prezzo
				+ "][In offerta: " + inOfferta + "]";
	}
	
	public int getQuantità() {
		return quantità;
	}
	
	public boolean acquista(int q) {
		if(q <= quantità) {
			quantità -=q;
			return true;
		}
		return false;
	}
	
	public int getCodice() {
		return codice;
	}
	
	public int compareTo(Object o) {
		Prodotto p = (Prodotto) o;
		if(getCodice() < p.getCodice())
			return -1;
		if(getCodice() > p.getCodice())
			return 1;
		return 0;
	}
	
	public String getTipo() {
		return getClass().getName();
	}
	
	public double getPrice() {
		return prezzo;
	}
	
	public String getMarca() {
		return marca;
	}
	
	private int codice;
	private String descrizione;
	private String marca;
	private double prezzo;
	private double percentualeOfferta;
	private int quantità;
	private boolean inOfferta;
	private GregorianCalendar dataScadenzaOfferta;
}
