package countryComparable;

import java.lang.Comparable;

public class Country implements Comparable<Object>{
	
	public Country(String nome, double superficie) {
		this.superficie = superficie;
		this.nome = nome;
	}
	
	public int compareTo(Object obj) {
		Country x = (Country) obj;
		if(superficie == x.superficie)
			return 0;
		else if(superficie > x.superficie)
				return 1;
			else
				return -1;
	}
	
	public String toString() {
		return "Country[Nome: " + nome + "][Superficie: " + superficie + "]";
	}
	
	private double superficie;
	private String nome;
}
