package esercizi.cuoriSolitari;

public class Utente {
	
	private String pseudonimo;
	private String sesso;
	private int eta;
	private final int DIFETA=10; 
	
	public String getPseudonimo() {
		return pseudonimo;
	}
	
	public String getSesso() {
		return sesso;
	}
	
	public int getEta() {
		return eta;
	}

	public Utente (String pseudonimo, String sesso, int eta){
		
		this.pseudonimo=pseudonimo;
		this.sesso=sesso;
		this.eta=eta;	
	}
	
	public String testUtente(Utente u1, Utente u2){
		
		if(u1.getSesso().equals(u2.getSesso())){
		return ( "non sono potenzialmente affine");
	}
		if (Math.abs(u1.getEta()-(u2.getEta()))<DIFETA){
		return ( "sono potenzialmente affine");
		}else {
			return ("non sono potenzialmente affine");
		}
	}

	
	@Override
	public String toString(){
		return ("Utente: " +this.getPseudonimo() + ", " + this.getSesso() + ", " + this.getEta());
	}
	
}
