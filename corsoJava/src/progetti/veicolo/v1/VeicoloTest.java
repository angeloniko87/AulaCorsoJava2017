package progetti.veicolo.v1;

import java.util.LinkedList;
import java.util.List;


public class VeicoloTest {

	public static void main(String[] args) {
		
		List<Veicolo> listaVeicoli=new LinkedList<>();
		
		Veicolo auto=new Auto(123, "angelo", "fuoristrada");
		Veicolo camion= new Camion(2135, "amedeo", 4);
		Veicolo moto= new Moto(1235, "dario", 2);
		
		
		System.out.println(auto);
		System.out.println("-------------------");
		System.out.println(camion);
		System.out.println("-------------------");
		System.out.println(moto);
		System.out.println("-------------------");
		
	
		listaVeicoli.add(auto);
		listaVeicoli.add(camion);
		listaVeicoli.add(moto);
		
		for(Veicolo veicolo: listaVeicoli){
	
			System.out.println("Numero Matricola"+"\tPropietario\n" +
					veicolo.getNumMatricola() +
					 "\t\t\t" + veicolo.getPropiretatio());
	}

	}

}
