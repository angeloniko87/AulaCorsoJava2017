package progetti.contocorrente;

public class CompoundInterest {

	double sommaDepositata=1000;
	double percentualeInteresse= 3.5;
	int anni=0;
	
	public void calcolaInteresse(int anni){
		this.anni=anni;
		if(this.anni>1){
			for (int i = 0; i < this.anni; i++) {
				sommaDepositata=sommaDepositata*(1+percentualeInteresse/100);
				System.out.println("Dopo " + (i+1) + " anni, avrai "+ sommaDepositata + " �");
			}
		}
	}
	
	public static void main(String[]args){
	
		CompoundInterest ci= new CompoundInterest();
	
		ci.calcolaInteresse(10);
	}
}
