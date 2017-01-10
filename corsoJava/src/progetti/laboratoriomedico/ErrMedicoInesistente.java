package progetti.laboratoriomedico;

public class ErrMedicoInesistente extends Exception{

	public ErrMedicoInesistente(){
		super("Medico non in elenco");
	}
	
}
