package PrimaIntercorso2019;

public class Climatizzatore extends DispositivoIoT {

	public Climatizzatore(double temperatura) {
		super(0.3);
		this.temperatura = temperatura;
	}
	
	public void accendiDispositivo(int ora, int minuto) {
		super.accendiDispositivo(ora, minuto);
		super.spegniDispositivo((ora + 2)%24, minuto);
	}
	
	public String toString() {
		return super.toString() + "[Temperatura: " + temperatura + "]";
	}
	
	
	private double temperatura;
}
