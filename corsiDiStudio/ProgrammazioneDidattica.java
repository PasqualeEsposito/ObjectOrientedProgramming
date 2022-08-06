package corsiDiStudio;

import java.util.ArrayList;

public class ProgrammazioneDidattica {

	public ProgrammazioneDidattica(String nome, int oreMinime, int oreMassime) {
		this.nome = nome;
		this.oreMinime = oreMinime;
		this.oreMassime = oreMassime;
		listaCorsi = new ArrayList<>();
	}
	
	public void aggiungiCorso(Corso c) {
		for(Corso x: listaCorsi)
			if(x.getNome().equalsIgnoreCase(c.getNome()))
				return;
		listaCorsi.add(c);
	}
	
	public void cancellaCorso(String nome) {
		for(int i = 0; i < listaCorsi.size(); i++)
			if(listaCorsi.get(i).getNome().equalsIgnoreCase(nome))
				listaCorsi.remove(i);
	}
	
	public boolean verifica() {
		int totale = 0;
		for(int i = 0; i < listaCorsi.size(); i++)
			totale += listaCorsi.get(i).dammiOreTotali();

		if(totale >= oreMinime && totale <= oreMassime)
			return true;
		return false;
	}
	
	public int calcolaCosto() {
		int totale = 0;
		for(Corso c: listaCorsi)
			totale += c.calcolaCosto();
		return totale;
	}
	
	public int calcolaCFU() {
		int totale = 0;
		for(Corso c: listaCorsi)
			totale += c.dammiNumeroCFU();
		return totale;
	}
	
	public String toString() {
		String s = "Programmazione didattica di " + nome + "\n";
		for(Corso c: listaCorsi)
			s += c.toString() + "\n";
		return s;
	}
	
	private String nome;
	ArrayList<Corso> listaCorsi;
	private int oreMinime;
	private int oreMassime;
}
