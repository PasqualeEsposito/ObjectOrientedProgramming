package bancaList;

import java.util.ArrayList;

public class Bank {
	public Bank() {
		banca = new ArrayList<BankAccount>();
	}
	
	public void addAccount (double initialBalance, int customerName) {
		banca.add (new BankAccount (initialBalance, customerName));
	}
	
	public boolean deposit (int account, double amount) {
		if(banca.size() == 0)
			return false;
		for(BankAccount b: banca)
			if(b.equals(account)) {
				b.deposit(amount);
				return true;
			}
		return false;
	}
	
	public boolean withdraw (int account, double amount) {
		if(banca.size() == 0)
			return false;
		for(BankAccount b: banca)
			if(b.equals(account)) {
				b.withdraw(amount);
				return true;
			}
		return false;
	}
	
	public double getBalance (int account) {
		if(banca.size() == 0)
			return -1000;
		for (BankAccount b: banca)
			if (b.equals(account)) {
				return b.getBalance();
			}
		return -1000;
	}
	
	public boolean transfer (int fromAccount, int toAccount, double amount) {
		if(banca.size() == 0)
			return false;
		for(BankAccount b: banca)
			if(b.equals(fromAccount)) {
				for(BankAccount c: banca)
					if(c.equals(toAccount)) {
						b.withdraw(amount);
						c.deposit(amount);
						return true;
					}
			}
		return false;
	}
	
	private ArrayList<BankAccount> banca;
}
