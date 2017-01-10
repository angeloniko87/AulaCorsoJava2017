package esercizi.week4;

import java.util.Scanner;

public class ConcatenaTester {

	public static void main(String[] args) {
		String a,b,c;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Inserisci la Prima Stringa");
		a=sc.nextLine();
		
		System.out.println("Inserisci la Seconda Stringa");
		b=sc.nextLine();
		
		System.out.println("Inserisci la Terza Stringa");
		c=sc.nextLine();

		Concatena.inserisci(a, b, c);

	}

}
