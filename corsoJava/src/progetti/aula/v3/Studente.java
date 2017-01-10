package progetti.aula.v3;

public class Studente {
	
	//dichiarazione variabili tipo String, in memoria viene creato uno spazio null
	private String nome, cognome;
	private int matricola = 0;
	private char genere;
	private static int matricolatore=1;
	
	
	public char getGenere() {
		return genere;
	}

	public void setGenere(char genere) {
		this.genere = genere;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getMatricola() {
		return matricola;
	}

	public void setMatricola() {
		this.matricola=matricolatore++;
		
	}

	//overload dei metodi, piu medoti per istanziare un oggetto
	public Studente(){
		this.setMatricola();
	};
	
	public Studente(String cognome){
		this.cognome=cognome;
		this.setMatricola();
	};
	
	
	public Studente(String nome, String cognome, char genere){
		
		// "this.stringa" sta per la variabile dell'instanza Studente.
		this.nome=nome;
		this.cognome= cognome;
		this.setMatricola(); //incremento di 1 della variabile matricola
		this.genere=genere;
	}

	public void presentaStudente() {
		
		System.out.println("Nome: "+this.nome);
		System.out.println("Cognome: "+this.cognome);
		System.out.println("Matricola: "+this.matricola);
		System.out.println("-----------------------------");
	}

	@Override 
	public String toString() {
		return  "Nome: "+this.nome + "\n" +
				"Cognome: "+this.cognome + "\n" +
				"Genere: " +this.genere  + "\n" +
				"Matricola: "+this.matricola + "\n" +
				"------------------------------";
	}
	
	
}
