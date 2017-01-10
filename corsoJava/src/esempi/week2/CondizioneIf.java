package esempi.week2;

import java.util.Scanner;

public class CondizioneIf {

	public static void main(String[] args) {
		
		
		double saldo= getInput("inserisci il saldo");
		double richiesta= getInput("inserisci la richiesta");
		
		double nuovoSaldo= saldo - richiesta;
		
		if (saldo>richiesta){
			System.out.println(nuovoSaldo);
		}else{
			System.out.println("Saldo Insufficiente");
		}
				
}

	public static double getInput(String domanda){

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