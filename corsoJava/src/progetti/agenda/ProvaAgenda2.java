package progetti.agenda;

import java.util.Date;

public class ProvaAgenda2 {

	public static void main(String[] args) {
		
		Agenda2 miaAgenda2=new Agenda2();
		miaAgenda2.creaAppuntamento("test1", new Date(), 1);
		miaAgenda2.creaAppuntamento("test2", new Date(), 2);
		miaAgenda2.creaAppuntamento("test3", new Date(), 3);
		miaAgenda2.creaAppuntamento("test4", new Date(), 4);
		miaAgenda2.creaAppuntamento("test5", new Date(), 5);
		
		//inserire i dati dentro l'array
		//.size conta gli elementi e dunque non calcola i valori nulla dentro l'arrayList
		for(int i=0;i<miaAgenda2.leggiAgenda().size();i++){
			//rimuove i valori vuoti nell'array
			if(miaAgenda2.leggiAgenda().get(i)!=null){
				System.out.println(miaAgenda2.leggiAgenda().get(i));
			}
		}
		
		miaAgenda2.creaAppuntamento("test6", new Date(), 6);
		miaAgenda2.creaAppuntamento("test7", new Date(), 7);
		miaAgenda2.creaAppuntamento("test8", new Date(), 8);
		miaAgenda2.creaAppuntamento("test9", new Date(), 9);
		miaAgenda2.creaAppuntamento("test10", new Date(), 10);
		miaAgenda2.creaAppuntamento("test11", new Date(), 11);
		
		for(int i=0;i<miaAgenda2.leggiAgenda().size();i++){
			System.out.println(miaAgenda2.leggiAgenda().get(i));
		}
	}
}
