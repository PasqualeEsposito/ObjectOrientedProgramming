package preappello2018;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class SlittaDiBabboNatale {
	
	public SlittaDiBabboNatale(int peso) {
		list = new ArrayList<>();
		this.peso = peso;
		pesoDisp = 1000;
	}
	
	public void aggiungiRegalo(Regalo r) throws PesoMaxSuperatoException {
		if(pesoDisp < r.getPeso())
			throw new PesoMaxSuperatoException();
		else
			pesoDisp -= r.getPeso();
		list.add(r);
	}
	
	public int calcolaCosto() {
		int costo = 0;
		for(Regalo r: list)
			costo += r.calcolaCosto();
		return costo;
	}
	
	public String spedisci() {
		String s = "";
		GregorianCalendar g = new GregorianCalendar();
		int giorno = g.get(GregorianCalendar.DAY_OF_MONTH);
		int mese = g.get(GregorianCalendar.MONTH);
		int anno = g.get(GregorianCalendar.YEAR);
		for(Regalo r: list)
			if(r.getRegione().compareTo("Nord") == 0) {
				r.insertData(g);
				s += r.toString() + "\n";
			}
		
		for(Regalo r: list)
			if(r.getRegione().compareTo("Centro") == 0) {
				r.insertData(new GregorianCalendar(giorno + 1, mese, anno));
				s += r.toString() + "\n";
			}
		
		for(Regalo r: list)
			if(r.getRegione().compareTo("Sud") == 0) {
				r.insertData(new GregorianCalendar(giorno + 2, mese, anno));
				s += r.toString() + "\n";
			}
		
		return s;
	}
	
	public int getPeso() {
		return peso;
	}
	
	private ArrayList<Regalo> list;
	private int peso;
	private int pesoDisp;
}
