package primoAppello2018;

public class Iride extends Biometria{

	public Iride(String data, String strumento, String dataAtt, String occhio, String irisCode) {
		super(data, strumento, dataAtt);
		if(irisCode.length() > 6)
			return;
		this.occhio = occhio;
		this.irisCode = irisCode;
	}
	
	public String getOcchio() {
		return occhio;
	}
	
	public String getIrisCode() {
		return irisCode;
	}
	
	public boolean verifica(Biometria b) {
		if(!(b instanceof Iride))
			return false;
			Iride i= (Iride) b;
			return (i.occhio.compareTo(occhio) == 0 && i.irisCode.compareTo(irisCode) == 0);
	}
	
	public double similarità(Biometria b) throws WrongTypeException {
		if(!(b instanceof Iride))
			throw new WrongTypeException();
		Iride i = (Iride) b;
		String irisCode2 = i.getIrisCode();
		int num = 0;
		for(int n = 0; n < 6; n++)
			if(irisCode.charAt(n) == irisCode2.charAt(n))
				num++;
		return num;
		
	}
	
	public String getTipo() {
		return "Iride";
	}
	
	public String getCode() {
		return irisCode;
	}
	
	public String toString() {
		return super.toString() + "[Occhio: " + occhio + "][IrisCode: " + irisCode + "]";
	}
	
	private String occhio;
	private String irisCode;
}
