package compagniaTelefonica;

public class Test {

	public static void main(String[] args) {
		Cliente c;
		CompagniaTelefonica cmp = new CompagniaTelefonica(1.5);
		cmp.addCliente("Andrea", "Terlizzi", "Via Armenia, 2", 3563, 3, 50);
		cmp.addCliente("Pasquale", "Esposito", "Via Cerciello, 3", 123, 10, 20);
		cmp.addCliente("Saverio", "Napolitano", "Via Roma, 12", 33, 12, 0);
		cmp.addCliente("Nicola", "Serra", "Via Milano, 13", 57, 55, 40);
		cmp.addCliente("Alessandro", "Ricchetti", "Via da Foggia, 56", 643, 12, 56);
		c = cmp.getCliente(3563);
		System.out.println("Nome: " + c.getNome() + "\nCognome: "+ c.getCognome() + "\nIndirizzo: " + c.getIndirizzo());
		System.out.println("Codice: " + c.getCodice() + "\nMinuti fascia piena: " + c.getMinutiFasciaPiena());
		System.out.println("Minuti fascia ridotta: " + c.getMinutiFasciaRidotta());
		System.out.println("Costo minuti fascia piena: " + cmp.getCostoClienteFasciaPiena(c.getCodice()));
		System.out.println("Costo minuti fascia ridotta: " + cmp.getCostoClienteFasciaRidotta(c.getCodice()));
		/*c = cmp.getCliente(57);
		System.out.println("Nome: " + c.getNome() + "\nCognome: "+ c.getCognome() + "\nIndirizzo: " + c.getIndirizzo());
		System.out.println("Codice: " + c.getCodice() + "\nMinuti fascia piena: " + c.getMinutiFasciaPiena());
		System.out.println("Minuti fascia ridotta: " + c.getMinutiFasciaRidotta());
		System.out.println("Costo minuti fascia piena: " + cmp.getCostoClienteFasciaPiena(c.getCodice()));
		System.out.println("Costo minuti fascia ridotta: " + cmp.getCostoClienteFasciaRidotta(c.getCodice()));
		c = cmp.getCliente(643);
		System.out.println("Nome: " + c.getNome() + "\nCognome: "+ c.getCognome() + "\nIndirizzo: " + c.getIndirizzo());
		System.out.println("Codice: " + c.getCodice() + "\nMinuti fascia piena: " + c.getMinutiFasciaPiena());
		System.out.println("Minuti fascia ridotta: " + c.getMinutiFasciaRidotta());
		System.out.println("Costo minuti fascia piena: " + cmp.getCostoClienteFasciaPiena(c.getCodice()));
		System.out.println("Costo minuti fascia ridotta: " + cmp.getCostoClienteFasciaRidotta(c.getCodice()));
		c = cmp.getCliente(0);
		System.out.println("Nome: " + c.getNome() + "\nCognome: "+ c.getCognome() + "\nIndirizzo: " + c.getIndirizzo());
		System.out.println("Codice: " + c.getCodice() + "\nMinuti fascia piena: " + c.getMinutiFasciaPiena());
		System.out.println("Minuti fascia ridotta: " + c.getMinutiFasciaRidotta());
		System.out.println("Costo minuti fascia piena: " + cmp.getCostoClienteFasciaPiena(c.getCodice()));
		System.out.println("Costo minuti fascia ridotta: " + cmp.getCostoClienteFasciaRidotta(c.getCodice()));*/
		
		cmp.changePrice(2);
		c = cmp.getCliente(3563);
		System.out.println("Nome: " + c.getNome() + "\nCognome: "+ c.getCognome() + "\nIndirizzo: " + c.getIndirizzo());
		System.out.println("Codice: " + c.getCodice() + "\nMinuti fascia piena: " + c.getMinutiFasciaPiena());
		System.out.println("Minuti fascia ridotta: " + c.getMinutiFasciaRidotta());
		System.out.println("Costo minuti fascia piena: " + cmp.getCostoClienteFasciaPiena(c.getCodice()));
		System.out.println("Costo minuti fascia ridotta: " + cmp.getCostoClienteFasciaRidotta(c.getCodice()));
	}

}
