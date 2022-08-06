package concessionario;

public class Automobili {
	public Automobili (String marca, String nome, String targa, float capacità, float percorrenza) {
		Marca = marca;
		Nome = nome;
		Targa = targa;
		Capacità = capacità;
		Percorrenza = percorrenza;
	}
	
	public float CalcolaAutonomia () {
		float autonomia = Percorrenza / Capacità;
		return autonomia;
	}
	
	public void Informazioni () {
		System.out.println("Marca: " + Marca);
		System.out.println("Nome: " + Nome);
		System.out.println("Targa: " + Targa);
		System.out.println("Capacità: " + Capacità);
		System.out.println("Percorrenza: " + Percorrenza);
		System.out.println("Autonomia: " + CalcolaAutonomia());
	}
	
	private String Marca;
	private String Nome;
	private String Targa;
	private float Capacità;
	private float Percorrenza;
}
