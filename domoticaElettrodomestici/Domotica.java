package domoticaElettrodomestici;

import java.util.ArrayList;

public class Domotica {
	
	public Domotica() {
		lista = new ArrayList<>();
	}
	
	public void aggiungiElettrodomestico(Elettrodomestico e) {
		lista.add(e);
	}
	
	public String eseguiProgramma(int i, int j) {
		if(i >= lista.size())
			return "Elettrodomestico non esistente";
		if(!lista.get(i).getStato())
			lista.get(i).acceso();
		return lista.get(i).play(j);
	}
	
	public void stop() {
		for(Elettrodomestico e: lista)
			e.stop();
	}
	
	public String toString() {
		String s = "";
		for(Elettrodomestico e: lista)
			s += e.toString() + "\n";
		return s;
	}
	
	private ArrayList<Elettrodomestico> lista;
}
