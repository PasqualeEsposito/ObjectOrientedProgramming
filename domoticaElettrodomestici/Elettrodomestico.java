package domoticaElettrodomestici;

public abstract class Elettrodomestico {

	public Elettrodomestico(String nome, String marca) {
		this.nome = nome;
		this.marca = marca;
		programmiEseguiti = 0;
		acceso = false;
	}
	
	public String toString() {
		return getClass().getName() + " [Nome: " + nome + "][Marca: " + marca + "][# programmi eseguiti: " + programmiEseguiti + "]";
	}
	
	public void updateProgrammi() {
		programmiEseguiti++;
	}
	
	public boolean getStato() {
		return acceso;
	}
	
	public void acceso() {
		acceso = true;
	}
	
	public void spento() {
		acceso = false;
	}
	
	public String getNome() {
		return nome;
	}
	
	public abstract String play(int i);
	public abstract String next(int i);
	public abstract String start();
	public abstract void stop();
	
	private String nome;
	private String marca;
	private int programmiEseguiti;
	private boolean acceso;
}
