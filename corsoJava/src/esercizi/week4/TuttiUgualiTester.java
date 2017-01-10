package esercizi.week4;

import java.util.Scanner;

public class TuttiUgualiTester {

	public static void main(String[] args) {
		
		int a,b,c;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Inserisci il Primo Numero");
		a=sc.nextInt();
		
		System.out.println("Inserisci il Secondo Numero");
		b=sc.nextInt();
		
		System.out.println("Inserisci il Terzo Numero");
		c=sc.nextInt();
		
		TuttiUguali.numeri(a, b, c);
		

	}

}
