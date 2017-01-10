package esempi.week3;

public class Stringhe2 {

	public static void main(String[] args) {
/*		
		//costanti classe Math
		System.out.println(Math.PI);
		System.out.println(Math.E);

		//stampa 100 valori a caso con il metodo random della classe Math
		// i numeri random vanno da 0.0  a 1.0 (1.0 escluso) 
		for(int i=1;i<=100;i++){ // conta 100 valori
			int lancio= (int) (Math.random()*6)+1; //per avere i numeri compresi tra 1 e 6 facciamo dei calcoli matemateci e facciamo il cast a int per eliminare i valori dopo la virgola,   
		System.out.println("Lancio " + i+ " : " + lancio ); 
	}*/
		String s="abcdefghilmnopqrstuvz";
		
		char[] caratteri=s.toCharArray();
		String s1="ciao mondo";
		String s2="    ciao ";
		String s3=s2+"mondo";
		
		//confronto tra 2 String
		if(s1.equalsIgnoreCase(s3)){ //verifica che le String siano uguali, ma ignora se i caratteri siano minuscolo o maiuscolo
			System.out.println("Le string sono uguali");
		}
		else {
			System.out.println("Le string sono diverse");
		}
		 
		System.out.println(s1.toUpperCase());//trasfoma la String tutta in maiuscolo
		System.out.println(s3.toLowerCase()); //trasfoma la String tutta in minuscolo
		
		if(s.indexOf("z")>-1)
			System.out.println("La sottostringa è presente posizione: " + s.indexOf("z"));
		
		System.out.println(s1.indexOf("o"));//ritorna la posizione del carattere o parola ricercata	
		System.out.println(s1.indexOf("o",4)); //ritorna la posizione del carattere o parola ricercata a partire dalla 4 lettera
		System.out.println(s1.indexOf("z"));
		System.out.println(s1.lastIndexOf("0"));//ritorna la posizione del carattere o parola ricercata dalla fine
		
		System.out.println(s1.replace('o', 'i')); //sostituisce il carattere 'o' con il carattere 'i' della sting s1
		System.out.println(s2.trim()); //elimina gli spazi prima e dopo la parola
		System.out.println(s2);
		
		
		int temp= s.indexOf("m");
		System.out.println(s.substring(temp));//stampa tutti i valori compreso temp
		System.out.println(s.substring(temp,temp+5)); //stampa tutti i valori compresi tra temp e temp+5		
		System.out.println(s.substring(2,10)); //stampa tutti i valori compresi tra la posizione 2  e 10		
		
		
		
		/*
		// ciclo 100 righe
		for(int i=0;i<100;i++) {
			
			//nuovo ciclo
			for(int j=0;j<6;j++){
				int posCarattere= (int) (Math.random()*s.length());
				
				System.out.print(caratteri[posCarattere]);
				
			}
			System.out.println();
			
	}*/
}
}