package bancaList;

public class Test {

	public static void main(String[] args) {
		Bank b = new Bank();
		b.addAccount(1200, 111);
		b.addAccount(100, 100);
		b.addAccount(2000, 150);
		b.addAccount(5, 1000);
		if(b.deposit(1000, 5))
			System.out.println("Nuovo saldo di 1000: " + b.getBalance(1000));
		if(b.withdraw(150, 1000))
			System.out.println("Nuovo saldo di 150: " + b.getBalance(150));
		if(b.transfer(111, 1000, 200)) {
			System.out.println("Nuovo saldo di 111: " + b.getBalance(111));
			System.out.println("Nuovo saldo di 1000: " + b.getBalance(1000));
		}
	}
}
