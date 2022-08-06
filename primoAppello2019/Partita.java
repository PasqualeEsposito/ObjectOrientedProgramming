package primoAppello2019;

public abstract class Partita {

	public Partita(Squadra a, Squadra b, String data) throws SameElementException {
		if(a.equals(b))
			throw new SameElementException();
		if(risA < 0 || risB < 0)
			throw new BadDataException();
		this.a = a;
		this.b = b;
		this.data = data;
	}
	
	public void updateRisA(int n) {
		risA = n;
	}
	
	public void updateRisb(int n) {
		risB = n;
	}
	
	public String toString() {
		return "[SquadraA: " + a + "][SquadraB: " + b + "][Ris: " + risA + "-" + risB + "][Data: " + data + "]";
	}
	
	public abstract void gioca(Squadra a, Squadra b) throws NotEnoughMoneyException;
	
	private Squadra a;
	private Squadra b;
	private int risA;
	private int risB;
	private String data;
}
