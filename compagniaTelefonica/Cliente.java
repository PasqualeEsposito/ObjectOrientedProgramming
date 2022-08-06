package compagniaTelefonica;

public class Cliente {

	public Cliente(String nome, String cognome, String indirizzo, int codice, int minutiFasciaPiena, int minutiFasciaRidotta) {
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzo = indirizzo;
		this.codice = codice;
		this.minutiFasciaPiena = minutiFasciaPiena;
		this.minutiFasciaRidotta = minutiFasciaRidotta;
	}
	
	public int getCodice() {
		return codice;
	}
	
	public int getMinutiFasciaPiena() {
		return minutiFasciaPiena;
	}
	
	public int getMinutiFasciaRidotta() {
		return minutiFasciaRidotta;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public String getIndirizzo() {
		return indirizzo;
	}
	
	private String nome;
	private String cognome;
	private String indirizzo;
	private int codice;
	private int minutiFasciaPiena;
	private int minutiFasciaRidotta;
}
