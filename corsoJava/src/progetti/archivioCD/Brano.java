package progetti.archivioCD;

public class Brano {
	
	String titolo;
	int durata;
	
	
	public Brano(String t, int d){
		this.titolo=t;
		this.durata=d;
	}

	@Override
	public String toString(){
		return "Brano";
	}
}
