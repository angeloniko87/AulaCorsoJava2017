package esempi.week2;

public class QuarantaquattroGatti {

	public static void main(String[] args) {
		
		String gatti="Quarantaquattrogattinfilaperseicolrestodidue";
				
		//System.out.println(gatti.length());
		
		for(int i=1 ;i<=gatti.length();i++){
			
			System.out.print(gatti.charAt(i-1));
			
			//condizione se resto "=0" allora stampa la riga
			if(i%6==0){ // % restituisce il resto della divisione
				System.out.println();// 
				
			}
				
			
		}
	}

}
