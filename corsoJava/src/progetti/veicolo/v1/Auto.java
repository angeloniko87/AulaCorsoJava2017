package progetti.veicolo.v1;

import org.omg.Messaging.SyncScopeHelper;


public class Auto extends Veicolo {

	private String tipo;
	
	public Auto(int numMatricola, String propiretatio, String tipo) {
		super(numMatricola, propiretatio);
		this.tipo=tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	
	@Override
	public String toString() {
		
		return "Numero Matricola: " + super.getNumMatricola()+"\n"+
				"Propiretario: " + super.getPropiretatio() + "\n"+
				"Tipo: " + this.getTipo();
		
		
	}

	
	
	
	
	
}
