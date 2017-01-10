package progetti.aula.v1;

import java.util.Date;
import java.util.Scanner;

public class Aula {

	public static void main (String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	
	Studente studente1= new Studente("Studente1","Cognome1",'M');
	Studente studente2= new Studente("Studente2","Cognome2",'F');
	Studente studente3= new Studente("Studente3","Cognome3",'M');
	Studente studente4= new Studente("Studente4","Cognome4",'M');
	Studente studente5= new Studente("Studente5","Cognome5",'M');
	Studente studente6= new Studente("Studente6","Cognome6",'F');
	Studente studente7= new Studente("Studente7","Cognome7",'M');
	Studente studente8= new Studente("Studente8","Cognome8",'M');
	Studente studente9= new Studente("Studente9","Cognome9",'F');
	Studente studente10= new Studente("Studente10","Cognome10",'M');
	Studente studente11= new Studente("Studente11","Cognome11",'M');
	Studente studente12= new Studente("Studente12","Cognome12",'F');
	Studente studente13= new Studente("Studente13","Cognome13", 'M');
	
	Studente[]elenco= new Studente[13];
	elenco[0]= studente1;
	elenco[1]= studente2;
	elenco[2]= studente3;
	elenco[3]= studente4;
	elenco[4]= studente5;
	elenco[5]= studente6;
	elenco[6]= studente7;
	elenco[7]= studente8;
	elenco[8]= studente9;
	elenco[9]= studente10;
	elenco[10]= studente11;
	elenco[11]= studente12;
	elenco[12]= studente13;
	
	for(int i=0; i<elenco.length;i++){
		elenco[i].stampaSaluto();
		System.out.println("Qual è la risposta corretta?");
	    String tuaRisposta= sc.next();
	}
		}

}