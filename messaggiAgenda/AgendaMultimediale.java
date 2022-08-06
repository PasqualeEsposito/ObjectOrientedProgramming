package messaggiAgenda;

import java.util.*;

public class AgendaMultimediale {
	
	public AgendaMultimediale() {
		byDate = new ArrayList<>();
		bySender = new ArrayList<>();
	}
	
	public void addElement(Messaggistica m) {
		addElementByDate(m);
		addElementBySender(m);
	}
	
	public void addElementByDate(Messaggistica m) {
		class SortByDate implements Comparator<Object> {
			public int compare(Object x, Object y) {
				Messaggistica m1 = (Messaggistica) x;
				Messaggistica m2 = (Messaggistica) y;
				String s1 = m1.getDate();
				String s2 = m2.getDate();
				return s1.compareTo(s2);
			}
		}
		
		byDate.add(m);
		Collections.sort(byDate, new SortByDate());
		
		/*if(byDate.size() == 0) {
			byDate.add(m);
			return;
		}
		
		
		SortByDate x = new SortByDate();
		
		for(int i = 0; i < byDate.size(); i++) {
			if(x.compare(m, byDate.get(i)) > 0) {
				byDate.add(i, m);
				break;
			}
			byDate.add((byDate.size()-1), m);
		}*/
	}
	
	public void addElementBySender(Messaggistica m) {
		class SortBySender implements Comparator<Object> {
			public int compare(Object x, Object y) {
				Messaggistica m1 = (Messaggistica) x;
				Messaggistica m2 = (Messaggistica) y;
				String s1 = m1.getDate();
				String s2 = m2.getDate();
				return s1.compareTo(s2);
			}
		}
		
		bySender.add(m);
		Collections.sort(bySender, new SortBySender());
		
		/*SortBySender x = new SortBySender();
		
		if(bySender.size() == 0) {
			bySender.add(m);
			return;
		}
		
		for(int i = 0; i < bySender.size(); i++) {
			if(x.compare(m, byDate.get(i)) > 0) {
				bySender.add(i, m);
				break;
			}
		}*/
	}
	
	public ArrayList<Messaggistica> getListByDate() {
		return byDate;
	}
	
	public ArrayList<Messaggistica> getListBySender() {
		return bySender;
	}
	
	private ArrayList<Messaggistica> byDate;
	private ArrayList<Messaggistica> bySender;
}
