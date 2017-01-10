package esercizi.week4;

import java.util.Scanner;

public class RipetiTester {

	public static void main(String[] args) {
		
		String testo;
		int num;
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Inserisci una stringa");
		testo= sc.nextLine();
		
		System.out.println("Inserisci un numero");
		num=sc.nextInt();
		
		Ripeti.stampa(num, testo);
			
		}
		
		
				
			
	}
			
			


