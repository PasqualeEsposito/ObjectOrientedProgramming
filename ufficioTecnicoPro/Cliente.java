package ufficioTecnicoPro;

import java.util.ArrayList;

public class Cliente {

	public Cliente(String CF) {
		this.CF = CF;
		numeroRelazioni = 0;
		documenti = new ArrayList<>();
		spese = new ArrayList<>();
	}
	
	public void updateRelazioni() {
		numeroRelazioni++;
	}
	
	public String getCF() {
		return CF;
	}
	
	public boolean compare(String codice) {
		return CF.equalsIgnoreCase(codice);
	}
	
	public void addDocumento(String s) {
		documenti.add(s);
	}
	
	public String toString() {
		return getClass().getName() + " [Codice fiscale: " + CF + "][Numero relazioni: " + numeroRelazioni + "]";
	}
	
	public void addSpese(double d) {
		spese.add(d);
	}
	
	private String CF;
	private int numeroRelazioni;
	private ArrayList<String> documenti;
	private ArrayList<Double> spese;
}
