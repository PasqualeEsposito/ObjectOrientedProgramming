package interagire;

import java.util.Scanner;

public class InputChecker {
	public InputChecker () {
		Scanner sc = new Scanner (System.in);
		check = sc.nextLine();
		sc.close();
	}
	
	public int Value () {
		if (check.equals("S") || check.equals("SI") || check.equals("OK") || check.equals("perché no?"))
			return 1;
		if (check.equals("N") || check.equals("NO"))
			return 0;
		return -1;
	}
	
	public void OutputLine (int n) {
		switch (n) {
		case 0:
			System.out.println("Fine");
			break;
		case 1:
			System.out.println("OK");
			break;
		case -1:
			System.out.println("Dato non corretto");
			break;
		}
	}
	
	private String check;
}
