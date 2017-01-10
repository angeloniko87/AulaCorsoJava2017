package progetti.veicolo.v1;

public class Camion extends Veicolo {
	
	private int numAssi;

	public Camion(int numMatricola, String propiretatio, int numAssi) {
		super(numMatricola, propiretatio);
		this.numAssi = numAssi;
	}

	public int getNumAssi() {
		return numAssi;
	}

	public void setNumAssi(int numAssi) {
		this.numAssi = numAssi;
	}
	
	@Override
	public String toString() {
		
		return "Numero Matricola: " + super.getNumMatricola()+"\n"+
				"Propiretario: " + super.getPropiretatio() + "\n"+
				"Numero Assi: " + this.getNumAssi();
	}

	

	
}
