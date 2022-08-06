package provaInterfaccia;

public class Test {

	public static void main(String[] args) {
		DataSet d = new DataSet();
		Measurable x;
		d.add(new Coin(0.1, "quarter"));
		d.add(new Coin(0.25, "dime"));
		d.add(new Coin(0.05, "nickel"));
		System.out.println("Valore medio monete: " + d.getAverage());
		x = d.getMinimum();
		System.out.println("Moneta più piccola: " + x.getMeasure());
		x = d.getMaximum();
		System.out.println("Moneta più grande: " + x.getMeasure() + "\n\n\n");
		
		//bisogna azzerare i valori di Measurable
		d.add(new BankAccount(1000, 123));
		d.add(new BankAccount(500, 4532));
		d.add(new BankAccount(10, 5738));
		System.out.println("Valore medio conti corrente: " + d.getAverage());
		x = d.getMinimum();
		System.out.println("Valore conto corrente più basso: " + x.getMeasure());
		x = d.getMaximum();
		System.out.println("Valore conto corrente più alto: " + x.getMeasure());
		
		//bisogna azzerare i valori di Measurable
		d.add(new Quiz(10, "A+"));
		d.add(new Quiz(7, "C+"));
		d.add(new Quiz(1, "F"));
		d.add(new Quiz(6.5, "B"));
		System.out.println("Media voti: " + d.getAverage());
		x = d.getMaximum();
		System.out.println("Punteggio più alto: " + x.getMeasure());
		System.out.println("Punteggio più alto (in lettere): " + x.getPunteggio());
		x = d.getMinimum();
		System.out.println("Punteggio più basso: " + x.getMeasure());
		System.out.println("Punteggio più basso (in lettere): " + x.getPunteggio());
	}

}
