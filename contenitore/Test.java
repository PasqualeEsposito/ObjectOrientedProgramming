package contenitore;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		class ComparaPerNome implements Comparator<Contenitore> {
			public int compare(Contenitore x, Contenitore y) {
				return x.getNome().compareTo(y.getNome());
			}
		}
		
		class ComparaPerCodice implements Comparator<Contenitore> {
			public int compare(Contenitore x, Contenitore y) {
				return x.getCodice() - y.getCodice();
			}
		}
		
		Random r = new Random();
		ElencoContenitori c = new ElencoContenitori();
		ComparaPerCodice x = new ComparaPerCodice();
		ComparaPerNome y = new ComparaPerNome();
		String[] s = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "L", "M", "N", "O", "P"};
		
		for(int i = 0; i < 20; i++) {
		c.addContenitore(new Cubici(s[r.nextInt(14)], r.nextInt(), r.nextFloat(), r.nextInt(), r.nextInt()));
		c.addContenitore(new Cilindrici(s[r.nextInt(14)], r.nextInt(), r.nextFloat(), r.nextInt(), r.nextFloat(), r.nextFloat()));
		}
		
		System.out.println(c.toString());
		
		System.out.println("\n\nElemento più piccolo per nome:\n" + c.getMinimo(x).toString());
		System.out.println("\n\nElemento più grande per nome:\n" + c.getMassimo(x).toString());
		System.out.println("\n\nElemento più piccolo per codice:\n" + c.getMinimo(y).toString());
		System.out.println("\n\nElemento più grande per codice:\n" + c.getMassimo(y).toString());
		
	}

}
