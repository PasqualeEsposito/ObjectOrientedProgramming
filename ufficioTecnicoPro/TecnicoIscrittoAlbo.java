package ufficioTecnicoPro;

import java.util.ArrayList;

public class TecnicoIscrittoAlbo extends Professionista {
	
	public TecnicoIscrittoAlbo(int matricola, String nome, String cognome, String specializzazione) {
		super(matricola, cognome, nome);
		this.specializzazione = specializzazione;
		lista = new ArrayList<>();
	}
	
	public void addCliente(Cliente c) {
		lista.add(c);
		c.updateRelazioni();
	}
	
	public void supportoCliente(String s) {
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i).compare(s)) {
				lista.get(i).updateRelazioni();
				lista.remove(i);
				super.updateIncontri();
			}
		}
	}
	
	public void effettuaIncontri() {
		for(int i = 0; i < lista.size(); i++) {
			supportoCliente(lista.get(i).getCF());
			updateIncontri();
		}
	}
	
	public String toString() {
		return super.toString() + "[Specializzazione: " + specializzazione + "]";
	}
	
	private String specializzazione;
	private ArrayList<Cliente> lista;
}
