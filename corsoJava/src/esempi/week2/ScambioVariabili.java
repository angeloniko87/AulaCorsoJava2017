package esempi.week2;

import java.util.Scanner;

public class ScambioVariabili {

	public static void main(String[] args) {
		
		int a,b,c;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("inserisci il primo valore intero");
		a=sc.nextInt();
		
		System.out.println("inserisci il secondo valore intero");
		b=sc.nextInt();

		c=a;
		a=b;
		b=c;
		
		if(a==b){
			System.out.println("I 2 valori sono identici e valgono " +a);
		}else{
		
		System.out.println("A= " +a);	
		System.out.println("B= " +b);
		}
	}
		
		

}
