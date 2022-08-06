package bibite;

import java.util.Scanner;

public class Bibite {

	public static void main(String[] args) {
		DistributoreBibite dis;
		Scanner sc = new Scanner(System.in);
		System.out.print("Ci sono bibite nel distributore? [S/n] ");
		char s = sc.next().charAt(0);
		if (s == 'S' || s == 's') {
			System.out.print("Quante bibite ci sono? ");
			int n = sc.nextInt();
			if(n > 0)
				dis = new DistributoreBibite(n);
			else {
				System.out.print("Error\n");
				sc.close();
				return;
			}
		}
		else
			dis = new DistributoreBibite();
		while(true)
		{
			System.out.print("Cosa devi fare?\n[1] Inserire delle monete\n[2] Quante birre ci sono nel distributore?\n Scelta: ");
			int n = sc.nextInt();
			if(n == 1) {
				int m = sc.nextInt();
				if (m > 0)
					dis.addBibita(m);
			}
			if(n == 2) {
				System.out.println("Ci sono " + dis.numBibite() + " bibite nel distributore");
			}
			else {
				sc.close();
				return;
			}
		}
	}
}