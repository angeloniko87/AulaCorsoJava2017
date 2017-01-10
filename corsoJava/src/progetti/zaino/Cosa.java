package progetti.zaino;

public class Cosa {
	
	private String nome, descrizione;
	
	
	public Cosa(String nome, String descrizione) {
		
		this.nome = nome;
		this.descrizione = descrizione;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDescrizione() {
		return descrizione;
	}


	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}


	@Override
	public String toString() {
		
		return "\n Oggetto contenuto: " + this.getNome()+ "\n Descrizione dell'oggetto: " + this.getDescrizione();
	}
	
	

}
