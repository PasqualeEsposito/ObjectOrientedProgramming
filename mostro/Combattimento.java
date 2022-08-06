package mostro;

import java.util.ArrayList;

public class Combattimento {

	public Combattimento() {
		listaMostri = new ArrayList<>();
	}
	
	public void aggiungiMostro(Mostro m) {
		listaMostri.add(m);
	}
	
	public void rimuovi() {
		for(int i = 0; i < listaMostri.size(); i++) {
			if(listaMostri.get(i).getVitalità() <= 0)
				listaMostri.remove(i);
		}
	}
	
	public void combatti(int i, int j) {
		listaMostri.get(i).attacca(listaMostri.get(j));
	}
	
	public String toString() {
		String s = "";
		for(int i = 0; i < listaMostri.size(); i++)
			s = listaMostri.get(i).toString() + "\n";
		return s;
	}
	
	private ArrayList<Mostro> listaMostri;
}
