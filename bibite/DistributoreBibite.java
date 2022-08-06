package bibite;

public class DistributoreBibite {
	
	public DistributoreBibite () {
		counter = 0;
	}
	
	public DistributoreBibite (int num) {
		counter = num;
	}
	
	public void addBibita (int num) {
		int st = num + counter;
		counter = st;
	}
	
	public int numBibite () {
		return counter;
	}
	
	private int counter;
}
