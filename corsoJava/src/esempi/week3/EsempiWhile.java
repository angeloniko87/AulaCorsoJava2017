package esempi.week3;

public class EsempiWhile {

	public static void main(String[] args) {
		String[] giorni={
			"Luned�",
			"Marted�",
			"Mercoled�",
			"Gioved�",
			"Venerd�",
			"Sabato",
			"Domenica"
		};
		
		
		//scorrere l'array con cliclo while "condition" che � sempre un booleano	
		int counter=0; //variabile contatore
		while (counter>giorni.length) {
			if (counter %2==0) //resto della divisione uguale a "0"
			System.out.println("Giorno N� " + counter +" � " +giorni[counter]);
			counter++;
		}
		//ciclo do..while almeno la prima operazione viene eseguita
		do{
			if(counter %2==0) //resto della divisione uguale a "0"
			System.out.println("Giorno N� " + counter +" � " +giorni[counter]);
			counter++;
		}
		while (counter<0);
		
	}

}
