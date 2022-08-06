package preappello2019;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Starter {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		Scanner sc = new Scanner(System.in);
		Ordinazione o = null;
		System.out.print("1.\tCarica ordinazione\n2.\tNuova ordinazione\n-> ");
		int n = sc.nextInt();
		if(n != 1 && n != 2)
			System.exit(0);
		switch(n) {
			case 1:
				System.out.print("Inserisci il nome del file: ");
				String s = sc.next();
				FileInputStream f = new FileInputStream(s);
				ObjectInputStream in = new ObjectInputStream(f);
				o = (Ordinazione) in.readObject();
				in.close();
				break;
			case 2:
				o = new Ordinazione();
				Random r = new Random();
				while(o.calcolaCosto() < 200) {
					switch(r.nextInt(3)) {
						case 0:
							Onnivoro p = new Onnivoro();
							p.autoComponi();
							o.aggiungiPanino(p);
							break;
							
						case 1:
							Vegetariano v = new Vegetariano();
							v.autoComponi();
							o.aggiungiPanino(v);
							break;
							
						case 2:
							Vegano ve = new Vegano();
							ve.autoComponi();
							o.aggiungiPanino(ve);
							break;
					}
				}
		}
		
		System.out.println("\n\n" + o.toString());
		if(n == 2) {
			System.out.print("In quale file salvare l'ordinazione? ");
			String s = sc.next();
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(s));
			out.writeObject(o);
			out.close();
			System.out.println("Completato");
		}
		sc.close();
	}

}
