package preappello2019;

import java.io.Serializable;
import java.util.ArrayList;

public class Ordinazione implements Serializable {

	public Ordinazione() {
		list = new ArrayList<>();
	}
	
	public Ordinazione(Panino p) {
		list = new ArrayList<>();
		list.add(p);
	}
	
	public Ordinazione(ArrayList<Panino> p) {
		list = p;
	}
	
	public void aggiungiPanino(Panino p) {
		list.add(p);
	}
	
	public double calcolaCosto() {
		double costo = 0;
		for(Panino p: list)
			costo += p.calcolaCosto();
		return costo;
	}
	
	public String toString() {
		String s = "";
		for(Panino p: list)
			if(p.getClass().getName().compareTo("preappello2019.Vegano") == 0)
				s += "Vegano\n" + p.toString() + "\n";
		for(Panino p: list)
			if(p.getClass().getName().compareTo("preappello2019.Vegetariano") == 0)
				s += "Vegetariano\n" + p.toString() + "\n";
		for(Panino p: list)
			if(p.getClass().getName().compareTo("preappello2019.Onnivoro") == 0)
				s += "Onnivoro\n" + p.toString() + "\n";
		return s;
	}

	private ArrayList<Panino> list;
	private static final long serialVersionUID = -5511048862724678883L;
}
