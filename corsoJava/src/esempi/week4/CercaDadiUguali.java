package esempi.week4;

public class CercaDadiUguali {

	static int vittorie=0;
	static int numeroLanci=0;
	static double successi=0.0;
	
	public static void main(String[] args) {
		
		Dado d1= new Dado();
		Dado d2= new Dado();
		
		for(int i=0; i<1000;i++){
		
		numeroLanci++;
			
		d1.lancia();
		d2.lancia();
		
		if (d1.faccia==d2.faccia){
			
			System.out.println("Dado 1: "+d1.faccia+" Dado 2: "+d2.faccia+ " *HAI VINTO!!");
			vittorie++;
		}else{
			System.out.println("Dado 1: "+d1.faccia+" Dado 2: "+d2.faccia);	
		}
		
	
		}
			
		successi=((double) vittorie / (double)numeroLanci)*100;
		System.out.println("La percentuale di vittoria è stata: " +successi+"%");
		
		
		
		
	}

}
