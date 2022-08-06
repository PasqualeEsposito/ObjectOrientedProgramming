package corsiDiStudio;

public abstract class Corso {

	public Corso(String nome, String docente, int oreLezioniFrontali) {
		this.nome = nome;
		this.docente = docente;
		this.oreLezioniFrontali = oreLezioniFrontali;
	}
	
	public int getOreLezioni() {
		return oreLezioniFrontali;
	}
	
	public int calcolaCosto() {
		return oreLezioniFrontali*50;
	}
	
	public int dammiNumeroCFU() {
		return oreLezioniFrontali/8;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int dammiOreTotali() {
		return oreLezioniFrontali;
	}
	
	public String getDocente() {
		return docente;
	}
	
	public String toString() {
		return getClass().getName() + ": [Nome: " + nome + "][Costo: " + calcolaCosto() + "€][Docente: " + docente + "]";
	}
	
	private String nome;
	private String docente;
	private int oreLezioniFrontali;
}
