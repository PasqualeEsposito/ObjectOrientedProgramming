package PrimaIntercorso2019;

public class Persiana extends DispositivoIoT {

	public Persiana(String materiale) {
		super(0.15);
		this.materiale = materiale;
		super.spegniDispositivo(21, 30);
	}
	
	
	public String toString() {
		return super.toString() + "[Materiale: " + materiale + "]";
	}
	
	private String materiale;
}
