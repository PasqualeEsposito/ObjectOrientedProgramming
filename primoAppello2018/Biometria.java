package primoAppello2018;

public abstract class Biometria {
	public Biometria(String data, String strumento, String dataAtt) {
		if(Integer.parseInt(data.substring(5)) > Integer.parseInt(dataAtt.substring(5)))
			return;
		dataCreazione = data;
		strumentoMisurazione = strumento;
	}
	
	public String toString() {
		return "[DataCreazione: " + dataCreazione + "][Strumento: " + strumentoMisurazione + "]";
	}
	
	public abstract String getTipo();
	public abstract double similarità(Biometria b) throws WrongTypeException;
	public abstract String getCode();
	
	private String dataCreazione;
	private String strumentoMisurazione;
}
