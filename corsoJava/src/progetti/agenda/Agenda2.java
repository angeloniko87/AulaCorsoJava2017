package progetti.agenda;

import java.util.ArrayList;
import java.util.Date;

public class Agenda2 {
	
	//variabili 
	//dentro l'arrayList possiamo mettere solo oggetti e non tipi primitivi
	private ArrayList<Appuntamento> appuntamenti; //arrayList di tipo appuntamento
	
	
	public Agenda2(){
		this.appuntamenti= new ArrayList<>();// <> parentesi angolari chiamate diamond
	}
	
	public void creaAppuntamento(String descrizione, Date data, int priorita){
			//add metodo di arrayList che aggiunge elementi. arrayList è un array ridimensionabile
			appuntamenti.add (	new Appuntamento (descrizione, data, priorita)	);
		}

	public ArrayList<Appuntamento> leggiAgenda(){
		return this.appuntamenti;
	}
	
	
	
	

}
