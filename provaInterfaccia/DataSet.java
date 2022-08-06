package provaInterfaccia;

public class DataSet {
	public DataSet() {
		sum = 0;
		count = 0;
		maximum = null;
		minimum = null;
	}
	
	public void add(Measurable m) {
		sum = sum + m.getMeasure();
		if(count == 0 || m.getMeasure() > maximum.getMeasure())
			maximum = m;
		if(count == 0 ||m.getMeasure() < minimum.getMeasure())
			minimum = m;
		count++;
	}
	
	public double getAverage() {
		if(count == 0)
			return 0;
		return sum/count;
	}
	
	public Measurable getMaximum() {
		return maximum;
	}
	
	public Measurable getMinimum() {
		return minimum;
	}
	
	private double sum;
	private int count;
	private Measurable maximum;
	private Measurable minimum;
}


