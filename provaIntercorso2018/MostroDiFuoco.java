package provaIntercorso2018;

public final class MostroDiFuoco extends Mostro{

	public MostroDiFuoco(String name, int levelEnergy, int vitality, int power) {
		super(name, levelEnergy, vitality);
		this.power = power;
	}
	
	public void attacca(Mostro m) {
		if(m instanceof MostroDiAcqua) {
			if(getLevelEnergy() < power)
				return;
			updateLevelEnergy(power);
			m.difendi();
		}
		else
			return;
	}
	
	public String toString() {
		return super.toString() + "][Power: " + power + "]";
	}
	
	public boolean equals(Object otherObject) {
		if(!super.equals(otherObject))
			return false;
		MostroDiFuoco m = (MostroDiFuoco) otherObject;
		return power == m.power;
	}
	
	private int power;
}
