package domoticaElettrodomestici;

public class Lavatrice extends Elettrodomestico {

	public Lavatrice(String nome, String marca) {
		super(nome, marca);
		direzione = true;
		pos = 0;
	}
	
	public String start() {
		acceso();
		return toString() + "[Programma selezionato: " + pos + "]";
	}
	
	public String play(int i) {
		String s = next(i);
		if(i > programmi.length)
			return "Programma non esistente";
		if(s.equalsIgnoreCase("lavatrice spenta"))
			return s;
		updateProgrammi();
		return s;
	}
	
	public String next(int i) {
		if(!getStato())
			return "Lavatrice spenta";
		if(pos == i) {
			if(pos == programmi.length) {
				direzione = false;
				return "Programma selezionato: " + (--pos);
			}
			if(direzione)
				return "Programma selezionato: " + (++pos);
			else
				return "Programma selezionato: " + (--pos);
		}
		
		if(direzione)
			for(; pos < programmi.length; pos++)
				if(pos == i)
					return "Programma selezionato: " + programmi[pos];
		direzione = false;
		if(!direzione)
			for(; pos > 0; pos--)
				if(pos == i)
					return "Programma selezionato: " + programmi[pos];
		direzione = true;
		return next(i);
	}
	
	/*public String next(int i) {
		if(pos == i)
			if(pos == programmi.length)
				return "Programma selezionato: " + (--pos);
			else
				return "Programma selezionato: " + (++pos);
		pos = i;
		return "Programma selezionato: " + (pos);
	}*/
	
	public void stop() {
		spento();
	}
	
	public String toString() {
		return super.toString();
	}
	
	private static final String[] programmi = {"Lana", "Normale", "Seta", "Rapido", "Freddo", "Caldo"};
	private boolean direzione;
	private int pos;
}
