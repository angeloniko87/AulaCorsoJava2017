package esercizi.week8;

import org.omg.Messaging.SyncScopeHelper;

public class EsempioNumeri {

	public static void main(String[] args) {
		
		leggiNumero("123");
		leggiNumero("i23");

	}

	private static void leggiNumero(String string) {
		
		int i=0;
		System.out.println("Parsing di String:" + string);
		
		try {
			i=Integer.parseInt(string);
			System.out.println("i= " + i);
		} catch (NumberFormatException e) {
			
			System.out.println(e.getMessage());
			e.printStackTrace(System.out);
		}
	}

}
