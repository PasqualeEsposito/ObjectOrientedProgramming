package money;

public class ContoCorrente {

	public ContoCorrente() {
		id = ++numeroSaldo;
		saldo = 0;
	}
	
	public ContoCorrente(int saldo) {
		assert saldo >= 0;
		this.saldo = saldo;
		id = ++numeroSaldo;
	}
	
	public void deposita(int amount) {
		assert amount >= 0;
		saldo += amount;
	}
	
	public void preleva(int amount) {
		assert amount <= saldo;
		saldo -= amount;
	}
	
	public double restituisciSaldo() {
		return saldo;
	}
	
	public int restituisciNumeroConto() {
		return id;
	}
	
	private double saldo;
	private int id;
	private static int numeroSaldo = 0;
}
