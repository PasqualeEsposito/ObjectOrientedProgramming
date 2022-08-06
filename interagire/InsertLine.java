package interagire;

public class InsertLine {

	public static void main(String[] args) {
		System.out.print("Insert new phrase: ");
		InputChecker newObject = new InputChecker ();
		int n = newObject.Value ();
		newObject.OutputLine (n);
	}

}
