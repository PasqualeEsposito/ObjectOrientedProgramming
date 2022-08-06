package gioco;

public class Cliente {

	public Cliente(String CF, int saldo) {
		this.CF = CF;
		this.saldo = saldo;
	}
	
	public String giocaAmbata(Ambata a) {
		if(saldo - a.getCosto() < 0)
			return "Credito insufficiente per giocare ad Ambata";
		saldo -= a.getCosto();
		if(a.gioca()) {
			saldo += a.dammiVincita();
			return a.toString() + "\nHai vinto!";
		}
		return a.toString() + "\nHai perso";
	}
	
	public String giocaCartaAlta(CartaAlta c) {
		if(saldo - c.getCosto() < 0)
			return "Credito insufficiente per giocare a Carta Alta";
		saldo -= c.getCosto();
		if(c.gioca()) {
			saldo += c.dammiVincita();
			return c.toString() + "\nHai vinto!";
		}
		return c.toString() + "\nHai perso";
	}
	
	public String toString() {
		return "Codice fiscale: " + CF + "\nSaldo: " + saldo;
	}
	
	private String CF;
	private int saldo;
}
