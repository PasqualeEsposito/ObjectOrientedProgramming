package classe;

import java.util.Scanner;

public class InserimentoVoti {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Inserisci nome studente: ");
		String nome = sc.nextLine();
		Studente st = new Studente (nome);
		int n = 0;
		for (int i = 0; i < 5; i++) {
			System.out.print("Inserisci voto: ");
			n = sc.nextInt();
			st.addVoto (n);
		}
		st.OutputStudente();
		sc.close ();
	}

}
