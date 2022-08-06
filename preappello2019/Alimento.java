package preappello2019;

import java.io.Serializable;

public class Alimento implements Serializable {

	public Alimento(String nome, double costo, String tipo, int step) {
		this.nome = nome;
		this.costo = costo;
		this.tipo = tipo;
		this.step = step;
	}
	
	public int getStep() {
		return step;
	}
	
	public double getCosto() {
		return costo;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public String toString() {
		return "[Nome: " + nome + "][Costo: " + costo + "][Tipo: " + tipo + "][Step: " + step + "]";
	}
	
	private String nome;
	private double costo;
	private String tipo;
	private int step;
	private static final long serialVersionUID = 1549917986434747096L;
}
