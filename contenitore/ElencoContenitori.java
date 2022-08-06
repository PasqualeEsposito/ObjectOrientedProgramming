package contenitore;

import java.util.ArrayList;
import java.util.Comparator;

public class ElencoContenitori {

	public ElencoContenitori() {
		lista = new ArrayList<>();
	}
	
	public void addContenitore(Contenitore c) {
		lista.add(c);
	}
	
	public Contenitore getMinimo(Comparator<Contenitore> x) {
		Contenitore min = lista.get(0);
		for(Contenitore c: lista) {
			if(x.compare(min, c) > 0)
				min = c;
		}
		return min;
	}
	
	public Contenitore getMassimo(Comparator<Contenitore> x) {
		Contenitore max = lista.get(0);
		for(Contenitore c: lista) {
			if(x.compare(max, c) < 0)
				max = c;
		}
		return max;
	}
	
	public String toString() {
		String s = "";
		for(Contenitore c: lista) {
			s += c.toString() + "\n\n";
		}
		return s;
	}
	
	ArrayList<Contenitore> lista;
}
