package utenteException;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n = 0, i = 0;
		String nomeEsame = "", votoEsame = "";
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Studente> list = new ArrayList<>(); 
		System.out.println("INSERIMENTO STUDENTI");
		do {
			i = n + 1;
			try {
				System.out.print("\nNome: ");
				String nome = sc.next();
				System.out.print("Cognome: ");
				String cognome = sc.next();
				System.out.print("Matricola: ");
				int matricola = sc.nextInt();
				System.out.print("Login: ");
				String login = sc.next();
				System.out.print("Password: ");
				String password = sc.next();
				list.add(new Studente(nome, cognome, login, password, matricola));
				System.out.println("Studente " + i + " aggiunto correttamente\n");
			}
			catch (IllegalArgumentException exception) {
				System.out.println(exception + "\nReinserire utente\n");
				n--;
			}
			catch (InputMismatchException e) {
				n--;
			}
			n++;
		} while(n < 1);
		
		i = 0;
		System.out.println("INSERIMENTO ESAMI\n");
		while(i < 1) {
			do {
				try {
					System.out.println(list.get(i).getName() + " " + list.get(i).getSurname());
					System.out.print("Nome esame: ");
					nomeEsame = sc.next();
					if(nomeEsame.compareTo("null") == 0)
						break;
					System.out.print("Voto esame: ");
					votoEsame = sc.next();
					list.get(i).aggiungiEsame(nomeEsame, votoEsame);
				}
				catch (NumberFormatException exception) {
					System.out.println(exception + "Reinserire esame, valori errati\n");
				}
			} while(true);
			i++;
		}
		for(int j = 0; j < 1; j++) {
			System.out.println(list.get(j).toString() + "[Media: " + list.get(j).getMediaEsami() + "]");
		}
		sc.close();
	}

}
