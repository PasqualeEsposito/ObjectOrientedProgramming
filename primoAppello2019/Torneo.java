package primoAppello2019;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;

public class Torneo implements Serializable {
	
	class ComparaPunteggio implements Comparator<Object> {
		public int compare(Object arg0, Object arg1) {
			Squadra a = (Squadra) arg0;
			Squadra b = (Squadra) arg1;
			return b.getPunti() - a.getPunti();
		}
	}
	
	public Torneo(String nome) {
		this.nome = nome;
		list = new ArrayList<>();
	}
	
	public Torneo(String nome, ArrayList<Squadra> list) {
		this.nome = nome;
		this.list = list;
	}
	
	public void addSquadra(Squadra s) {
		list.add(s);
	}
	
	public void giocaPartita(Squadra a, Squadra b) throws BadDataException, SameElementException, NotEnoughMoneyException, TeamNotFoundException {
		if(!(list.contains(a) && list.contains(b)))
				throw new TeamNotFoundException();
		new PartitaCalcio(a, b, "17-01-2010");
		new PartitaBasket(a, b, "18-01-2010");
	}
	
	public String getClassifica() {
		String s = "Torneo " + nome + "\n\n";
		list.sort(new ComparaPunteggio());
		for(Squadra sq: list)
			s += sq.toString() + "\n";
		return s;
	}
	
	public void giocaTuttePartite() throws BadDataException, SameElementException, NotEnoughMoneyException {
		for(int i = 0; i < list.size(); i++)
			for(int j = i + 1; j < list.size(); j++) {
				new PartitaCalcio(list.get(i), list.get(j), "25-09-2018");
				new PartitaBasket(list.get(i), list.get(j), "25-09-2018");
			}
	}
	
	public String getNome() {
		return nome;
	}
	
	private String nome;
	private ArrayList<Squadra> list;
	private static final long serialVersionUID = -1034150497095857410L;
}






