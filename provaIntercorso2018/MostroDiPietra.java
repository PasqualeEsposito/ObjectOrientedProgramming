package provaIntercorso2018;

public final class MostroDiPietra extends Mostro{

	public MostroDiPietra(String name, int levelEnergy, int vitality, int weight) {
		super(name, levelEnergy, vitality);
		this.weight = weight;
	}
	
	public void attacca(Mostro m) {
		if(m instanceof MostroDiFuoco) {
			if(getLevelEnergy() < (weight/2))
				return;
			updateLevelEnergy(weight/2);
			m.difendi();
		}
		else
			return;
	}
	
	public String toString() {
		return super.toString() + "][Peso: " + weight + "]";
	}

	public boolean equals(Object otherObject) {
		if(!super.equals(otherObject))
			return false;
		MostroDiPietra m = (MostroDiPietra) otherObject;
		return weight == m.weight;
	}
	
	private int weight;
}
