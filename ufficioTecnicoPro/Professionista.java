package ufficioTecnicoPro;

public abstract class Professionista {
	
	public Professionista(int matricola, String cognome, String nome) {
		this.matricola = matricola;
		this.nome = nome;
		this.cognome = cognome;
		numeroIncontri = 0;
	}
	
	public void updateIncontri() {
		numeroIncontri++;
	}
	
	public String toString() {
		return getClass().getName() + " [Matricola: " + matricola + "][Nome: " + nome + "][Cognome: " + cognome + "][# incontri"
				+ " effettuati: " + numeroIncontri + "]";
	}
	
	public int getMatricola() {
		return matricola;
	}
	
	public int getIncontri() {
		return numeroIncontri;
	}
	
	public abstract void addCliente(Cliente c);
	public abstract void supportoCliente(String s);
	
	private int matricola;
	private String nome;
	private String cognome;
	private int numeroIncontri;
}
