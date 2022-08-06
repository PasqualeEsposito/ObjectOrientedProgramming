package primoAppello2018;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) throws WrongTypeException {
		String si = "abc", sv = "abcdefg";
		Random r = new Random();
		SistemaBiometrico sb = new SistemaBiometrico(); 
		for(int i = 0; i < 20; i++)
			switch(r.nextInt(2)) {
				case 0:
					sb.aggiungiBiometria(new Iride("25-09-1999", "cacciavite", "07-01-2020", "sinistro", si + r.nextInt(1000)));
					break;
				case 1:
					sb.aggiungiBiometria(new Volto("27-10-2015", "reflex", "05-12-2019", sv + r.nextInt(1000)));
					break;
			}
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserire codice biometrico: ");
		String s = sc.next();
		if(sb.verificaBiometria(s)) {
			switch(s.length()) {
				case 6:
					Iride i = new Iride("03-11-2002", "cacciavite", "07-01-2020", "", s);
					ArrayList<Biometria> list = sb.cerca("Iride");
					for(Biometria b: list)
						if(b.getCode().compareTo(s) == 0) {
							System.out.print(b.toString());
							break;
						}
					System.out.println(sb.getVicino(i).toString());
					break;
					
				case 10:
					Volto v = new Volto("03-11-2002", "reflex", "07-01-2020", s);
					ArrayList<Biometria> lista = sb.cerca("Volto");
					for(Biometria b: lista)
						if(b.getCode().compareTo(s) == 0) {
							System.out.print(b.toString());
							break;
						}
					System.out.println(sb.getVicino(v).toString());
					break;
					
				default:
					break;
			}
		}
		
		sc.close();
	}

}
