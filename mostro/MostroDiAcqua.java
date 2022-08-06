package mostro;

public class MostroDiAcqua extends Mostro {
	
	public MostroDiAcqua (int temperatura, String nome, int energia, int vitalità) {
		super(nome, energia, vitalità);
		this.temperatura = temperatura;
	}
	
	public void attacca(Mostro m) {
		if(m instanceof MostroDiPietra)
			if(getVitalità() > 0 && getEnergia() >= temperatura/2) {
				attacca(temperatura/2);
				m.difendi();
			}
	}
	
	public String toString() {
		return toString() + "[Temperatura: " + temperatura + "]";
	}
	
	
	private int temperatura;
}
