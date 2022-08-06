package provaIntercorso2018;

public final class MostroDiAcqua extends Mostro{
	
	public MostroDiAcqua(String name, int levelEnergy, int vitality, int temperature) {
		super(name, levelEnergy, vitality);
		this.temperature = temperature;
	}
	
	public void attacca(Mostro m) {
		if(m instanceof MostroDiPietra) {
			if(getLevelEnergy() < (temperature/2))
				return;
			updateLevelEnergy(temperature/2);
			m.difendi();
		}
		else
			return;
	}
	
	public String toString() {
		return super.toString() + "][Temperatura: " + temperature + "]";
	}
	
	public boolean equals(Object otherObject) {
		if(!super.equals(otherObject))
			return false;
		MostroDiAcqua m = (MostroDiAcqua) otherObject;
		return temperature == m.temperature;
	}

	private int temperature;
}
