package progetti.dipendenti.v1;

public abstract class Lavoratore {
	
	private String nome, cognome;
	private static final double STIPENDIO_BASE=22;
	
	public Lavoratore(String nome, String cognome) {

		this.nome = nome;
		this.cognome = cognome;
		System.out.println("Ho costruito un oggetto di tipo Lavoratore");
	}

	public double calcolaStipendio (int numeroOre){
		
		return numeroOre * STIPENDIO_BASE;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	
	

}
