package utenteException;

public class Studente extends Utente {
	public Studente(String nome, String cognome, String login, String password, int matricola) {
		super(nome, cognome, login, password);
		this.matricola = matricola;
		numeroEsamiSuperati = 0;
		esami = new String[10][2];
	}
	
	public void aggiungiEsame(String nomeEsame, String votoEsame) {
		if(Integer.parseInt(votoEsame, 10) > 30 || Integer.parseInt(votoEsame, 10) < 18) throw new NumberFormatException();
		esami[numeroEsamiSuperati][0] = nomeEsame;
		esami[numeroEsamiSuperati][1] = votoEsame;
	}
	
	public String toString() {
		return super.toString() + "[Matricola: " + matricola + "]";
	}
	
	public float getMediaEsami() {
		if(numeroEsamiSuperati == 0)
			return 0;
		float media = 0;
		for(int i = 0; i < numeroEsamiSuperati; i++) {
			int n = Integer.parseInt(esami[i][1], 10);
			System.out.println("Voto: " + n);
			media += n;
		}
		return media/numeroEsamiSuperati;
	}
	
	
	private int matricola;
	private String[][] esami;
	private int numeroEsamiSuperati;
}
