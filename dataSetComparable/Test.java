package dataSetComparable;

import java.util.Comparator;

public class Test {

	public static void main(String[] args) {
		class ComparaPerLunghezza implements Comparator<Object> {
			public int compare(Object x, Object y) {
				String r = (String) x;
				String s = (String) y;
				if(r.length() < s.length())
					return -1;
				if(r.length() > s.length())
					return 1;
				return 0;
			}
		}
		
		class ComparaPerOrdine implements Comparator<Object> {
			public int compare(Object x, Object y) {
				String r = (String) x;
				String s = (String) y;
				return r.compareTo(s);
			}
		}
		
		Comparator<Object> x = new ComparaPerOrdine();
		Comparator<Object> y = new ComparaPerLunghezza();
		
		DataSet data1 = new DataSet(x);
		DataSet data2 = new DataSet(y);

		data1.add("Albero");
		data1.add("Amaca");
		data1.add("Birra");
		data1.add("Fibra");
		
		data2.add("Luce");
		data2.add("Tennis");
		data2.add("Benevento");
		data2.add("Avellino");
		
		System.out.println("Parola più corta data1: " + data1.getMinimum());
		System.out.println("Parola più lunga data1: " + data1.getMaximum());
		
		System.out.println("Parola più corta data2: " + data2.getMinimum());
		System.out.println("Parola più lunga data2: " + data2.getMaximum());
	}

}
