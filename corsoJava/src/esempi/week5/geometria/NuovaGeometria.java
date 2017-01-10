package esempi.week5.geometria;

public class NuovaGeometria {

	public static void main(String[] args) {
		
		Punto a = new Punto(2, 2);
		Punto b = new Punto(4, 3);
		
		Punto c = new Punto(4, 2);
		Punto d = new Punto(2, 3);
		
		
		System.out.println(a);
		System.out.println(b);
		
		//---------S E G M E N T 0--------
		
		Segmento segmento1 =new Segmento(a,b);
		System.out.println(segmento1.lunghezzaSegmento());
		
		Segmento segmento2=new Segmento(a,c);
		System.out.println(segmento2.lunghezzaSegmento());
		
		//verifica se il risultato del sw, ricevendo da input i valori in modo inverso 
		//asserzione
		Segmento segmento2bis=new Segmento(c,a);
		System.out.println(segmento2bis.lunghezzaSegmento());
		
		Segmento segmento3=new Segmento(c,b);
		System.out.println(segmento3.lunghezzaSegmento());
		
		//---------T R I A N G O L O-----------
		
		Triangolo triangolo1= new Triangolo(a,b,c);
		System.out.println(triangolo1.perimetro());
		System.out.println(triangolo1.area());
		System.out.println(triangolo1.isRettangolo());
	
	
		//-------R E T T A N G O L O--------------	
		
		Rettangolo rettangolo1=new Rettangolo(2, 4, 4, 2);
		System.out.println(rettangolo1);
		
		//-------Q U A D R A T O---------------		
		//quadrato estende rettangolo, quindi possiamo definire un nuovo oggetto quadrato come oggetto della classe rettangolo
		Quadrato quadrato1=new Quadrato (a,5);
		System.out.println(quadrato1);
	
	
	}
		
}
