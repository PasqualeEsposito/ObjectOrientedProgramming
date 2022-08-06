package file;

import java.io.*;
import java.net.URL;
import java.util.Scanner;

public class ProvaFile {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		/*FileReader reader = new FileReader("//home/pasquale//Scrivania//programmazioneObjectOriented//src//file//prova.txt");
		File f = new File("//home/pasquale//Scrivania//programmazioneObjectOriented//src//file//prova2.txt");
		PrintWriter w = new PrintWriter(f);
		Scanner sc = new Scanner(reader);
		int r = 1;
		while(sc.hasNextLine()) {
			if(sc.nextLine().compareTo("albero") == 0)
				w.println("/*" + r + "*//*");
			r++;
		}
		sc.close();
		w.close();*/
		
		URL locator = new URL("https://docs.oracle.com/javase/8/docs/api/allclasses-noframe.html");
		InputStream in = locator.openStream();
		Scanner sc = new Scanner(in);
		PrintWriter file = new PrintWriter("//home/pasquale//Scrivania//programmazioneObjectOriented//src//file//prova2.txt");
		while(sc.hasNextLine()) {
			file.print(sc.nextLine());
		}
		sc.close();
		file.close();
	}
}
