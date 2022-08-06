package secondoAppello2018;

public class Articolo implements Cloneable {

	public Articolo(String nome, int codice, double prezzo, String provenienza) {
		this.nome = nome;
		this.codice = codice;
		this.prezzo = prezzo;
		this.provenienza = provenienza;
	}
	
	public int getCodice() {
		return codice;
	}
	
	public double getPrezzo() {
		return prezzo;
	}
	
	public String getProvenienza() {
		return provenienza;
	}
	
	public void changePrezzo(double newPrice) {
		prezzo = newPrice;
	}
	
	public String toString() {
		return "[Nome: " + nome + "][Codice: " + codice + "][Prezzo: " + prezzo + "][Provenienza: " + provenienza + "]";
	}
	
	public boolean equals(Object x) {
		if(x instanceof Articolo)
			if(x.getClass() == getClass()) {
				Articolo y = (Articolo) x;
				return y.getCodice() == getCodice();
			}
		return false;
	}
	
	public Object clone() {
		try {
			return super.clone();
		}
		catch(CloneNotSupportedException e) {
			return null;
		}
	}
	
	 private String nome;
	 private int codice;
	 private double prezzo;
	 private String provenienza;
}
