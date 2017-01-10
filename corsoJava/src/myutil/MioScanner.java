package myutil;

import java.util.Scanner;

public class MioScanner {
	
	private static Scanner lettore= creaScanner();
	private final static String ERR_STRINGA_VUOTA="Non hai inserito alcun carattere";
	 
	private static Scanner creaScanner(){
		
		Scanner sc=new Scanner(System.in);
		sc.useDelimiter(System.lineSeparator());
		return sc;
		
	}
	/**
	 * leggiStringa serve per chiedere una informazione all'utente e ritornare la risposta dell'utente
	 * @param messaggio inserire il messaggio da inviar all'utente
	 * @return la stringa inserito dall'utente
	 */
	public static String leggiStringa (String messaggio){
		
		System.out.println(messaggio);
		return lettore.next();
	}
	
	public static String leggiIntero (int messaggio){
		
		System.out.println(messaggio);
		return lettore.next();
	}

	public static String leggiStringaNonVuota(String messaggio){
		boolean finito=false;
		String lettura=null;
		
		do{
			lettura=leggiStringa(messaggio);
			lettura=lettura.trim();
			
			if (lettura.length()>0)
				finito=true;
			else System.out.println(ERR_STRINGA_VUOTA);
		}
		
		while(!finito);
		
		return lettura ;
	}
}
