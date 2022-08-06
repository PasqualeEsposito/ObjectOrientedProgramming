package preappello2018;

public class RegaloAdulto extends Regalo {
	public RegaloAdulto(int peso, String regione, String mittente) {
		super(peso, regione);
		this.mittente = mittente;
	}
	
	public String toString() {
		return super.toString() + "[Mittente: " + mittente + "]";
	}
	
	private String mittente;
}
