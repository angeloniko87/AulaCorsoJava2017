package giochi.cartaforbicisasso;

import java.util.Scanner;

public class RockScissorsPaper {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Ciao, per giocare inserisci una delle seguenti lettere");
		System.out.println("Clicca C = Carta");
		System.out.println("Clicca F = Forbici");
		System.out.println("Clicca S = Sasso");
		
		System.out.println("Inserisci la tua mossa");
		String mossaUtente=sc.nextLine().toUpperCase();
		String sceltaUtente="";
		
		if (mossaUtente=="C"){
			sceltaUtente="CARTA";}else{
				if (mossaUtente=="F"){
					sceltaUtente="FORBICI";}
				else{
					sceltaUtente="SASSO";
				}
					
			}
		
		
	
		System.out.println(sceltaUtente);
		
		
		double numeroRandom=Math.random();
		String mossaPc;
		
		if(numeroRandom<0.34){
		mossaPc="Sasso";	
		}else{ if(numeroRandom<=0.67){
			mossaPc="Forbici";}else{
				mossaPc="Carta";
			}
		
			
		}
	
}
}		
	
	
	
