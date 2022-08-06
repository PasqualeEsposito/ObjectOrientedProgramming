package venditaSupermercato;

import java.util.ArrayList;

public class Supermercato {
	
	public Supermercato() {
		listaProdotti = new ArrayList<>();
	}
	
	public void aggiungiProdotto(Prodotto p) {
		for(int i = 0; i < listaProdotti.size(); i++) {
			if(listaProdotti.get(i).compareTo(p) > 0)
				listaProdotti.add(i, p);
		}
	}
	
	public String daiTipoProdotto(int i) {
		if(i >= listaProdotti.size())
			return "";
		return listaProdotti.get(i).getTipo();
	}
	
	public Prodotto getMinimo() {
		if(listaProdotti.size() == 0)
			return null;
		Prodotto p = listaProdotti.get(0);
		for(Prodotto x: listaProdotti) 
			if(p.getPrice() > x.getPrice())
				p = x;
		return p;
	}
	
	public Prodotto getMassimo() {
		if(listaProdotti.size() == 0)
			return null;
		Prodotto p = listaProdotti.get(0);
		for(Prodotto x: listaProdotti) 
			if(p.getPrice() < x.getPrice())
				p = x;
		return p;
	}
	
	public ArrayList<Prodotto> cerca(String marca) {
		if(listaProdotti.size() == 0)
			return null;
		ArrayList<Prodotto> lista = new ArrayList<>();
		for(Prodotto p: listaProdotti)
			if(p.getMarca().equalsIgnoreCase(marca))
				lista.add(p);
		return lista;
	}
	
	private ArrayList<Prodotto> listaProdotti;
}
