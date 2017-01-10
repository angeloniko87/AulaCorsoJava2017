package esercizi.week8;

public class AritmeticaSbagliata {

	public static void main(String[] args) {
		
		int x =10, y=0;
		double z=0.0;
				
		try {
			z=x/y;
			System.out.println(z);
		} catch (ArithmeticException e) {
			System.out.println("Eccezione di tipo aritmetico, devi aver inserito valori non accettabili");
			//e.printStackTrace();
		}
			
		
		
		

	}

}
