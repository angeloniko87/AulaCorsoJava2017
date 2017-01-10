package progetti.laboratoriomedico;

public class Paziente implements Persona, Comparable {

	private String nome;
	private String cognome;
	private String cf;
	private Dottore medico;
	
	
	
	public Paziente(String nome, String cognome, String cf) {
		
		this.nome = nome;
		this.cognome = cognome;
		this.cf = cf;
	}

	
	//se le due stringhe sono uguali torna 0, altrimenti torna o 1 o -1.
	@Override
	public int compareTo(Object o) {
		Paziente altro= (Paziente) o;
		int c=this.cognome.compareTo(altro.cognome);
		if(c!=0) return c;
		int n=this.nome.compareTo(altro.nome);
		return n;
	}

	@Override
	public String getNome() {
		
		return nome;
	}

	@Override
	public String getCognome() {
		
		return cognome;
	}

	@Override
	public Medico getMedico() {
		
		return medico;
	}


	public void setMedico(Dottore medico) {
		this.medico = medico;
	}
	
	
}
