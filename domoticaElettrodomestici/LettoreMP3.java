package domoticaElettrodomestici;

public class LettoreMP3 extends Elettrodomestico {

	public LettoreMP3(String nome, String marca) {
		super(nome, marca);
		pos = 0;
		canzoni = null;
	}
	
	public String start() {
		acceso();
		return informazioni();
	}
	
	public void load(String[] canzoni) {
		this.canzoni = canzoni;
	}
	
	public String play(int i) {
		if(!getStato())
			return "Lettore MP3 spento";
		if(i > canzoni.length)
			return "Canzone non esistente";
		updateProgrammi();
		return next(i);
	}
	
	public String next(int i) {
		if(pos == i) {
			if(pos == canzoni.length) {
				pos = 0;
				return "Canzone in riproduzione: " + canzoni[pos];
			}
			return "Canzone in riproduzione: " + canzoni[++pos];
		}
		for(; pos < canzoni.length; pos++)
			if(pos == i)
				return "Canzone in riproduzione: " + canzoni[pos];
		if(pos == canzoni.length)
			pos = 0;
		return next(i);
	}
	
	public void stop() {
		spento();
	}
	
	public String informazioni() {
		return getClass().getName() + " [Nome: " + getNome() + "][Canzone in riproduzione: " + canzoni[pos] + "]";
	}
	
	public String toString() {
		return super.toString();
	}
	
	private String[] canzoni;
	private int pos;
}
