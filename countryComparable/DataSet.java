package countryComparable;

import java.lang.Comparable;

public class DataSet {
	
	public DataSet() {
		maximum = null;
		minimum = null;
		count = 0;
	}
	
	public void add(Comparable c) {
		
		if(count == 0) {
			maximum = c;
			minimum = c;
			count++;
			return;
		}
		
		if(c.compareTo(maximum) == 1)
			 maximum = c;
		if(c.compareTo(minimum) == -1)
			minimum = c;
	}
	
	public Comparable getMaximum() {
		return maximum;
	}
	
	public Comparable getMinimum() {
		return minimum;
	}
	
	private int count;
	private Comparable maximum;
	private Comparable minimum;
}
