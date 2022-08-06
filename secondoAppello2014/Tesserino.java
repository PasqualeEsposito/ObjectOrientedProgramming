package secondoAppello2014;

public abstract class Tesserino {
	public Tesserino(int codice, String nome, String cognome, boolean attivo) {
		this.codice = codice;
		this.nome = nome;
		this.cognome = cognome;
		this.attivo = attivo;
	}
	
	public void attiva() {
		if(attivo)
			throw new RuntimeException();
		attivo = false;
	}
	
	public void disattiva() {
		if(!attivo)
			throw new RuntimeException();
		attivo = true;
	}
	
	public int getCodice() {
		return codice;
	}
 	
	public String toString() {
		return "[Codice: " + codice + "][Nome: " + nome + "][Cognome: " + cognome + "][Stato: " + attivo + "]";
	}
	
	public abstract double paga() throws TesserinoScadutoException;
	
	private int codice;
	private String nome;
	private String cognome;
	private boolean attivo;
}
