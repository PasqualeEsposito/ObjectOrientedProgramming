package bancaList;

public class BankAccount {
	public BankAccount () {
		balance = 0;
	}
	
	public BankAccount (double initialBalance, int number) {
		balance = initialBalance;
		this.number = number;
	}
	
	public void deposit (double amount) {
		double newBalance = balance + amount;
		balance = newBalance;
	}
	
	public void withdraw (double amount) {
		double newBalance = balance - amount;
		balance = newBalance;
	}
	
	public double getBalance () {
		return balance;
	}
	
	public int getNumber() {
		return number;
	}
	
	public boolean equals(int number) {
		return this.number == number;
	}
	
	private double balance;
	private int number;
}
