package progetti.aula.v3;

import java.util.ArrayList;

public class Registro {

	//final int POSTAZIONE=18; //final è una costante e si scrive in maiuscolo
	
	//Studente[]elenco= new Studente[POSTAZIONE];
	
	ArrayList<Studente>elenco=new ArrayList<>();
	
	
	
	public Registro(){//costruttore della classe
		elenco.add( new Studente ("Roberto", "Balzano", 'M'));
		elenco.add( new Studente ("Vittorio", "Bellia",'M'));
		elenco.add( new Studente ("Monica", "Canal Monteagudo",'F'));
		elenco.add( new Studente ("Simone", "Bombaci",'M'));
		elenco.add( new Studente ("Sergio", "Marzullo",'M'));
		elenco.add( new Studente ("Dario", "Mennillo",'M'));
		elenco.add( new Studente ("Anna", "Messina",'M'));
		elenco.add( new Studente ("Amedo", "Minozzi",'M'));
		elenco.add( new Studente ("Antonio", "Morabito",'M'));
		elenco.add( new Studente ("Angelo", "Nicosia",'M'));
		elenco.add( new Studente ("Barbara", "Ruggirello",'F'));
		elenco.add( new Studente ("Emilio", "Passannanti",'M'));
		elenco.add( new Studente ("Gabriele", "Sochet",'M'));
		elenco.add( new Studente ("Alessandra", "Sorrentino",'F'));
		elenco.add( new Studente ("Niccolò", "Triscio",'M'));
		elenco.add( new Studente ("Ferdinando", "Vassallo",'M'));
		elenco.add( new Studente ("Alessandra", "Zilioli",'F'));
	}
	
	public void inizializzaRegistro(){
		
	}
	
	
	
	
	/*
	//nuova istanza di studente, crea un nuovo oggetto di tipo Studente. "metodo costuttore"
	Studente s1= new Studente();
	
	//stampa a video la posizione nel registro java dell'oggetto. "reference"
	System.out.println(s1);
	
	//assegno all'oggetto s1 il nome
	s1.nome="Pier Angelo";
	System.out.println(s1.nome);
	
	//assegno all'oggetto s1 il cognome
	s1.cognome="Nicosia";
	System.out.println(s1.cognome);
	
	//s2 vale come s1, puntano entrambi alla stessa posizione nella memoria del registro java
	Studente s2=s1;
	System.out.println(s2);
	System.out.println(s2.nome);
	
	//nuova istanza di studente, crea un nuovo oggetto di tipo Studente, ma essendo nuavo istanza, cambia la posizione della memoria del registro java 
	Studente s3=new Studente();
	s3.nome="Pier Angelo";
	System.out.println(s3);
	System.out.println(s3.nome);
	
	if(s1==s2) System.out.println("sono uguali");else System.out.println("sono diversi");
	if(s1==s3) System.out.println("sono uguali");else System.out.println("sono diversi");
	
	System.out.println();
	
	if(s1.nome==s2.nome) System.out.println("sono uguali");else System.out.println("sono diversi");
	if(s1.nome==s3.nome) System.out.println("sono uguali");else System.out.println("sono diversi");
	
}

	Studente s1= new Studente();
	s1.setNome ("Angelo");
	s1.setCognome ("Nicosia");
	
	System.out.println(s1.toString());
	//s1.presentaStudente();
	/*System.out.println(s1.getNome());
	System.out.println(s1.getCognome());
	System.out.println(s1.getMatricola());
	System.out.println("--------------------------------");
	
	
	Studente s2= new Studente("Messina");
	s2.setNome("Anna");
	System.out.println(s2.toString());
	//s2.presentaStudente();
	
	/*System.out.println(s2.getNome());
	System.out.println(s2.getCognome());
	System.out.println(s2.getMatricola());
	System.out.println("--------------------------------");
	
	Studente s3=new Studente ("Antonio","Morabito");
	System.out.println(s3.toString()); //rappresentazione in formato stringa di un oggetto
	//s3.presentaStudente();
	
	/*System.out.println(s3.getNome());
	System.out.println(s3.getCognome());
	System.out.println(s3.getMatricola());
	System.out.println("--------------------------------");
	
	
*/	
}
