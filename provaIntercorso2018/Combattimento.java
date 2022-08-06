package provaIntercorso2018;

import java.util.ArrayList;

public class Combattimento {

	public Combattimento() {
		listaMostri = new ArrayList<>();
	}
	
	public void aggiungiMostro(Mostro m) {
		listaMostri.add(m);
	}
	
	public void rimuovi() {
		for(int i = listaMostri.size() - 1; i > 0; i--) {
			if(listaMostri.get(i).getVitality() <= 0)
				listaMostri.remove(i);
		}
	}
	
	public void combatti(int i, int j) {
		listaMostri.get(i).attacca(listaMostri.get(j));
	}
	
	public String toString() {
		String s = "";
		for(int i = 0; i < listaMostri.size(); i++) {
			s += listaMostri.get(i).toString();
			s += "\n";
		}
		return s;
	}
	
	private ArrayList<Mostro> listaMostri;
}
