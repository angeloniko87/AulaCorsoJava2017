package progetti.negozioalimentari.v1;

public class Prodotto {
	private String id, desc;
	private double prezzoLordo;
	
	public Prodotto(String id, String desc, double prezzoLordo){
		
		this.id=id;
		this.desc=desc;
		this.prezzoLordo=prezzoLordo;

		
	}

	public String getId() {
		return id;
	}

	public String getDesc() {
		return desc;
	}

	public double getPrezzoLordo() {
		return prezzoLordo;
	}

}
