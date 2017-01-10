package esempi.week9;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Vector;

public class ListDivina1 {

	public static void main(String[] args) {
		
		try{
		//lo scanner in questo caso richiama un file
			
		Scanner file_input= new Scanner(new BufferedReader(new FileReader("testFile/inferno.txt")));
		
		Vector<String> vettore= new Vector<>();
		HashSet<String> hashset=new HashSet<>();
		TreeSet<String> treeset=new TreeSet<>();
		
		//ritona til tempo in millesimi di secondo
		long startTime=System.currentTimeMillis();
		
		while(file_input.hasNext()){
			String s=file_input.next();
			
			vettore.add(s);//inserisce tutti i valori	
			hashset.add(s);//non aggiunge i duplicati
			treeset.add(s);//mette tutto in ordine alfabetico
			
		}
		
		long stopTime=System.currentTimeMillis();
		
		System.out.println("Totale parole: " + vettore.size());
		System.out.println("Totale parole diverse: " + hashset.size());
		System.out.println("Totale parole diverse ordinate alfabeticamente: " + treeset.size());
		System.out.println("Millisecondi impiegati: " + (stopTime-startTime));
		
		
		
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}

}
