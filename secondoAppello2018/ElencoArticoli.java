package secondoAppello2018;

import java.util.ArrayList;

public class ElencoArticoli {

	public ElencoArticoli() {
		list = new ArrayList<>();
	}
	
	public void aggiugiArticolo(Articolo a) {
		list.add(a);
	}
	
	public Articolo getArticolo(double x) {
		if(list.size() == 0)
				return null;
		Articolo art = list.get(0);
		double diff = Math.abs(art.getPrezzo() - x);
		for(Articolo a: list)
			if(Math.abs(a.getPrezzo() - art.getPrezzo()) < diff) {
				diff = Math.abs(a.getPrezzo() - art.getPrezzo());
				art = a;
			}
		return art;
	}
	
	public ArrayList<Articolo> cerca(String p) {
		ArrayList<Articolo> lista = new ArrayList<>();
		for(Articolo a: list)
			if(a.getProvenienza().compareTo(p) == 0)
				lista.add(a);
		return lista;
	}
	
	public double dammiTotale() {
		double totale = 0;
		for(Articolo a: list)
			totale += a.getPrezzo();
		return totale;
	}

	private ArrayList<Articolo> list;
}
