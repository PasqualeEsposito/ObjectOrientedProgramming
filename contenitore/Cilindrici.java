package contenitore;

public class Cilindrici extends Contenitore implements Cloneable {
	public Cilindrici(String nome, int codice, float prezzo, int capienza, float raggio, float altezza) {
		super(nome, codice, prezzo, capienza);
		this.raggio = raggio;
		this.altezza = altezza;
	}
	
	public String toString() {
		return super.toString() + "[Raggio: " + raggio + "][Altezza: " + altezza + "]";
	}
	
	public float getRaggio() {
		return raggio;
	}
	
	public float getAltezza() {
		return altezza;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Cilindrici) {
			Cilindrici c = (Cilindrici) obj;
			if(super.equals(c) && c.getRaggio() == raggio && c.getAltezza() == altezza)
				return true;
		}
		return false;
	}
	
	public Object clone() {
		Cilindrici c = (Cilindrici) super.clone();
		c.raggio = raggio;
		c.altezza = altezza;
		return c;
	}
	
	private float raggio;
	private float altezza;
}
