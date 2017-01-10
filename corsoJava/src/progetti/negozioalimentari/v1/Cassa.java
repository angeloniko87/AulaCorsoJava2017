package progetti.negozioalimentari.v1;

public interface Cassa {
	//il seguente attributo è per definizione public, static, final
	//attualmente il livello di tassazione 
	double IVA=0.22;
	
	//i metodi sono sempre public e abstract                                 
	//metodi presenti nella classe CassaNegozio
	void leggi(String id, int pezzi)
				throws ProdottoInesistente;
	void stampa();
	void chiude();
	double totale();
	double netto();
	double tasse();
	

}
