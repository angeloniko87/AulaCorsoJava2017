package esempi.week1;
//esempio incremeto
public class PrimoIncremento {

	public static void main(String[] args) {
		int a=1, b; //posso inserire più dati sulla stessa linea
		System.out.println("a vale" +a);
		a++;
		System.out.println("a++ vale" +a);
		b=a++;
				System.out.println("doppio b=a++ a vale " +a +" e b vale"  + b);
                b=++a;
                System.out.println("doppio b=++a a vale " +a +" e b vale"  + b);
	}

}
