package esempi.week5.geometria;

public class Segmento {
	
	private Punto a=null;
	private Punto b=null;
	
	//metodo costruttore chiamando 2 oggetti punto
	public Segmento (Punto a, Punto b){
		
		this.a=a;
		this.b=b;
	}
	//metodo costruttore chiamano 4 valori 
	public Segmento(int x1, int y1, int x2, int y2){
		
		this.a= new Punto (x1, y1);
		this.b= new Punto (x2, y2);
	}

	//metodo costruttore vuoto che imposta i 4 valori tutti a 0
	public Segmento(){
		this(0,0,0,0);
	}
	//calcolare la lunghezza del segmento
	public double lunghezzaSegmento(){
		return Math.sqrt(//radice quadrata
				Math.pow((b.getX()- a.getX()),2) + //elevamento a potenza
				Math.pow((b.getY()- a.getY()),2)
				);
	};
}
