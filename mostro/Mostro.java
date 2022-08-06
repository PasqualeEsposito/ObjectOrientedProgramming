package mostro;

public abstract class Mostro {
	
	public Mostro(String nome, int energia, int vitalità) {
		this.nome = nome;
		this.energia = energia;
		this.vitalità = vitalità;
	}
	
	public void attacca (int potenza) {
		this.energia -= potenza;
	}
	
	public void difendi () {
		vitalità--;
	}
	
	public String toString() {
		return getClass().getName() + "[Nome: " + nome + "][Energia: " + energia + "][Vitalità: " + vitalità + "]";
	}
	
	public int getVitalità () {
		return vitalità;
	}
	
	public int getEnergia() {
		return energia;
	}
	
	public abstract void attacca(Mostro m);
	
	private String nome;
	private int energia;
	private int vitalità;
}
