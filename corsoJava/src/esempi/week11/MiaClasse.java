package esempi.week11;

public class MiaClasse{		
		
	public int mioNumero;
	Integer mioNum2=14;
		
	//metodo costruttore
	//conveziona di naming: si chiama come la classe, perciò inizia con la lettere maiuscola
	//non ha tipo di ritorno: la sua funzione è costruire l'oggetto
	public MiaClasse(){
		mioNumero=1;
		
	}
	
	public void mioMetodo(){
		System.out.println("Ciao");
	}
	
	@Override
	public String toString(){
		return "esemplare di MiaClasse " + getClass().getName()+ mioNum2;
	}
	
	public static void main(String[] args) {
		MiaClasse mc=new MiaClasse();
		System.out.println(mc);
		MiaClasse mc2=mc;
		System.out.println(mc2);
		
		mc=null;
		mc2=null;
		
		System.out.println(mc);
		System.out.println(mc2);
		
	}
}


