package progetti.negozioalimentari.v1;


import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class CassaNegozio implements Cassa {
	private Map <String, Prodotto> inventario= new HashMap<>();
	private List <Articolo> listaProdotti= new LinkedList<>();
	
	private String idPromozione;
	private int sconto;
	private double totaleLordo;
	
	Scanner sc= new Scanner(System.in);
	
	//metodo che aggiunge un nuovo prodotto dentro l'hashmap
	public void addProdotto(){
		
		System.out.println("Inserisci codice prodotto");
		String id=sc.nextLine();
		System.out.println("Inserisci descrizione Prodotto");
		String desc=sc.nextLine();
		System.out.println("Inserisci prezzo prodotto");
		double prezzoLordo=sc.nextDouble();
		Prodotto prodotto= new Prodotto(id, desc, prezzoLordo);
		inventario.put(id, prodotto); 
	}
	
	//metodo che passa l'id del prodotto e lo sconto da applicare
	public void promozione (String id, int sconto){
		
		idPromozione = id;
		this.sconto=sconto;	
	}
	
	public boolean prodPromozione (Prodotto prodotto){
		return prodotto.getId().equals(idPromozione);
	}
	
	public void leggi(String id, int pezzi) throws ProdottoInesistente{
		
		Prodotto prodotto = (Prodotto) inventario.get(id);
		double prezzo = prodotto.getPrezzoLordo()*pezzi;
		
		if (prodotto == null) 
			throw new ProdottoInesistente();
		
		
		if(prodPromozione(prodotto))
			
			prezzo *= (100-this.sconto)/100.0;
		
		
		listaProdotti.add(new Articolo(prodotto, pezzi, prezzo));
		
		
		 totaleLordo += prezzo;
	}
	
	public void stampa(){
		
		//migliorare lo scontrino
		/*
		System.out.println("Stampa dello scontrino");
		for(Object o: listaProdotti){
			Prodotto prodotto= (Prodotto) o;
			System.out.println(prodotto.getDesc() + "\t\t" + prodotto.getPrezzoLordo());
			
			
		}*/
		Collections.sort(listaProdotti);
		
		//System.out.println(listaProdotti);
		
		for(Object o: listaProdotti){
			Articolo p= (Articolo) o;
		
			System.out.println("Prodotto"+"\t\tPrezzo" + "\t\tPezzi\n"+
					p.ottieniDescrizione() +
					 "\t\t" + p.ottieniPrezzo()+
					"\t\t" + p.ottieniPezzi());
	}
	}
	
	
	public double totale(){
		return totaleLordo;
	}
	
	public double netto(){
		double netto= (totaleLordo/100)*IVA;
		return (totaleLordo-netto);
	}
	
	public double tasse(){
		double tasse=(totaleLordo/100)*IVA;
		return tasse;
	}
	
	public void chiude(){
		listaProdotti =new LinkedList<>();
		totaleLordo=0;
	}

	



	
	

}
