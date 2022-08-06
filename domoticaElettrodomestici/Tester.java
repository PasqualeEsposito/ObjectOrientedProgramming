package domoticaElettrodomestici;

import java.util.Random;

public class Tester {

	public static void main(String[] args) {
		Domotica d = new Domotica();
		Random r = new Random();
		String[] canzoni = {"A", "B", "C", "D", "E", "F"};
		String[] nome = {"Nonna", "Nonno", "Papà", "Mamma", "Zio", "Zia", "Cugino", "Cugina", "Dottore", "Docente"};
		String[] marca = {"Philips", "Samsung", "Asus", "Hp", "Motorola", "Lenovo", "Apple"};
		
		for(int i = 0; i < 20; i++)
			if(r.nextInt(2) == 0)
				d.aggiungiElettrodomestico(new Lavatrice(nome[r.nextInt(10)], marca[r.nextInt(7)]));
			else {
				LettoreMP3 e = new LettoreMP3(nome[r.nextInt(10)], marca[r.nextInt(7)]);
				e.load(canzoni);
				d.aggiungiElettrodomestico(e);
			}
		
		for(int i = 0; i < 100; i++)
			System.out.println(d.eseguiProgramma(r.nextInt(20), r.nextInt(5)));
	
		d.stop();
		
		System.out.println("\n\n" + d.toString());
	}

}
