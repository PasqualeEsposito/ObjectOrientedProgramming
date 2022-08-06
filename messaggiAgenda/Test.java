package messaggiAgenda;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		AgendaMultimediale agenda = new AgendaMultimediale();
		
		agenda.addElement(new Messaggistica("Pasquale", "2018/11/12", "SPS", "Ciao Signor Nicola"));
		agenda.addElement(new Messaggistica("Roberto", "2019/11/10", "SPS", "Save magnt o limon"));
		agenda.addElement(new Messaggistica("Saverio", "2018/25/09", "NPL", "Auguri Pasquale"));
		agenda.addElement(new Messaggistica("Giuseppe", "2019/30/09", "CLD", "Sono arrivato al livello 5"));
		agenda.addElement(new Messaggistica("Alessandro", "2017/21/01", "RCC", "Fuggi da Foggia"));
		
		ArrayList<Messaggistica> byDate = agenda.getListByDate();
		for(int i = 0; i < byDate.size(); i++) {
			System.out.println("Nome: " + byDate.get(i).getSender());
			System.out.println("ID: " + byDate.get(i).getID());
			System.out.println("Data: " + byDate.get(i).getDate());
			System.out.println("Messaggio: " + byDate.get(i).getText() + "\n");
		}
		
		System.out.print("\n\n\n");
		
		ArrayList<Messaggistica> bySender = agenda.getListBySender();
		for(int i = 0; i < bySender.size(); i++) {
			System.out.println("Nome: " + byDate.get(i).getSender());
			System.out.println("ID: " + byDate.get(i).getID());
			System.out.println("Data: " + byDate.get(i).getDate());
			System.out.println("Messaggio: " + byDate.get(i).getText() + "\n");
		}
	}

}
