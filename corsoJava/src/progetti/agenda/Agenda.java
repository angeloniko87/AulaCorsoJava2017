package progetti.agenda;

import java.util.Date;

public class Agenda {
	
	//variabili 
	private Appuntamento [] appuntamenti; //array di tipo appuntamento
	private final int NUM_APPUNTAMENTI=10;	//costante che da la dimensione all'array
	private int contatore=0;
	
	public Agenda(){
		this.appuntamenti= new Appuntamento [NUM_APPUNTAMENTI];	
	}
	
	public void creaAppuntamento(String descrizione, Date data, int priorita){
		if(this.contatore<NUM_APPUNTAMENTI){
			appuntamenti[contatore]=new Appuntamento (descrizione, data, priorita);
		}
		this.contatore++;	
	}
	
	public Appuntamento[] leggiAgenda(){
		return this.appuntamenti;
	}
	
	
	
	

}
