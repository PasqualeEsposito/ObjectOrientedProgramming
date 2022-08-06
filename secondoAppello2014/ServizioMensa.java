package secondoAppello2014;

import java.util.ArrayList;

public class ServizioMensa {

	public ServizioMensa() {
		list = new ArrayList<>();
		guadagno = 0;
	}
	
	public void aggiungiTesserino(Tesserino t) {
		list.add(t);
	}
	
	public boolean usaTesserino(int code) throws TesserinoScadutoException {
		if(list.size() == 0)
			return false;
		Tesserino tess = null;
		for(Tesserino t: list)
			if(t.getCodice() == code)
				tess = t;
		if(tess == null)
			return false;
		guadagno += tess.paga();
		return true;
	}
	
	public double calcolaCosto() {
		return guadagno;
	}
	
	private ArrayList<Tesserino> list;
	private double guadagno;
}
