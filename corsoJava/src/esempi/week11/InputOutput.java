package esempi.week11;

import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		
		System.out.println("Inserisci un numero intero");
		Scanner scanner= new Scanner(System.in);
		
		int num1= scanner.nextInt();
		
		System.out.println("Inserisci un numero intero");
		int num2=scanner.nextInt();
		
		System.out.println("somma: " + (num1+num2));
		

	}

}
