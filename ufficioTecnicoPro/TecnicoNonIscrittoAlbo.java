package ufficioTecnicoPro;

import java.util.ArrayList;
import java.util.Random;

public class TecnicoNonIscrittoAlbo extends Professionista {

	public TecnicoNonIscrittoAlbo(int matricola, String nome, String cognome) {
		super(matricola, cognome, nome);
		lista = new ArrayList<>();
	}
	
	public void addCliente(Cliente c) {
		lista.add(c);
		c.updateRelazioni();
		super.updateIncontri();
	}
	
	public void supportoCliente(String codice) {
		for(int i = 0; i < lista.size(); i++)
			if(lista.get(i).compare(codice)) {
				Random r = new Random();
				lista.get(i).addDocumento(documento[r.nextInt(6)]);
			}
	}
	
	private ArrayList<Cliente> lista;
	private static final String[] documento = {"A", "B", "C", "D", "E", "F"}; //6
}
