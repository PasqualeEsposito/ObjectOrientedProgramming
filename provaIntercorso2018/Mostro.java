package provaIntercorso2018;

public abstract class Mostro {
	
	public Mostro(String name, int levelEnergy, int vitality) {
		this.name = name;
		this.levelEnergy = levelEnergy;
		this.vitality = vitality;
	}
	
	public String toString() {
		return getClass().getName() + ": " + "[Nome: " + name + "][Livello di energia: " + levelEnergy + "][Vitalità: " + vitality;
	}
	
	public boolean equals(Object otherObject) {
		if(otherObject == null)
			return false;
		if(getClass() != otherObject.getClass())
			return false;
		Mostro m = (Mostro) otherObject;
		return name == m.name && levelEnergy == m.levelEnergy && vitality == m.vitality;
	}
	
	public int getLevelEnergy() {
		return levelEnergy;
	}
	
	public int getVitality() {
		return vitality;
	}
	
	public void updateLevelEnergy(int energy) {
		levelEnergy -= energy;
	}
	
	public void difendi() {
		vitality--;
	}
		
	public abstract void attacca(Mostro m);
	
	
	private String name;
	private int levelEnergy;
	private int vitality;
}
