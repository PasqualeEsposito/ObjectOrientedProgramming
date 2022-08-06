package primoAppello2019;

import java.io.*;
import java.util.Random;

public class Tester {

	public static void main(String[] args) {
		String[] s = {"Juventus", "Napoli", "Roma", "Inter", "Milan", "Bologna", "Cagliari", "Brescia", "Verona", "Sassuolo"};
		Random r = new Random();
		Torneo t = new Torneo("Birra Moretti");
		for(int i = 0; i < 10; i++)
			t.addSquadra(new Squadra(s[i], 0, 0, r.nextInt(100) + 550));
		
		try {
			t.giocaTuttePartite();
			System.out.print(t.getClassifica());
			ObjectOutputStream f = new ObjectOutputStream(new FileOutputStream(t.getNome()));
			f.writeObject(t);
			f.close();
		}
		catch(NotEnoughMoneyException e) {
		
		}
		catch(IOException e) {
			
		}
		catch(SameElementException e) {
			
		}
	}

}
