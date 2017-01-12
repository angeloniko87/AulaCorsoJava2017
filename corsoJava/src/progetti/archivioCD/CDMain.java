package progetti.archivioCD;

public class CDMain {

	private  final static String BENVENUTO= "Programma per la gestione dell'archivio";
	
	public static void main(String[] args) {
	
		System.out.println(BENVENUTO);
		
		ArchivioCD mioArchivio=new ArchivioCD();
		
		do{
			//esegui il ciclo per inserire i cd
			mioArchivio.inserisciNuovoCD();
		}while(	MioScanner.SiNo("Vuoi inserire un altro CD?")	);{
			
			System.out.println(mioArchivio.toString());
			
		}
		

		
		

	}

}
