package progetti.aula.v2;

public class Registro {

	final int POSTAZIONE=18; //final è una costante e si scrive in maiuscolo
	
	
	
	Studente[]elenco= new Studente[POSTAZIONE];
	
	public void inizializzaRegistro(){
	elenco[0]= new Studente ("Roberto", "Balzano", 'M');
	elenco[1]= new Studente ("Vittorio", "Bellia",'M');
	elenco[2]= new Studente ("Simone", "Bombaci",'M');
	elenco[3]= new Studente ("Monica", "Canal Monteagudo",'F');
	elenco[4]= new Studente ("Sergio", "Marzullo",'M');
	elenco[5]= new Studente ("Dario", "Mennillo",'M');
	elenco[6]= new Studente ("Anna", "Messina",'M');
	elenco[7]= new Studente ("Amedo", "Minozzi",'M');
	elenco[8]= new Studente ("Antonio", "Morabito",'M');
	elenco[9]= new Studente ("Angelo", "Nicosia",'M');
	elenco[10]= new Studente ("Emilio", "Passannanti",'M');
	elenco[11]= new Studente ("Barbara", "Ruggirello",'F');
	elenco[12]= new Studente ("Gabriele", "Sochet",'M');
	elenco[13]= new Studente ("Alessandra", "Sorrentino",'F');
	elenco[14]= new Studente ("Niccolò", "Triscio",'M');
	elenco[15]= new Studente ("Ferdinando", "Vassallo",'M');
	elenco[16]= new Studente ("Alessandra", "Zilioli",'F');
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
