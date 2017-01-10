package esempi.week1;
//esempio di cast, forzatura del dato
public class Interi {
//errore di conversione da int a byte (perdita dati)
	public static void main(String[] args) {
		int a=12;
		byte b;
		   b= (byte) a; //"cast", forzare il contenuto del valore
		   
    System.out.println(b);
    
	}

}
