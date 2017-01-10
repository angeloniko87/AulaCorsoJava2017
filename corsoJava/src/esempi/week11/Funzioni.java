package esempi.week11;

public class Funzioni {

	public static void main(String[] args) {

		salutaStatico(); //questo lo compila perché il metodo saluta è static, altrimenti nisba
		
		Funzioni miaFunc = new Funzioni(); 
		/*
		 * Qui invece ho dovuto far riferirmento ad un oggetto di tipo Funzioni
		 */
		miaFunc.saluta();		
		
		String temp = miaFunc.SalutaPlus("ciao");
		System.out.println(temp);
		System.out.println(temp);
		
	}
	
	public String SalutaPlus(String messaggio){
		
		System.out.println("ciao" + messaggio);
		return "fino a qui tutto bene!";
	}

	private static void salutaStatico() {
		System.out.println("ciao statico");
		
	}

	public void saluta(){
	
	System.out.println("Ciao ");
	}
}
