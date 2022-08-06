package corsiDiStudio;

public class CorsoDottorato extends Corso {

	public CorsoDottorato(String nome, String docente, String lingua, int numeroOre) {
		super(nome, docente, numeroOre);
		this.lingua = lingua;
	}
	
	public int dammiNumeroCFU() {
		return super.dammiNumeroCFU()*2;
	}
	
	public int calcolaCosto() {
		if(lingua.equalsIgnoreCase("inglese"))
			return super.calcolaCosto()*2;
		return super.calcolaCosto();
	}
	
	private String lingua;
}
