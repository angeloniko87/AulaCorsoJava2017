package esempi.week4;

import myutil.MioScanner;

public class EsempiSwitch {
	public static void main(String[] args) {
		
		MioScanner msc=new MioScanner();
		String s=msc.leggiStringaNonVuota("Inserisci mese abbreviato, 3 lettere max");
		s=s.toLowerCase();
		
		switch(s){
		case"gen": case "dic":
			System.out.println("fa freddo");
			break;
		case"ago":
			System.out.println("fa caldo");
			break;
		case"mar":
			System.out.println("piove!");
			break;
		default: 
			System.out.println("Non ho nulla da dirti su questo mese");
		break;
		
		}
	}
}