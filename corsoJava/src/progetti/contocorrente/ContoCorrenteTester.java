package progetti.contocorrente;

public class ContoCorrenteTester {

	public static void main(String[] args) {
		ContoCorrente test=new ContoCorrente();
		test.Versamento(1000);
		test.Prelievo(500);
		test.Prelievo(400);
		System.out.println(test.getSaldo()); 
		test.setTasso(0.1);
		System.out.println(test.getSaldo()); 	
	}

}
