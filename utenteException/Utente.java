package utenteException;

public class Utente {

	public Utente(String nome, String cognome, String login, String password) {
		if(nome.length() == 0 || nome == "null") throw new IllegalArgumentException("Nome dell’utente con formato errato");
		if(cognome.length() == 0 || cognome == "null") throw new IllegalArgumentException("Cognome dell’utente con formato errato");
		if(login.length() < 5 || login.contains(" ")) throw new IllegalArgumentException("Login dell’utente con formato errato");
		if(password.length() < 5 || password.contains(" ")) throw new IllegalArgumentException("Password dell’utente con "
				+ "formato errato");
		this.nome = nome;
		this.cognome = cognome;
		this.login = login;
		this.password = password;
	}
	
	public String toString() {
		return "[Nome: " + nome + "][Cognome: " + cognome + "]";
	}
	
	public String getName() {
		return nome;
	}
	
	public String getSurname() {
		return cognome;
	}
	
	public String getLoginPassword() {
		return "[Login: " + login + "][Password: " + password + "]";
	}
	
	private String nome;
	private String cognome;
	private String login;
	private String password;
}
