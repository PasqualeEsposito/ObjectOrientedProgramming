package purse;

public class Coin {
	public Coin(double unValore, String unNome) {
		nome = unNome;
		valore = unValore;
	}
	
	public String daiNome() {
		return nome;
	}
	
	public double daiValore() {
		return valore;
	}
	
	public boolean equals(Coin moneta) {
		return nome.equals(moneta.daiNome());
	}
	
	public boolean equals2(Coin moneta) {
		return (moneta.daiValore() == valore);
	}
	
	public double getValue() {
		return valore;
	}
	
	private String nome;
	private double valore;
}