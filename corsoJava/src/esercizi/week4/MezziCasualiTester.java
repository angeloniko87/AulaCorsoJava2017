package esercizi.week4;

import java.util.Random;

public class MezziCasualiTester {

	public static void main(String[] args) {
		

		double num;
		
		
		Random rm=new Random();
		
		num=rm.nextDouble();
		
		System.out.println("Il numero è: "+num);
		
		MezziCasuali.esegui(num);
		
	}

}
