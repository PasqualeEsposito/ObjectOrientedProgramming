package preappello2018;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class Tester {

	public static void main(String[] args) throws PesoMaxSuperatoException, FileNotFoundException {
		SlittaDiBabboNatale sbn = new SlittaDiBabboNatale(1000);
		PrintWriter f = new PrintWriter("nomiBambini");
		Random r = new Random();
		String[] s = {"Nord", "Centro", "Sud"}, nomi = {"Alessandro", "Giacomo", "Giovanni", "Francesco", "Adriano", "Ciro", "Aldo",
				"Franco", "Carlo", "Luigi"};
		for(int i = 0; i < 30; i++) {
			switch(r.nextInt(2)) {
			case 0:
				int num = r.nextInt(10);
				sbn.aggiungiRegalo(new RegaloBambino(r.nextInt(21), s[r.nextInt(3)], nomi[num], r.nextInt(11), "Auguri"));
				f.write(nomi[num] + "\n");
				break;
			case 1:
				sbn.aggiungiRegalo(new RegaloAdulto(r.nextInt(31), s[r.nextInt(3)], nomi[r.nextInt(10)]));
				break;
			}
		}
		
		System.out.println("Costo per consegnare i regali: " + sbn.calcolaCosto());
		System.out.println(sbn.spedisci());
		f.close();
	}

}
