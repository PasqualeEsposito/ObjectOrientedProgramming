package corsiDiStudio;

public class CorsoTriennale extends Corso {

	public CorsoTriennale(String nome, String docente, int numeroLab, int numeroFront) {
		super(nome, docente, numeroFront);
		this.numeroOreLaboratorio = numeroLab;
	}
	
	public int dammiNumeroCFU() {
		return super.dammiNumeroCFU() + (numeroOreLaboratorio/10);
	}
	
	public int dammiOreTotali() {
		return super.dammiOreTotali() + numeroOreLaboratorio;
	}
	
	public int calcolaCosto() {
		return super.calcolaCosto() + (numeroOreLaboratorio*35);
	}
	
	public String toString() {
		return getClass().getName() + ": [Nome: " + getNome() + "][Costo: " + calcolaCosto() + "][Docente: " + getDocente() + "]";
	}
	
	private int numeroOreLaboratorio;
}
