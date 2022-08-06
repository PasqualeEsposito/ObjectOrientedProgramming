package PrimaIntercorso2019;

public abstract class DispositivoIoT {

	public DispositivoIoT(double consumoOrario) {
		this.consumoOrario = consumoOrario;
		stato = false;
		oraSpegnimento = 24;
		minutoSpegnimento = 60;
	}

	public void accendiDispositivo(int ora, int minuto) {
		oraAccensione = ora;
		minutoAccensione = minuto;
	}
	
	public void spegniDispositivo(int ora, int minuto) {
		oraSpegnimento = ora;
		minutoSpegnimento = minuto;
	}
	
	public int getOraAccensione() {
		return oraAccensione;
	}
	
	public int getOraSpegnimento() {
		return oraSpegnimento;
	}
	
	public int getMinutoAccensione() {
		return minutoAccensione;
	}
	
	public int getMinutoSpegnimento() {
		return minutoSpegnimento;
	}
	
	public void spegni() {
		stato = false;
	}
	
	public void accendi() {
		stato = true;
	}
	
	public String toString() {
		if(oraSpegnimento == 24 && minutoSpegnimento == 60)
			return getClass().getName() + " [OraAccensione: " + oraAccensione + ":" + minutoAccensione + "][Ora spegimento: null][ConsumoOrario: " + consumoOrario + "][Stato: " + stato + "]";
		else
			return getClass().getName() + " [OraAccensione: " + oraAccensione + ":" + minutoAccensione + "][Ora spegnimento: " + oraSpegnimento + ":" + minutoSpegnimento + "][ConsumoOrario: " + consumoOrario + "][Stato: " + stato + "]";
	}
	
	public double getConsumo() {
		return consumoOrario;
	}
	
	public boolean getStato() {
		return stato;
	}
	
	private int oraAccensione;
	private int minutoAccensione;
	private int oraSpegnimento;
	private int minutoSpegnimento;
	private double consumoOrario;
	private boolean stato;
}
