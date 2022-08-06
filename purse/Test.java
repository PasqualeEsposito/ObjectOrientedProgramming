package purse;

public class Test {

	public static void main(String[] args) {
		Purse p = new Purse();
		Coin c1 = new Coin(0.1, "dime");
		p.add(c1);
		Coin c2 = new Coin(0.25, "quarter");
		p.add(c2);
		Coin c3 = new Coin(0.05, "nickel");
		p.add(c3);
		p.add(c1);
		p.add(c1);
		
		if(p.find(c2))
			System.out.println("La moneta è stata trovata");
		if(p.hasCoin(c3))
			System.out.println("La moneta è stata trovata");
		if(p.remove(c2))
			System.out.println("La moneta è stata rimossa con successo");
		System.out.println("Sono state contate " + p.count(c1) + " occorrenze del dime");
		System.out.println("Il valore più alto trovato nel Purse è " + (p.getMaximum()).getValue());
		System.out.println("Il valore più basso trovato nel Purse è " + (p.getMinimum()).getValue());
		System.out.println("Il valore di Purse è " + p.getTotal());
	}

}
