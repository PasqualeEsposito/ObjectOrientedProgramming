package secondoAppello2014;

import java.util.GregorianCalendar;

public class TesserinoStudente extends Tesserino {

	public TesserinoStudente(int codice, String nome, String cognome, boolean attivo,
			String matricola, GregorianCalendar scadenza, double saldo, char fascia, boolean bonus) {
	
		super(codice, nome, cognome, attivo);
		this.matricola = matricola;
		this.scadenza = scadenza;
		this.saldo = saldo;
		this.fascia = fascia;
		this.bonus = bonus;
	}
	
	public double calcolaPrezzo() {
		double prezzo;
		
		switch(fascia) {
		case 'A':
			prezzo = 3;
			break;
		case 'B':
			prezzo = 2;
			break;
		default:
			prezzo = 8;
			break;
		}
		if(bonus)
			prezzo -= 1;
		return prezzo;
	}
	
	public boolean isBonus() {
		return bonus;
	}
	
	public double paga() throws TesserinoScadutoException {
		if(scadenza.before(new GregorianCalendar()))
			throw new TesserinoScadutoException();
		if((saldo - calcolaPrezzo()) < 0)
			throw new SaldoInsufficienteException();
		saldo -= calcolaPrezzo();
		return calcolaPrezzo();
	}
	
	public void versa(double x) {
		if(x < 0)
			throw new RuntimeException();
		saldo += x;
	}
	
	public String toString() {
		return super.toString() + "[Matricola: " + matricola + "][Saldo : " + saldo + "]";
	}
	
	private String matricola;
	private GregorianCalendar scadenza;
	private double saldo;
	private char fascia;
	private boolean bonus;
}
