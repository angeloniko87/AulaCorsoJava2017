package progetti.automobile.v1;

public class Automobile {
	private String marca;
	private String modello;
	private double cilindrata;
	private double velocita;
	private double velocitaMassima;
	private boolean accesa;
	
	public Automobile(String marca, String modello, double cilindrata) {
		this.marca = marca;
		this.modello = modello;
		this.cilindrata= cilindrata;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModello() {
		return modello;
	}
	
	public void setModello(String modello) {
		this.modello = modello;
	}
	
	public double getCilindrata() {
		return cilindrata;
	}
	
	public void setCilindrata(double cilindrata) {
		this.cilindrata = cilindrata;
	}
	
	
	public double getVelocita() {
		return velocita;
	}
	
	public double getVelocitaMassima() {
		return velocitaMassima;
	}
	
	public void setVelocitaMassima(double velocitaMassima) {
		this.velocitaMassima = velocitaMassima;
	}
	
	public boolean isAccesa() {
		return accesa;
	}
	
	public void accendi() {
		accesa = true;
	}
	
	public void spegni() {
		accesa = false;
		velocita = 0;
	}
	
	public boolean frena() {
		if (isAccesa() && velocita > 0) { 
			velocita--; 
		}
		
		if (velocita > 0) {
			return false;
		}
		return true;
	}
	
	public boolean accelera() {
		
		if (isAccesa() && velocita < velocitaMassima) {
			velocita++;
		}
		
		if (velocita < velocitaMassima) {
			return true;
		}
		return false;
	}
}