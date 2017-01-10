package esempi.week11;

import java.math.BigDecimal;

public class Precisione {

	public static void main(String[] args) {
		
		double valore = .012;
		double sommaValori = valore + valore + valore ;  //Questo problema viene risolto con la classe BigDecimal
		System.out.println(sommaValori);
	
		String valStringa = Double.toString(valore); //hoo dovuto trasformare il valore in stringa perché èp quello che vuole BigDecimal
		System.out.println(valStringa);
		
		BigDecimal bigValore  = new BigDecimal(valStringa);
		
		BigDecimal bigSomma = bigValore.add(bigValore).add(bigValore);
		
		System.out.println(bigSomma);
	
	}
}
