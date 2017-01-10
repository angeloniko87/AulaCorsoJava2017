package esempi.week3;

import java.util.Scanner;

public class TuttiPositiviPari {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Quanti numeri vuoi inserire?");
		
		int numeri= input.nextInt();
		
		boolean positiviPari= true;
		
		for (int i=0; i <numeri; i++){
			System.out.println("Inserisci prossimo numero");
			int n=input.nextInt();
		
			if (n<0 || n%2!=0) {
				positiviPari=false;
			
			}

		}
						if(positiviPari){
				System.out.println("Tutti positivi e pari");
			}else{
				System.out.println("Non sono tutti positivi e pari");
			}
	}
}
