package provaInterfaccia;

public interface Measurable {
	double getMeasure();
	default String getPunteggio() {
		return "";
	}
}
