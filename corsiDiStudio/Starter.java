package corsiDiStudio;

import java.util.Random;

public class Starter {

	public static void main(String[] args) {
		ProgrammazioneDidattica uni = new ProgrammazioneDidattica("Informatica", 55, 150);
		Random r = new Random();
		
		String[] nomeCorsi = {"PR1", "AdE", "MD", "MMI", "PSD", "Analisi1", "SO", "POO", "BD", "PA", "ETC", "CN", "Inglese",
				"PSV", "Fisica", "Algebra", "Geometria", "Chimica", "Letteratura", "Tedesco"};
		String[] nomeIndirizzi = {"Fisica", "Informatica", "Letteratura"};
		String[] lingue = {"italiano", "inglese"};
		
		int i = 0;
		for(; i < 10; i++)
			uni.aggiungiCorso(new CorsoTriennale(nomeCorsi[i], "Docente" + i, r.nextInt(10) + 1, r.nextInt(10) + 1));
		for(; i < 15; i++)
			uni.aggiungiCorso(new CorsoMagistrale(nomeCorsi[i], "Docente" + i, r.nextInt(10), nomeIndirizzi));
		for(; i < 20; i++)
			uni.aggiungiCorso(new CorsoDottorato(nomeCorsi[i], "Docente" + i, lingue[r.nextInt(2)] ,r.nextInt(10)));
		
		System.out.println("Costo programmazione didattica: " + uni.calcolaCosto() + "€\n\n");
		
		System.out.println(uni.toString() + "\n\n");
		
		if(uni.verifica())
			System.out.println("La programmazione didattica soddisfa il requisito sul numero di ore minimo e massimo");
		else
			System.out.println("La programmazione didattica NON soddisfa il requisito sul numero di ore minimo e massimo");

	}

}
