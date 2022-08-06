package preappello2018;

public class RegaloBambino extends Regalo{

	public RegaloBambino(int peso, String regione, String nome, int eta, String messaggio) {
		super(peso, regione);
		this.nome = nome;
		this.eta = eta;
		this.messaggio = messaggio;
	}
	
	public String toString() {
		return super.toString() + "[Nome: " + nome + "][Età:" + eta + "][Messaggio: Hohoho " + messaggio + "]";
	}
	
	public String getNome() {
		return nome;
	}
	
	private String nome;
	private int eta;
	private String messaggio;
}
