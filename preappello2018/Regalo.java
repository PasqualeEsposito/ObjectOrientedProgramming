package preappello2018;

import java.util.GregorianCalendar;

public abstract class Regalo {
	public Regalo(int peso, String regione) {
		this.peso = peso;
		this.regione = regione;
	}
	
	public String toString() {
		return "[Data: " + data.getGregorianChange().toString() + "][Peso: " + peso + "][Regione: " + regione + "]";
	}
	
	public int calcolaCosto() {
		if(regione.compareTo("Nord") == 0)
			return 10; 
		if(regione.compareTo("Centro") == 0)
			return 15;
		return 20;
	}
	
	public int getPeso() {
		return peso;
	}
	
	public String getRegione() {
		return regione;
	}
	
	public void insertData(GregorianCalendar data) {
		this.data = data;
	}
	
	private GregorianCalendar data;
	private int peso;
	private String regione;
	
}
