package primoAppello2018;

public class Volto extends Biometria{
	
	public Volto(String data, String strumento, String dataAtt, String foto) {
		super(data, strumento, dataAtt);
		if(foto.length() > 10)
			return;
		this.foto = foto;
	}
	
	public boolean verifica(Biometria b) {
		if(!(b instanceof Volto))
			return false;
		Volto v = (Volto) b;
		return v.foto.compareTo(foto) == 0;
	}
	
	public double similarità(Biometria b) throws WrongTypeException {
		if(!(b instanceof Volto)) throw new WrongTypeException();
		double n = 0;
		Volto v = (Volto) b;
		for(int i = 0; i < n; i++)
			if(v.foto.charAt(i) == foto.charAt(i))
				n = (1 + 1/(i + 1));
		return n;
	}
	
	public String getTipo() {
		return "Volto";
	}
	
	public String getCode() {
		return foto;
	}
	
	public String toString() {
		return super.toString() + "[Foto: " + foto + "]";
	}
	
	private String foto;
}
