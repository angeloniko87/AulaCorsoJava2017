package progetti.aula.v1;

import java.util.Date;

public class Studente {
	
	//stato interno della classe studente, contiene attributi (dati)
	/**
	 * incapsulamento, rendere privati gli attribiti, e quindi creare dei metodi per accedere ai dati
	 */
	private String nome;//valore di tipo stringa, Sting è una classe di java
	private String cognome;
	private Date dataNascita;//Date è importato dalla classe java.util.Date
	int eta; // int ammette valori interi
	char genere; //char ammette caratteri
	boolean presente; // boolean ammette solo valore true o false
	
	/**
	 * metodi - operazioni sui dati
	 */
	// metodo getter per accedere al dato solo se il dato è privato
	public String getNome(){
		
		return "Sgn." +nome;
	}
	//setter medoto per settera il dato
	public void setNome(String nuovoNome){
		
		nome= nuovoNome;
	}
	
	// getter metodo per accedere al dato solo se il dato è privato
		public String getCognome(){
			
			return cognome;
		}
		//setter medoto per settera il dato
		public void setCognome(String cognome){
			
			this.cognome= cognome;
		}
	//metodi costruttori si chiamano come la classe e cominciano per lettera maiuscola e non sono "void"
	public Studente (){}
	//firma del metodo: NomeClasse(tipo parametro nome _parametro, tipo parametro nome1 _parametro1)
	public Studente(String _nome, String _cognome){
		nome=_nome;
		cognome=_cognome;
	} 
	
	public Studente(String _nome, String _cognome,char _genere){
		nome=_nome;
		cognome=_cognome;
		genere=_genere;
	} 
	
	
	/**Metodo per creare un nuovo studente
	 * @param _nome inserire il nome dello studente
	 * @param _cognome inserire il cognome dello studente
	 */
	
	public void creaStudente(String _nome, String _cognome, Date _dataNascita){
		nome=_nome;
		cognome=_cognome;
		dataNascita= _dataNascita;
	}
	
	public void stampaSaluto (){
    
		System.out.println("Ciao!");
    	System.out.println("Mi chiamo " + nome + " " + cognome);
    	
    	if (genere=='M'){
    		System.out.println("Sono di genere Maschile");
    	}else {
    		System.out.println("Sono di genere Femminile");
    	}
    	System.out.println();
		}
	
	public int faiAddizione (int a, int b){
		int somma=a+b;
		System.out.print(nome+" ");
		System.out.println(somma);
		
		return somma;
	}
}
	
