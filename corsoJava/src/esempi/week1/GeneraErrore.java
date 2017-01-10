package esempi.week1;

public class GeneraErrore {

	public static void main(String[] args) {
		
		int a =10;
		int b =0;
		
		int i=5, j=2,k=0;
		boolean b1;
		b1= (i>j) | (i>(j/k));
		
		
		
		System.out.println("il risultato della divisione è: " +a/b);//genera errore per via dello 0
		System.out.println("il risultato di b1 è: "+ b1);//genera errore per via dello 0
//ci accorgiamo dell'errero solo in runtime, la compilazione del programma è corretta
	}

}
