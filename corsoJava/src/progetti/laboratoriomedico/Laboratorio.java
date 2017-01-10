package progetti.laboratoriomedico;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Laboratorio {

	private static Map<String,Persona> persone= new HashMap<>();
	private static Map<String, Medico> medici= new HashMap<>();
	
	public static void aggiungiPersona(String nome, String cognome, String cf){
		Paziente p=new Paziente(nome, cognome,cf);
		persone.put(cf, p);
	}
	
	public Persona getPersona(String cf) throws ErrPersonaInesistente{
		Paziente p= (Paziente) persone.get(cf);
		if(p==null)throw new ErrPersonaInesistente();
		return p;
	}
	
	public static void aggiungiMedico(String matricola, String nome, String cognome, String cf){
		Dottore d= new Dottore(matricola, nome, cognome, cf );
		persone.put(cf, d);
		medici.put(matricola, d);	
	}
	
	public Medico getMedico(String matricola) throws ErrMedicoInesistente{
		Dottore m= (Dottore) medici.get(matricola);
		if(m==null)throw new ErrMedicoInesistente();
		return m;
	}
	
	public void assegnaMedico(String matricola, String cf) throws ErrMedicoInesistente, ErrPersonaInesistente{
		Dottore d=(Dottore) getMedico(matricola);
		Paziente p = (Paziente) getPersona(cf);
		d.aggiungiPaziente(p);
		p.setMedico(d);
		
		
	}
	
	public static void main(String[] args) {
		Laboratorio test=new Laboratorio();
		test.aggiungiPersona("Mauro", "testA", "test1");
		test.aggiungiPersona("Paolo", "testB", "test2");
		test.aggiungiPersona("nome3", "cognome3", "cf3");
		
		test.aggiungiMedico("mat1", "nome4", "cognome4", "cf4");
		test.aggiungiMedico("mat2", "nome5", "cognome5", "cf5");
		
		try {
			caricaDati("testFile/elenco_persone.txt");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			test.assegnaMedico("mat1", "test1");
			test.assegnaMedico("mat1", "test2");
			test.assegnaMedico("mat2", "cf3");
			test.assegnaMedico("mat1", "MBR45T46Z321K");
			
			Dottore d= (Dottore) medici.get("mat1");
			//d.getPazienti();
			
			for(Paziente p: d.getPazienti()){
			System.out.println(d.getCognome());
			}
		} catch (ErrMedicoInesistente e) {
			e.printStackTrace();
		} catch (ErrPersonaInesistente e){
			e.printStackTrace();
		}

	}

	public static int caricaDati(String nomefile) throws IOException{
		BufferedReader in= new BufferedReader(new FileReader(nomefile));
		
		int numeroRighe=0;
		String linea;
		int countLinee=1;
		
		while( (linea=in.readLine() )!= null){
			
			try{
				//restituisce tutto quello presente nel file txt prima di ogni ";"
				StringTokenizer st= new StringTokenizer(linea,";");
				String tipo=st.nextToken();
				if(tipo.toUpperCase().equals("P")){
					//trim toglie gli spazi alle parole
					String nome=st.nextToken().trim();
					String cognome=st.nextToken().trim();
					String cf=st.nextToken().trim();
					aggiungiPersona(nome, cognome, cf);
				}else{
					String nome=st.nextToken().trim();
					String cognome=st.nextToken().trim();
					String cf=st.nextToken().trim();
					String matricola=st.nextToken().trim();
					aggiungiMedico(matricola,nome, cognome, cf);
				}
				
			}catch(NoSuchElementException e){
				System.err.println("Errore: mancano le seguenti info: " + nomefile + " - " + countLinee);
			}
			countLinee++;
		}
		
		return numeroRighe;
	}
}
