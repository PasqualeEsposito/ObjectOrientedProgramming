package mostro;

public class MostroDiPietra extends Mostro {

	public MostroDiPietra (int peso, String nome, int energia, int vitalità) {
		super(nome, energia, vitalità);
		this.peso = peso;
	}
	
	public void attacca(Mostro m) {
		if(m instanceof MostroDiFuoco)
			if(getEnergia() >= peso/2 && getVitalità() > 0) {
				attacca(peso/3);
				m.difendi();
			}
	}
	
	public String toString() {
		return toString() + "[Peso: " + peso + "]";
	}
	
	int peso;
}
