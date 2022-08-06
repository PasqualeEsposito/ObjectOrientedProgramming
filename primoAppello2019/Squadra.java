package primoAppello2019;

import java.io.Serializable;

public class Squadra implements Comparable<Object>, Serializable {
	
	public int compareTo(Object arg) {
		Squadra s = (Squadra) arg;
		return punti - s.punti;
	}
	
	public Squadra(String nome, int punti, int partiteGiocate, double budget) {
		this.nome = nome;
		this.giocate = partiteGiocate;
		this.budget = budget;
	}
	
	public String toString() {
		return "[Nome: " + nome + "][Punti: " + punti + "][PartiteGiocate: " + giocate + "][Budget: " + budget + "]";
	}
	
	public boolean equals(Object otherObject) {
		if(!(otherObject instanceof Squadra))
			return false;
		Squadra s = (Squadra) otherObject;
		return nome.compareTo(s.nome) == 0 && punti == s.punti && giocate == s.giocate && budget == s.budget;
	}
	
	public void updatePunti(int n) {
		punti += n;
	}
	
	public void updatePartite() {
		giocate++;
	}
	
	public void updateBudget(double n) {
		budget -= n;
	}
	
	public double getBudget() {
		return budget;
	}
	
	public int getPunti() {
		return punti;
	}
	
	private String nome;
	private int punti;
	private int giocate;
	private double budget;
	private static final long serialVersionUID = -1034150497095857410L;
}
