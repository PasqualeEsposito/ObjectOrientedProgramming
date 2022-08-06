package corsiDiStudio;

public class CorsoMagistrale extends Corso {
	public CorsoMagistrale(String nome, String docente, int oreLezioni, String[] indirizziDiStudio) {
		super(nome, docente, oreLezioni);
		this.indirizziDiStudio = indirizziDiStudio;
	}
	
	public String[] getListaIndirizzi() {
		return indirizziDiStudio;
	}
	
	public int calcolaCosto() {
		return super.calcolaCosto();
	}
	
	private String[] indirizziDiStudio;
}
