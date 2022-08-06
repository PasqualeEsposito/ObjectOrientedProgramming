package primoAppello2018;

import java.util.ArrayList;

public class SistemaBiometrico {
	
	public SistemaBiometrico () {
		list = new ArrayList<>();
	}
	
	public void aggiungiBiometria (Biometria b) {
		list.add(b);
	}
	
	public String daiTipoBiometria (int i) {
		if(list.size() < i)
			return "";
		return list.get(i).getTipo();
	}
	
	public Biometria getVicino (Biometria b) throws WrongTypeException {
		int length;
		if(b.getTipo() == "Volto")
			length = 10;
		else
			length = 6;
		if(length == 6) {
			double num = 1000000;
			Iride i = (Iride) b;
			for(Biometria bio: list)
				if(bio.similarità(i) < num) {
						num = bio.similarità(i);
						i = (Iride) bio;
				}
			return i;
		}
		else {
			double num = 1000000;
			Volto v = (Volto) b;
			for(Biometria bio: list)
				if(bio.similarità(v) < num) {
					num = bio.similarità(v);
					v = (Volto) bio;
				}
			return v;
		}
	}
	
	public boolean verificaBiometria (String code) {
		int length = code.length();
		if(length == 6) {
			for(Biometria b: list)
				if(code.compareTo(b.getCode()) == 0)
					return true;
			return false;
		}
		for(Biometria b: list)
			if(code.compareTo(b.getCode()) == 0)
				return true;
		return false;
	}
	
	public ArrayList<Biometria> cerca (String tipo) throws WrongTypeException {
		ArrayList<Biometria> lista = new ArrayList<>();
		
		for(Biometria b: list)
			if(b.getTipo().compareTo(tipo) == 0)
				lista.add(b);
		if(lista.size() == 0) throw new WrongTypeException("Tipo non corrisponde a nessun tipo nel SistemaBiometrico");
		return lista;
	}
	
	private ArrayList<Biometria> list;
}
