package esempi.week2;

import java.util.Scanner; //abbiamo importato la classe Scanner per chiedere da input i dati

public class SimpleCalcolatrice {

	public static void main(String[] args) {
		
		double numeroUno= getInput("inserisci primo numero"); //richiamiamo il metodo getInput
	    double numeroDue= getInput("inserisci secondo numero"); //richiamiamo il metodo getInput
		
		double somma= numeroUno+numeroDue; //somma dei dati ricevuta da input
	
		System.out.println("risultato: " + somma); //stampa il dato finale

	}

	/**
	 * mio metodo per catturare l'input dell'utente
	 * @param domanda String contenente la domanda da inoltrare all'utente
	 * @return un double che rappresenta l'input dell'utente
	 */
	private static double getInput(String domanda) {
		
		Scanner input=new Scanner(System.in); // comando per richiedere i dati da input
		
		int i=domanda.length();//lunghezza nella stringa domanda ".length"
		System.out.println();
		System.out.println(domanda); //comando per stampare a video la domanda
		
		//ciclo per stampare "x" volte il tasto "_", stampa "_" in base ai caratteri presenti in domanda 
		for(int j=0;j<i;j++){
			System.out.print("_");
			}
		
		System.out.println();
		
		double mioDouble=input.nextDouble(); //richiede la variabile da input e la trasforma da string a double
		return mioDouble;
	}

}
