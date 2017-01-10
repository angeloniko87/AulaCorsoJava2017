package progetti.zaino;

import java.util.ArrayList;

public class Zaino {
	
	private String marca, proprietario;
	private int massimoNumeroDiCose;
	private ArrayList<Cosa> cose;
	
	
	public Zaino(String marca, String proprietario, int massimoNumeroDiCose) {
		
		this.marca = marca;
		this.proprietario = proprietario;
		this.massimoNumeroDiCose = massimoNumeroDiCose;
		
		creaCose();
	}
	
	private void creaCose(){
		cose=new ArrayList<>();
		
		cose.add(new Cosa("Portapenne","Uomo Ragno"));
		cose.add(new Cosa("Portachiavi","Wonder Woman"));
	}
	
	public void elencaCose(){
		int i=0; 
		for (Cosa cosa:cose){
		 
			System.out.println(cosa);
			System.out.println(i+ ") " +cosa.getNome() + " " + cosa.getDescrizione());
			i++;
			
		}
		
	}
	
	public boolean iserisciCosa(Cosa c){
		if(massimoNumeroDiCose>cose.size()){
			cose.add(c);
			return true;
		}
		return false;
	}
	
	public Cosa prendiCosa(int posizione){
		Cosa c= cose.get(posizione);
		cose.remove(posizione);
		return c;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public int getMassimoNumeroDiCose() {
		return massimoNumeroDiCose;
	}

	public void setMassimoNumeroDiCose(int massimoNumeroDiCose) {
		this.massimoNumeroDiCose = massimoNumeroDiCose;
	}

	public ArrayList<Cosa> getCose() {
		return cose;
	}

	public void setCose(ArrayList<Cosa> cose) {
		this.cose = cose;
	}

	

	
	
	
	

}
