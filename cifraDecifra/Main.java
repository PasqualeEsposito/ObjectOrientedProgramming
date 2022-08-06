package cifraDecifra;

import java.io.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Inserisci file input: ");
			String f1 = sc.nextLine();
			FileInputStream file1 = new FileInputStream(f1);
			
			System.out.print("Inserisci file output: ");
			String f2 = sc.nextLine();
			FileOutputStream file2 = new FileOutputStream(f2);
			
			System.out.print("k: ");
			int k = sc.nextInt();

			sc.close();
			
			//Cifrare.cifra(k, file1, file2);
			Cifrare.decifra(k, file1, file2);
			PrintStream f3 = new PrintStream(file2);
			f3.print(f2);
			f3.close();
			file1.close();
			file2.close();
		}
		catch(IOException exc) {
			System.out.println(exc);
			sc.close();
		}
	}

}
