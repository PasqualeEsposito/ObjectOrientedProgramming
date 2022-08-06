package compagniaTelefonica;

import java.util.ArrayList;

public class CompagniaTelefonica {

	public CompagniaTelefonica(double price) {
		clienti = new ArrayList<>();
		this.price = price;
		reductPrice = (price/100)*70;
	}
	
	public void changePrice(double price) {
		this.price = price;
		reductPrice = (price/100)*70;
	}
	
	public void addCliente(String nome, String cognome, String indirizzo, int codice, int minutiFasciaPiena, int minutiFasciaRidotta) {
		clienti.add(new Cliente(nome, cognome, indirizzo, codice, minutiFasciaPiena, minutiFasciaRidotta));
	}
	
	public double getCostoClienteFasciaPiena(int codice) {
		int i;
		for(i = 0; i < clienti.size(); i++)
			if(clienti.get(i).getCodice() == codice)
				break;
		if(i == clienti.size())
			return -1;
		else
			return clienti.get(i).getMinutiFasciaPiena()*price;
	}
	
	public double getCostoClienteFasciaRidotta(int codice) {
		int i;
		for(i = 0; i < clienti.size(); i++)
			if(clienti.get(i).getCodice() == codice)
				break;
		if(i == clienti.size())
			return -1;
		else
			return clienti.get(i).getMinutiFasciaRidotta()*reductPrice;
	}
	
	
	public Cliente getCliente(int codice) {
		for(Cliente c: clienti)
			if(c.getCodice() == codice)
				return c;
		return new Cliente("", "", "", 0, 0, 0);
	}
	
	
	private ArrayList<Cliente> clienti;
	private double price;
	private double reductPrice;
}
