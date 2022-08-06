package secondoAppello2014;

public class TesserinoPersonale extends Tesserino {
	
	public TesserinoPersonale(int codice, String nome, String cognome, boolean attivo,
			String facoltà, int categoria) {
		super(codice, nome, cognome, attivo);
		this.facoltà = facoltà;
		this.sommaSpesa = 0;
		if(categoria == 0)
			this.categoria = "docente";
		else
			this.categoria = "amministrativo";
	}
	
	public double paga() {
		double costo = 0;
		
		switch(categoria) {
		case "docente":
			costo = 5.60;
			break;
		case "amministrativo":
			costo = 4;
			break;
		}
		sommaSpesa += costo;
		return costo;
	}
	
	public void cambiaCategoria() {
		if(categoria.compareTo("docente") == 0)
			categoria = "amministrativo";
		else
			categoria = "docente";
	}
	
	public String toString() {
		return super.toString() + "[Facoltà: " + facoltà + "][SommaSpesa: " + sommaSpesa + "]";
	}
	
	private String facoltà;
	private double sommaSpesa;
	private String categoria;
}
