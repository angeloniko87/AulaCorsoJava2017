package esempi.week3;

public class AltriEsempiFor {

	public static void main(String[] args) {
		
		String[] frutti={
			"Mele",
			"Pere",
			"Banane"
		};
		int[] voti={
			18,
			27,
			24,
			29
		};
		
		//scorrere array
		for (int i = 0; i < frutti.length; i++) {
			System.out.println("Vuoi "+frutti[i]+ " ?" );			
		}
		
	System.out.println();	
		// scorrere array nel vorso contrario
		for (int i= voti.length-1; i>=0;i--) {
			System.out.println(voti[i]);
			
		}
		
		//enhanced for (foreach degli altri linguaggi) ciclo for migliorato
		//foreach va solo in ordine crescente
		for (String stringa : frutti) {
			System.out.println(stringa.toUpperCase());
			}
		
		int indice =0;
		for (int i : voti) {
			int test= voti[indice]=i+1;
			System.out.println(test);
			indice++;
		}
		
	}

}
