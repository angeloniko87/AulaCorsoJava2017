package progetti.agenda;

import java.util.Date;

public class ProvaAgenda {

	public static void main(String[] args) {
		
		Agenda miaAgenda=new Agenda();
		miaAgenda.creaAppuntamento("test1", new Date(), 1);
		miaAgenda.creaAppuntamento("test2", new Date(), 2);
		miaAgenda.creaAppuntamento("test3", new Date(), 3);
		miaAgenda.creaAppuntamento("test4", new Date(), 4);
		miaAgenda.creaAppuntamento("test5", new Date(), 5);
		
		//inserire i dati dentro l'array
		for(int i=0;i<miaAgenda.leggiAgenda().length;i++){
			//rimuove i valori vuoti nell'array
			if(miaAgenda.leggiAgenda()[i]!=null){
				System.out.println(miaAgenda.leggiAgenda()[i]);
			}
		}
		
		miaAgenda.creaAppuntamento("test6", new Date(), 6);
		miaAgenda.creaAppuntamento("test7", new Date(), 7);
		miaAgenda.creaAppuntamento("test8", new Date(), 8);
		miaAgenda.creaAppuntamento("test9", new Date(), 9);
		miaAgenda.creaAppuntamento("test10", new Date(), 10);
		
		for(int i=0;i<miaAgenda.leggiAgenda().length;i++){
			System.out.println(miaAgenda.leggiAgenda()[i]);
		}
		
		miaAgenda.creaAppuntamento("test11", new Date(), 1);

	}

}
