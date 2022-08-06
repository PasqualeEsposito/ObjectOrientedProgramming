package money;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<ContoCorrente> conto =  new ArrayList<>();
		conto.add(new ContoCorrente());
		conto.add(new ContoCorrente(1500));
		conto.add(new ContoCorrente(2000));
		ContoCorrente c = conto.get(2);
		System.out.println("Numero conto: " + c.restituisciNumeroConto());
		System.out.println("Saldo: " + c.restituisciSaldo() + "\n");
		
		c = conto.get(0);
		c.deposita(100);
		System.out.println("Numero conto: " + c.restituisciNumeroConto());
		System.out.println("Saldo: " + c.restituisciSaldo() + "\n");
		
		c = conto.get(1);
		c.preleva(2000);
		System.out.println("Numero conto: " + c.restituisciNumeroConto());
		System.out.println("Saldo: " + c.restituisciSaldo() + "\n");
	}

}
