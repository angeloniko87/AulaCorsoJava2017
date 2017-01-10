package progetti.rubrica.v1;

public class Menu {

	public static void main(String[] args) {
		
		Rubrica rubrica= new Rubrica();
		Voce voce;
		int scelta;
		Object obj=null;
		
		for(;;){
			System.out.println("\n############Rubrica Telefonica############\n\n");
			
			System.out.println("1) Per inserire un nuovo nominativo");
			System.out.println("2) Per visualizzare elenco");
			System.out.println("3) Per eliminare un  nominativo");
			System.out.println("4) Esci");
			
			try{
				scelta=InputDati.leggiIntero("\nScegli un'opzione del menù");
			}catch (Exception e) {
				System.out.println("Scelta non corretta");
				continue;
			}
			
			switch(scelta){
			case 1:
				System.out.println("1");
				voce=new Voce();
				voce.inserisciVoce();
				rubrica.aggiungiVoce(obj);;
				break;
				
			case 2:
				System.out.println("2");
				rubrica.visualizzaElenco();
				break;
			
			
			case 3:
				System.out.println("3");
				rubrica.visualizzaElenco();
				int posizione=rubrica.eliminaPosizione();
				rubrica.eliminaVoce(posizione);
				System.out.println("Utente " + posizione + " eliminato");
				break;
			
			case 4:
				System.out.println("Arrivederci");
				return;
				
			default:
				System.out.println("Errore!!!!!!!!!!!!!!!!!!!!!");
				break;
		}

	}

	}
	}
