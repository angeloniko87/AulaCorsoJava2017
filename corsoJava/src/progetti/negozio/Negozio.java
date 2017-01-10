package progetti.negozio;

import java.util.ArrayList;

import progetti.aula.v3.Studente;

public class Negozio {
	private String nome;
	private String nomenegoziante;
	private String indirizzo;
	private String telefono;
	private String SitoWeb;
	private double incasso;
	private ArrayList<Prodotto>prodotti;
	
	public Negozio (String nome, String negoziante){
		setNome(nome);
		setNomenegoziante(negoziante);
		creaProdotti();
		}
	
	public Prodotto vendiProdotto(int pos){
		Prodotto p= prodotti.get(pos-1);
		incasso=incasso+p.getPrezzo();
		
		prodotti.remove(pos-1);
		
		return p;
	}
	
	private void creaProdotti(){
		prodotti=new ArrayList<>();
		prodotti.add(new Prodotto("Panna",0.50));
		prodotti.add(new Prodotto("Cioccolato",1.00));
		prodotti.add(new Prodotto("Pistacchio",0.80));
		prodotti.add(new Prodotto("Crema della nonna",0.90));
		prodotti.add(new Prodotto("Gianduja",1.10));
	}

	public void elencaProdotti(){
		int i=1;
		for (Prodotto prodotto : prodotti){
			System.out.println(i+")" + prodotto.getNome()+ ": " + "prezzo " + prodotto.getPrezzo());
			i++;
		}
		
		
	}
	
	
	
	public ArrayList<Prodotto> getProdotti() {
		return prodotti;
	}

	public void setProdotti(ArrayList<Prodotto> prodotti) {
		this.prodotti = prodotti;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomenegoziante() {
		return nomenegoziante;
	}

	public void setNomenegoziante(String nomenegozio) {
		this.nomenegoziante = nomenegozio;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getSitoWeb() {
		return SitoWeb;
	}

	public void setSitoWeb(String sitoWeb) {
		this.SitoWeb = sitoWeb;
	}

	public double getIncasso() {
		return incasso;
	}

	public void setIncasso(double incasso) {
		this.incasso = incasso;
	}
	
	public void nuovoProdotto(Prodotto prodotto) {
		prodotti.add(prodotto);
	}
	
	
	

	
	
}
