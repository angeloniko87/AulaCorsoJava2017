package progetti.aula.v1;

import java.util.Date;

public class AulaOld {

	public static void main (String[] args) {
		
		String [] nomi={
				"Roberto",
				"Antonio",
				"Angelo",
				"Amedeo",
				"Dario",
				"Barbara",
};
		
		Studente[] miaAula;
		
		//costruttore di studente, che permette di creare l'oggetto
		miaAula=new Studente[6];
		
		for(int i=0;i<nomi.length;i++){
			miaAula[i]= new Studente(nomi[i], "TEST");
			miaAula[i].stampaSaluto();
			miaAula[i].getNome();
            System.out.println(miaAula[i].getNome());			
			
			
		}
		
		for (int i=0;i<nomi.length;i++){
			
			System.out.println(nomi[i]);
		}
	}


}

		/*
		 Studente studente1= new Studente("Studente1","Cognome");//con l'iniziale maiuscola e le () si chiama costruttor
		studente1.creaStudente("Studente1","Cognome");
		studente1.stampaSaluto();
		studente1.faiAddizione(23, 42);
		
		
		studente1.creaStudente("Studente18","cognomeGiusto");
		studente1.nome="piripacchio";
		System.out.println(studente1.nome);
		studente1.stampaSaluto();
		studente1.faiAddizione(23, 42);
		
		Studente studente2= new Studente("Studente2","Cognome");
		studente2.creaStudente("Studente2","Cognome");
		studente2.stampaSaluto();
		studente2.faiAddizione(23, 42);
		
		
		studente2.creaStudente("Studente28","cognomeGiusto");
		studente2.stampaSaluto();
		studente2.faiAddizione(23, 42);
		
	}
}
*/