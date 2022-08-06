package messaggiAgenda;

public class Messaggistica {
	public Messaggistica(String sender, String data, String id, String testo) {
		mittente = sender;
		this.data = data;
		this.id = id;
		this.testo = testo;
	}
	
	
	public String getDate() {
		return data;
	}
	
	public String getSender() {
		return mittente;
	}
	
	public String getID() {
		return id;
	}
	
	public String getText() {
		return testo;
	}
	
	private String mittente;
	private String data;
	private String id;
	private String testo;

}
