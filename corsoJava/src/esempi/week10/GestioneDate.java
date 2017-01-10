package esempi.week10;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

public class GestioneDate {

	public static void main(String[] args) {
		
		Date d = new Date();
		System.out.println(d);
		//la classe GregorianCalendar parte a contare i mesi da 0. quindi 11 indicherà dicembre
		GregorianCalendar gc= new GregorianCalendar(2016,11,25);
		System.out.println(gc.getTime());
		
		//aggiunge giorni alla data che noi abbiamo instanziato
		gc.add(GregorianCalendar.DATE, 7);
		Date d2=gc.getTime();
		System.out.println(d2);
		
		//Stampa la data in base alla lingua usata dall'utente
		DateFormat df=DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(df.format(gc.getTime()));
		
		//per scrivere la data  in formato numerico, qui possiamo inserire il mese nel suo numero 
		LocalDate ld=  LocalDate.of(2016,12,25);
		System.out.println(ld);
		
		
		LocalDateTime ldt=  LocalDateTime.now();
		System.out.println(ldt);
		
		DateTimeFormatter dtf=  DateTimeFormatter.ofPattern("d/M/yyyy");
		System.out.println(dtf.format(ld));	

	}

}
