package progetti.archivioCD;

import java.util.Vector;

public class ArchivioCD {
	
	private static final String MESSAGGIO_TITOLO="Inserisci il titolo del CD";
	private static final String MESSAGGIO_AUTORE="Inserisci Autore";
	private static final String MESSAGGIO_ARCHIVIO_VUOTO="Non hai alcun CD";
	private static final String INTESTAZIONE="%n CD N° %d della collezione";
	
	private Vector<CD> listaCD;
	
	
	public ArchivioCD(){
		listaCD=new Vector<>();	
	}

	public void inserisciNuovoCD(){
		
		//leggere l'input da tastiera (titolo)
		String titolo=MioScanner.leggiStringaNonVuota(MESSAGGIO_TITOLO);

		//leggere l'input da tastiera (autore)
		String autore=MioScanner.leggiStringaNonVuota(MESSAGGIO_AUTORE);
		
	
		//CD disco, invocare il costruttore di CD
		CD disco= new CD(titolo,autore);
		
		//aggiungi un disco al vector di CD
		
		listaCD.add(disco);
	}
	
	@Override
	public String toString(){
		
		if (listaCD.size()==0){//se lista non contiene cd
			return MESSAGGIO_ARCHIVIO_VUOTO;//non contiene nulla
				
			} else{
				StringBuffer result= new StringBuffer();
				for(int i=0;i<listaCD.size();i++){
					//appendi stringa al buffer
					result.append(String.format(INTESTAZIONE, i+1));
					CD currCD=listaCD.get(i);
					result.append(currCD.toString());
				}
				return result.toString();
			}
		
	} 
	
	
}
