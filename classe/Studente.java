package classe;

public class Studente {
	public Studente (String studente) {
		this.studente = studente;
		numeroVoti = 0;
	}
	
	public void addVoto (int voto) {
		System.out.println("ok");
		voti[numeroVoti] = voto;
		numeroVoti ++;
	}
	
	public double mediaVoti () {
		int i;
		double media = 0;
		for (i = 0; i < numeroVoti; i++)
			media += voti[i];
		return media/numeroVoti;
	}
	
	public void OutputStudente () {
		System.out.println ("\n\nStudente: " + studente);
		for (int i = 0; i < numeroVoti; i++)
			System.out.println("Voto " + i + ": " + voti[i]);
		System.out.println ("Voto medio: " + mediaVoti());
	}
	
	private String studente;
	private int[] voti;
	private int numeroVoti;
}
