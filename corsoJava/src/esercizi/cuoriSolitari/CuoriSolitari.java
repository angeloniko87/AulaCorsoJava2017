package esercizi.cuoriSolitari;

import java.util.Scanner;

public class CuoriSolitari {

	public static void main(String[] args) {
		
		Scanner cs=new Scanner(System.in);
		System.out.println("Benvenuto nel programma Cuori Solitari!");
		
		System.out.println("Inserisci il tuo pseudonimo");
		String pseu1=cs.nextLine();
		
		System.out.println("Inserisci il suo pseudonimo");
		String pseu2=cs.nextLine();
		
		System.out.println("Inserisci il tuo sesso");
		String sesso1=cs.nextLine();
		
		System.out.println("Inserisci il suo sesso");
		String sesso2=cs.nextLine();
		
		System.out.println("Inserisci la tua età");
		int eta1=cs.nextInt();
		
		System.out.println("Inserisci la sua età");
		int eta2=cs.nextInt();
		
		Utente u1= new Utente (pseu1, sesso1, eta1);
		Utente u2= new Utente (pseu2, sesso2, eta2);
		
		System.out.println(u1.testUtente(u1,u2));
		
		System.out.println(u1);
		System.out.println(u2);
		
	}

}
