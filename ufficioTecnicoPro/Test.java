package ufficioTecnicoPro;

import java.util.ArrayList;
import java.util.Random;

public class Test {

	public static void main(String[] args) {
		ArrayList<Cliente> clienti = new ArrayList<>();
		String[] c = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "Z",
				"a", "b", "c", "d", "e", "f", "g", "h", "i", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v"};
		String[] nome = {"Marco", "Paolo", "Franco", "Silvio", "Vincenzo", "Nicola", "Giuseppe", "Antonio",
				"Pasquale", "Saverio", "Andrea", "Luigi", "Domenico"};
		for(int i = 0; i < 30; i++)
			clienti.add(new Cliente(c[i]));
		
		StudioTecnico studio = new StudioTecnico();
		int i;
		for(i = 0; i < 3; i++)
			studio.aggiungiProfessionista(new TecnicoIscrittoAlbo(i, nome[i], c[i], ""));
		for(i = 3; i < 13; i++)
			studio.aggiungiProfessionista(new TecnicoNonIscrittoAlbo(i, nome[i], c[i]));
		
		Random r = new Random();
		for(i = 0; i < 40; i++)
			studio.effettuaIncontro(r.nextInt(13), clienti.get(r.nextInt(30)));
		//OK
		System.out.println("Professionista con più incontri:\n" + studio.tecnicoMaxIncontri().toString() + "\n");
		
		studio.effettuaIncontri();
		
		for(Cliente l: clienti)
			System.out.println(l.toString());
		
		
		System.out.println("\n\n" + studio.toString());
	}

}
