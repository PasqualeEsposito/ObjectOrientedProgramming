package PrimaIntercorso2019;

public class LampadinaRGB extends DispositivoIoT {

	public LampadinaRGB(String colore) {
		super(0.1);
		this.colore = colore;
	}
	
	public String toString() {
		return super.toString() + "[Colore: " + colore + "]";
	}
	
	private String colore;
}
