package progetti.laboratoriomedico;

public class ErrPersonaInesistente extends Exception {
	
	public ErrPersonaInesistente(){
		super("Paziente non in elenco");
	}

}
