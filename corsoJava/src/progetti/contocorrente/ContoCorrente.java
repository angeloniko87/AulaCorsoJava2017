package progetti.contocorrente;

public class ContoCorrente {
	
	
	private double saldo;
	private double tasso;
	
	public double getSaldo() {
		return saldo+(saldo*tasso);
	}
	
	private void setSaldo(double ammontare) {
		this.saldo +=ammontare;
	}

	public double getTasso() {
		return tasso;
	}
	
	public void setTasso(double tasso) {
		this.tasso = tasso;
	}
	
	public ContoCorrente( double saldo) {
		this.saldo += saldo;
		this.tasso = 0.0;
	}
	
	public ContoCorrente() {
		this.saldo = 0.0;
		this.tasso=0.0;
	}

public void Versamento(double ammontare){
	this.setSaldo(ammontare);
}
public void Prelievo(double ammontare){
		this.setSaldo(-ammontare);
}


}
