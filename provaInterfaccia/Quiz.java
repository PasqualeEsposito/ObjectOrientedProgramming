package provaInterfaccia;

public class Quiz implements Measurable{
	
	public Quiz(double voto, String punteggio) {
		this.voto = voto;
		this.punteggio = punteggio;
	}
	
	public double getMeasure() {
		return voto;
	}
	
	public String getPunteggio() {
		return punteggio;
	}
	
	private double voto;
	private String punteggio;
}
