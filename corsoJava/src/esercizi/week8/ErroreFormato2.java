package esercizi.week8;

import  java.util.Scanner;import  
java.util.InputMismatchException;
public  class  ErroreFormato2 {
	public  static  void  main(String [] args) {
		
		Scanner  input = new  Scanner(System.in);
		
		System.out.println("Inserisci  un  intero");
		
		int x; boolean  ok;
		
		do {
			ok = true;
		try {
			x = input.nextInt ();
			System.out.println(x);
			
		}catch (InputMismatchException e) {
			
			input.nextLine (); 
			System.out.println("Ritenta ...");
			ok = false;
			}
		} while  (!ok);}
}
		
	
