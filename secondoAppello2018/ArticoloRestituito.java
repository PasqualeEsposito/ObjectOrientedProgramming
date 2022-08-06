package secondoAppello2018;

public class ArticoloRestituito extends Articolo implements Cloneable {

	public ArticoloRestituito(String nome, int codice, double prezzo, String provenienza, String data, String motivo) {
		super(nome, codice, prezzo, provenienza);
		this.data = data;
		this.motivo = motivo;
	}
	
	public double getPrezzo() {
		if(motivo.compareTo("danneggiato") == 0)
			return 0;
		return super.getPrezzo();
	}
	
	public String toString() {
		return super.toString() + "[Data: " + data + "][Motivo: " + motivo + "]";
	}
	
	public boolean equals(Object x) {
		return super.equals(x);
	}
	
	public Object clone() {
		ArticoloRestituito x = (ArticoloRestituito) super.clone();
		x.data = data;
		x.motivo = motivo;
		return (Object) x;
	}
	
	private String data;
	private String motivo;
}
