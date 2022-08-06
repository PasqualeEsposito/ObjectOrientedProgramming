package contenitore;

public class Contenitore implements Cloneable {

	public Contenitore(String nome, int codice, float prezzo, int capienza) {
		this.nome = nome;
		this.codice = codice;
		this.prezzo = prezzo;
		this.capienza = capienza;
	}
	
	public String toString() {
		return getClass().getName() + " [Nome: " + nome + "][Codice: " + codice + "][Prezzo: " + prezzo + "][Capienza: " + capienza
				+ "]";
	}
	
	public int getCodice() {
		return codice;
	}
	
	public String getNome() {
		return nome;
	}
	
	public boolean equals(Object c) {
		if(c instanceof Contenitore) {
			return ((Contenitore) c).getCodice() == codice;
		}
		return false;
	}
	
	public Object clone(){
		try {
			return super.clone();
		}
		catch (CloneNotSupportedException e) {
			return null;
		}
	}
	
	private String nome;
	private int codice;
	private float prezzo;
	private float capienza;
}
