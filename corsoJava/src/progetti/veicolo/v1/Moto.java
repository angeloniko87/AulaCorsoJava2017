package progetti.veicolo.v1;

public class Moto extends Veicolo {
	
	private int numPosti;

	public Moto(int numMatricola, String propiretatio, int numPosti) {
		super(numMatricola, propiretatio);
		this.numPosti = numPosti;
	}

	public int getNumPosti() {
		return numPosti;
	}

	public void setNumPosti(int numPosti) {
		this.numPosti = numPosti;
	}

	@Override
	public String toString() {
		
		return "Numero Matricola: " + super.getNumMatricola()+"\n"+
				"Propiretario: " + super.getPropiretatio() + "\n"+
				"Numero di Posti: " + this.getNumPosti();
	}
	
	

}
