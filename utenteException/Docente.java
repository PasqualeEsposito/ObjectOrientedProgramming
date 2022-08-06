package utenteException;

public class Docente extends Utente {
	
	public Docente(String nome, String cognome, String login, String password, int studio, String dipartimento) {
		super(nome, cognome, login, password);
		this.studio = studio;
		this.dipartimento = dipartimento;
	}
	
	int studio;
	String dipartimento;
}
