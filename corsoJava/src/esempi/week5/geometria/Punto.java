package esempi.week5.geometria;

public class Punto {
	
	//realizzo incapsulamento
	private int x=0;
	private int y=0;
	private static int conteggio=0;
	
	//metodo costruttore, non è più disponibile il costruttore di default
	public Punto(int x, int y){
		this.x=x;
		this.y=y;
		this.conteggio++;
	}

	public int getX() {
		//posso fare altre operazioni
		return x;
	}

	//normalmente con set si usa il void
	public void setX(int x) {
		//dovrei fare altre operazioni
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public static int getConteggio() {
		return conteggio;
	}

	public static void setConteggio(int conteggio) {
		Punto.conteggio = conteggio;
	}
	
	@Override
	public String toString(){
		return "( "+x+" , "+y+" )";
	}
	
}
