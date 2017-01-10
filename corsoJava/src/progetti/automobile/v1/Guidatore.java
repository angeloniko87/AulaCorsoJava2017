package progetti.automobile.v1;

public class Guidatore {
	
	private String nome;
	private Automobile a;
	private boolean inAuto;
	
	public Guidatore(String nome, Automobile auto) {
		this.nome = nome;
		this.a = auto;
		inAuto = false;
	}
	
	
	public Automobile getAutomobile() {
		return a;
	}
	
	public void acceleraAuto(int velocita) {
		for (int i = 0; i < velocita; i++) {
			a.accelera();
		}
	}
	
	public void frenaAuto(int velocita) {
		for (int i = 0; i < velocita; i++) {
			a.frena();
		}
	}
	
	public void sali() {
		inAuto = true;
	}
	
	public void scendi() {
		inAuto = false;
	}
	
	public void accendiAuto() {
		if (inAuto == true) {
			a.accendi();
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void spegniAuto() {
		if (inAuto == true) {
			a.spegni();
		}
	}
	
	public boolean isInAuto() {
		return inAuto;
	}
}