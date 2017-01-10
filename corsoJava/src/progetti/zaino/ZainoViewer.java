package progetti.zaino;

import java.util.Scanner;

public class ZainoViewer {
	
	public static void main(String[] args) {
		
		Zaino zaino= new Zaino("New Feel", "Mauro", 5);
		Scanner input= new Scanner (System.in);
		boolean esci= false;
		
		while (!esci){
			
			System.out.println("Inserisci comando");
			String comando=input.next();
			
			if(comando.equals("q")){
				esci=true;
				System.out.println("Arrivederci");
			}else if (comando.equals("elenca")){	
				zaino.elencaCose();		
			}else if (comando.equals("metti")){	
				System.out.println("Scivi nome dell'oggetto  da inserire");
				String nome=input.next();
				System.out.println("Scivi descriozne dell'oggetto da inserire");
				String descrizione=input.next();
				Cosa c=new Cosa(nome, descrizione);
				boolean stato=zaino.iserisciCosa(c);
					if(stato){
						System.out.println("Oggetto inserito correttamente");
					}else{
						System.out.println("non ho inserito l'oggetto "+ c.getNome()+ " perchè lo zaino è gia pieno");
}
					
			}else if (comando.equals("prendi")){	
				zaino.elencaCose();
				System.out.println("Dammi posizione oggetto da prendere");
				int posizione=input.nextInt();
				zaino.prendiCosa(posizione);
				zaino.elencaCose();
			}
			
			
		}

	}

}
