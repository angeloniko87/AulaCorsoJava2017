package progetti.rubrica.v1;

import java.util.Vector;

public class Rubrica {
	
		private Vector elenco;
		
		public Rubrica() {
			elenco = new Vector();
		} 
		
		public void aggiungiVoce( Object obj) {
			elenco.addElement(obj);
		}
		
		public void eliminaVoce(int posizione){
			
			Object obj=null;
			int size;
			size=elenco.size();
			
			if(size>0){
				obj=elenco.elementAt(0);
				elenco.removeElementAt(posizione);
			}
			
			return;
		}
		
		public int size(){
			return elenco.size();
		}
		
		public void visualizzaElenco(){
			
			Voce voce;
			
			System.out.println("\n##########Rubrica Telefonica#######\n\n");
			
			for (int i=0; i<elenco.size();i++){
				System.out.println("Posizione " + i + " :\n");
				
				voce=(Voce)elenco.elementAt(i);
				voce.stampa();	
			}
			
			
		}
	
		public int eliminaPosizione(){
			int posizione;
			posizione= InputDati.leggiIntero("Inserisci la posizione da eliminare");
			return posizione;
		}

}
