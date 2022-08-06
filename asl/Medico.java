package asl;

public abstract class Medico {

	public Medico(int codice, String nome, String cognome) {
		this.codice = codice;
		this.nome = nome;
		this.cognome = cognome;
		this.numVisite = 0;
	}
	
	
	public void aggiornaVisite() {
		numVisite++;
	}
	
	public String toString() {
		return getClass().getName() + ": [Codice: " + codice + "][Nome: " + nome + "][Cognome: " + cognome +
				"][Numero visite: " + numVisite + "]";
	}
	
	public int getCodice() {
		return codice;
	}
	
	public int getVisite() {
		return numVisite;
	}
	
	public abstract void nuovaVisita(Paziente p);
	
		private int codice;
		private String nome;
		private String cognome;
		private int numVisite;
}
