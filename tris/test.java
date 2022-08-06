package tris;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		String player = "X";
		Tris tris = new Tris();
		Scanner sc = new Scanner(System.in);
		boolean done = false;
		while(!done) {
			System.out.println(tris.toString());
			System.out.print("\nInserire riga per " + player + " (-1 per uscire): ");
			int riga = sc.nextInt();
			if(riga == -1)
				done = true;
			else {
				System.out.print("Inserire colonna per " + player + ": ");
				int colonna = sc.nextInt();
				tris.set(riga-1, colonna-1, player);
				if(player.equals("X"))
					player = "O";
				else
					player = "X";
			}
		}

		
		sc.close();
	}

}
