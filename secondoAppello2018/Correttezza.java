package secondoAppello2018;

import java.io.FileReader;
import java.util.Scanner;

public class Correttezza {
	
	public Correttezza() {
		
	}
	
	public static void correttezzaDati(FileReader f) throws WrongTypeException {
		Scanner in = new Scanner(f);
		while(in.hasNext()) {
			try {
				in.next();
				Integer.parseInt(in.next());
				Double.parseDouble(in.next());
				in.next();
			}
			catch(NumberFormatException e) {
				in.close();
				throw new WrongTypeException();
			}
		}
		in.close();
	}
	
	public static void correttezzaStringhe(FileReader f) {
		Scanner in = new Scanner(f);
		while(in.hasNextLine()) {
			if(!in.hasNextLine())
				break;
			String[] campi = in.nextLine().split(" ");
			if(campi.length < 4) {
				in.close();
				throw new MissingFieldException();
			}
		}
		in.close();
	}
	
	
}