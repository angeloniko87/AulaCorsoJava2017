package esempi.week3;

import java.util.Scanner;

public class EsempiFor {

	public static void main(String[] args) {
	 
		Scanner input= new Scanner(System.in);
		
		System.out.println("Quanti numeri vuoi sommare?");
		
		int numeri= input.nextInt();
		int somma =0; //Variabile da usare come accumulatore
		
		//ciclo for per i che va da 0 a "numeri" (escluso)
		for (int i=0; i <numeri; i++){
			System.out.println("Inserisci prossimo numero");
			int n=input.nextInt();
			somma+=n; //aggiorna l'accumulatore ed è come scrivere somma=somma+n	
			System.out.println("Fino a qui la somma è = " +somma);
			
		}
		double media= somma/numeri;
		System.out.println("Risultato= " +somma);
		System.out.println("La media è: " + media);
	}

}
