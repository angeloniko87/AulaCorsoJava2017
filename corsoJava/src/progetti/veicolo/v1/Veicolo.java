package progetti.veicolo.v1;

public class Veicolo {
	
	private int numMatricola;
	private String propiretatio;
	
	
	public Veicolo(int numMatricola, String propiretatio) {
		
		this.numMatricola = numMatricola;
		this.propiretatio = propiretatio;
	}
	
	public int getNumMatricola() {
		return numMatricola;
	}
	public void setNumMatricola(int numMatricola) {
		this.numMatricola = numMatricola;
	}
	public String getPropiretatio() {
		return propiretatio;
	}
	public void setPropiretatio(String propiretatio) {
		this.propiretatio = propiretatio;
	}
	
	
}
