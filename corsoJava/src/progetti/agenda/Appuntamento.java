package progetti.agenda;

import java.util.Date;

public class Appuntamento {

	//dichiarazioni variabili
	//le variabili private non possono essere accessibili all'esterno di questa classe
	private String descrizione;
	private Date data;
	private int priorita;
	
	
	//il metodo costruttore usa il nome della classe serve a costruire l'oggetto di tipo Appuntamento
	//costruttore creato con tasto destro del mouse Source/Generate Costruction using Fields
	public Appuntamento(String descrizione, Date data, int priorita) {
		this.descrizione = descrizione;
		this.data = data;
		this.priorita = priorita;
	}
	
	//override, si fa solo con un metodo già esistente
	@Override
	public String toString(){
		return descrizione + " [" + data+ "] " + priorita;
	}
	
		
}
