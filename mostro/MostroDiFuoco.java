package mostro;

public class MostroDiFuoco extends Mostro {

	public MostroDiFuoco (int potenza, String nome, int energia, int vitalità) {
		super(nome, energia, vitalità);
		this.potenza = potenza;
	}
	
	public void attacca (Mostro m) {
		if(m instanceof MostroDiAcqua)
			if(getEnergia() >= potenza && getVitalità() > 0) {
				attacca(potenza);
				m.difendi();
			}
	}
	
	public String toString() {
		return toString() + "[Potenza: " + potenza + "]";
	}
	
	private int potenza;
}
