package contenitore;

public class Cubici extends Contenitore implements Cloneable {

	public Cubici(String nome, int codice, float prezzo, int capienza, float lato) {
		super(nome, codice, prezzo, capienza);
		this.lato = lato;
	}
	
	public String toString() {
		return super.toString() + "[Lato: " + lato + "]";
	}
	
	public float getLato() {
		return lato;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Cubici) {
			Cubici c = (Cubici) obj;
			if(super.equals(c) && c.getLato() == lato)
				return true;
		}
		return false;
	}
	
	public Object clone() {
		Cubici c = (Cubici) super.clone();
		c.lato = lato;
		return c;
	}
	
	private float lato;
}
