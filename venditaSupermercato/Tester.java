package venditaSupermercato;

import java.util.GregorianCalendar;
import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		Supermercato Piccolo = new Supermercato();
		Piccolo.aggiungiProdotto(new Alimentare(123, "", "Barilla", 1.20, 100, new GregorianCalendar(2019, 10, 20), 1));
		Piccolo.aggiungiProdotto(new Alimentare(344, "", "Parma", 120, 20, new GregorianCalendar(2019, 10, 20), 2));
		Piccolo.aggiungiProdotto(new Alimentare(553, "", "Sorrento", 13, 15, new GregorianCalendar(2019, 10, 20), 13));
		Piccolo.aggiungiProdotto(new Alimentare(567, "", "Napoli", 9.13, 1000, new GregorianCalendar(2019, 10, 20), 45));
		Piccolo.aggiungiProdotto(new Alimentare(574, "", "Barilla", 2.50, 10, new GregorianCalendar(2019, 10, 20), 11));
		Piccolo.aggiungiProdotto(new Alimentare(323, "", "Barilla", 17.20, 5, new GregorianCalendar(), 12));
		Piccolo.aggiungiProdotto(new Alimentare(677, "", "Bosco", 3.40, 12, new GregorianCalendar(2019, 10, 20), 22));
		
		Piccolo.aggiungiProdotto(new Elettronico(4986, "", "Samsung", 300, 1000, 2, 100));
		Piccolo.aggiungiProdotto(new Elettronico(4986, "", "Huawei", 100, 700, 2, 150));
		Piccolo.aggiungiProdotto(new Elettronico(4986, "", "Apple", 1000, 500, 2, 180));
		Piccolo.aggiungiProdotto(new Elettronico(4986, "", "Huawei", 750, 100, 2, 170));
		Piccolo.aggiungiProdotto(new Elettronico(4986, "", "Apple", 450, 10, 2, 180));
		
		ArrayList<Prodotto> lista = Piccolo.cerca("Barilla");
		for(int i = 0; i < lista.size(); i++)
			System.out.println(lista.get(i).toString());

	}

}
