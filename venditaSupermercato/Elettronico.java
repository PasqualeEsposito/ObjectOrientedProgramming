package venditaSupermercato;


public class Elettronico extends Prodotto{

	public Elettronico(int codice, String descrizione, String marca, double prezzo, int quantità, int garanziaBase,
			double prezzoAnnualeGaranzia) {
		super(codice, descrizione, marca, prezzo, quantità);
		this.garanziaBase = garanziaBase;
		this.prezzoAnnualeGaranzia = prezzoAnnualeGaranzia;
	}
	
	public double calcolaCostoGaranzia(int a) {
		return a*prezzoAnnualeGaranzia;
	}
	
	public boolean acquista(int q) {
		return super.acquista(q);
	}
	
	public int getAnniGaranzia() {
		return garanziaBase;
	}
	
	private int garanziaBase;
	private double prezzoAnnualeGaranzia;
}
