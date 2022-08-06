package secondoAppello2018;

import java.io.*;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) throws IOException, MissingFieldException, WrongTypeException {
		int i = 0;
		Scanner sc = new Scanner(System.in);
		FileReader f = null;
		do {
			try {
				System.out.print("Insert name file: ");
				f = new FileReader(sc.next());
				Correttezza.correttezzaDati(f);
				Correttezza.correttezzaStringhe(f);
				break;
			}
			catch(FileNotFoundException e) {
				System.out.println(e);
			}
			i++;
		} while (i < 2);
		
		System.out.println("Completato");
		
		sc.close();
		f.close();
	}

}
