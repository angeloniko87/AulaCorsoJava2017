package esempi.week3;

public class Stringhe1 {

	public static void main(String[] args) {
		
		// dichiaro l'oggetto stringa e lo istanzio
		//il metodo length ritorna l'informazione sulla lunghezza della stringa
		String s1="Questa è una stringa!";
		System.out.println(s1);
		System.out.println("La Stringa è lunga: " +s1.length());
				
		// dichiaro l'oggetto stringa e lo istanzio con l'operatore new
		// questa è una particoilarità dell'oggetto String
		String s2= new String("Anche questa è una stringa con pari dignità :)!");
		System.out.println(s2);
		System.out.println("La Stringa è lunga: " +s2.length());
		
		//dichiaro e inizializzo le stringe s3 e s4
		String s3="Aula: ";
		String s4 = "1F";
		
		//le stringhe si possono concatenare con l'operare "+"
		String s5= s3+s4;
		System.out.println(s5);
		
		//la Sting ammette come caratteri anche gli array di "char"
		char[]caratteri= {'c','i','a','o'};
		String s6= new String(caratteri);
		System.out.println(s6);
		// String s6= caratteri è una sintassi errata
		char[] caratteri2=s2.toCharArray();
				
		//Esercizio 1: identifica il carattere spazio nell'array precedente e con un'istruzione "if" non stampare la riga a video
		for(int i=0;i<caratteri2.length;i++) {
		if(caratteri2[i]!=' ')//tutti i valori dell'array diversi dal char ' '
			System.out.println(caratteri2[i]);// stampa l'array di String caratteri2 senza il char ' ' 
			}
		
		//Esercio 2: stampa array di carattere in ordine inverso, in orizzontale e successivamente in verticale	
		for(int  i= caratteri2.length-1;i>=0;i--) {
			System.out.println(caratteri2[i]);
			}
		}	
	}


