package progetti.dipendenti.v1;

import java.util.ArrayList;

public class Dipendenti {

	
	
	public static void main(String[] args) {
		
		int oreLavorate=100;
		
//		Lavoratore pippo= new Lavoratore("Pippo","Rossi");
//		System.out.println(pippo.calcolaStipendio(oreLavorate));
		
		System.out.println("-------------------");
		
		Fattorino gino= new Fattorino ("Gino", "Verdi");
		System.out.println(gino.calcolaStipendio(oreLavorate));
		
		System.out.println("-------------------");
		
		Impiegato angelo= new Impiegato ("Angelo", "Nicosia");
		System.out.println(angelo.calcolaStipendio(oreLavorate));
		
		System.out.println("-------------------");
		
		Dirigente amedeo= new Dirigente ("Amedeo", "Minozzi");
		System.out.println(amedeo.calcolaStipendio(oreLavorate));
		
		System.out.println("-------------------");
		
		ArrayList<Lavoratore> dipendenti=new ArrayList<>();
//		dipendenti.add(pippo);
		dipendenti.add(gino);
		dipendenti.add(angelo);
		dipendenti.add(amedeo);
		
		for(Lavoratore lavoratore: dipendenti){
			System.out.println(lavoratore.getNome()+ ": " + lavoratore.calcolaStipendio(oreLavorate));
		}
	}

}
