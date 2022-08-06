package dataSetComparable;

import java.util.Comparator;

public class DataSet {
	public DataSet(Comparator<Object> c) {
		sum = 0;
		count = 0;
		maximum = null;
		minimum = null;
		comparatore = c;
	}
	
	public void add(Object x) {
		if(count == 0 || comparatore.compare(minimum, x) > 0)
			minimum = x;
		if(count == 0 || comparatore.compare(maximum, x) < 0)
			maximum = x;
		count++;
	}
	
	public double getAverage() {
		if(count == 0)
			return 0;
		return sum/count;
	}
	
	public Object getMaximum() {
		return maximum;
	}
	
	public Object getMinimum() {
		return minimum;
	}
	
	private double sum;
	private int count;
	private Object maximum;
	private Object minimum;
	private Comparator<Object> comparatore;
}
