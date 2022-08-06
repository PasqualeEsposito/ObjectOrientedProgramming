package ufficioTecnicoPro;

import java.util.ArrayList;

public class StudioTecnico {

	public StudioTecnico() {
		lista = new ArrayList<>();
	}
	
	public void aggiungiProfessionista(Professionista p) {
		lista.add(p);
	}
	
	public void effettuaIncontro(int matricola, Cliente c) {
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getMatricola() == matricola)
				if(lista.get(i).getIncontri() >= 100)
					return;
				else {
					lista.get(i).addCliente(c);
					lista.get(i).supportoCliente(c.getCF());
					lista.get(i).updateIncontri();
				}
		}
	}
	
	public Professionista tecnicoMaxIncontri() {
		Professionista max = lista.get(0);
		for(Professionista p: lista)
			if(max.getIncontri() < p.getIncontri())
				max = p;
		return max;
	}
	
	public void effettuaIncontri() {
		for(Professionista p: lista)
			if(p instanceof TecnicoIscrittoAlbo) {
				TecnicoIscrittoAlbo x = (TecnicoIscrittoAlbo) p;
				x.effettuaIncontri();
			}
	}
	
	public String toString() {
		String s = "";
		for(Professionista p: lista)
			s += p.toString() + "\n";
		return s;
	}
	
	private ArrayList<Professionista> lista;
}
