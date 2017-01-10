package esempi.week4;


import java.util.Scanner;

public class Contrario {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Inserisci testo:");
		
		String sc= scanner.nextLine();
		
		char[] caratteri=sc.toCharArray();
		
		for(int  i= caratteri.length-1;i>=0;i--) {
			System.out.print(caratteri[i]);
			}

	}
//metodo alternativo
	/*
	 * Scanner scanner=new Scanner(System.in);
		System.out.println("Inserisci testo:");
		
		String sc= scanner.nextLine();
		
		for(int i=s.length()-1;i>=0;i--){
		System.out.print(chaAt(i));
		
		
		}
	 */
}
