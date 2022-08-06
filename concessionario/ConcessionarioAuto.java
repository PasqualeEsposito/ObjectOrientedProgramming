package concessionario;

import java.util.Scanner;

public class ConcessionarioAuto {

	public static void main(String[] args) {
		Scanner sn = new Scanner (System.in);
		String nome, marca, targa;
		float capacità, percorrenza;
		
		System.out.print("Marca: ");
		marca = sn.next();
		System.out.print("Nome: ");
		nome = sn.next();
		System.out.print("Targa: ");
		targa = sn.next();
		System.out.print("Capacità: ");
		capacità = sn.nextFloat();
		System.out.print("Percorrenza: ");
		percorrenza = sn.nextFloat();
		Automobili primaAuto = new Automobili (marca, nome, targa, capacità, percorrenza);
		
		System.out.print("\n\nMarca: ");
		marca = sn.next();
		System.out.print("Nome: ");
		nome = sn.next();
		System.out.print("Targa: ");
		targa = sn.next();
		System.out.print("Capacità: ");
		capacità = sn.nextFloat();
		System.out.print("Percorrenza: ");
		percorrenza = sn.nextFloat();
		Automobili secondaAuto = new Automobili (marca, nome, targa, capacità, percorrenza);
		
		primaAuto.Informazioni();
		System.out.print("\n\n\n");
		secondaAuto.Informazioni();
		
		sn.close();
	}

}
