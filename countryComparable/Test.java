package countryComparable;

public class Test {

	public static void main(String[] args) {
		DataSet data = new DataSet();
		
		data.add(new Country("Mykonos", 1400));
		data.add(new Country("Ibiza", 24500));
		data.add(new Country("Corfù", 2452));
		data.add(new Country("Mondragone", 57892));
		data.add(new Country("Baia Domizia", 85829));
		
		System.out.println("Maximum: " + data.getMaximum().toString());
		System.out.println("Minimum: " + data.getMinimum().toString());
	}

}
