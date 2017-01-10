package esempi.week1;

public class Booleani {

	public static void main(String[] args) {
		
		boolean b1,b2,b3;
		
		b1=3>5; //restituisce falso
		
		b2=1<2;// restituisce vero
		
		b3=b1 & b2; //& sta per and
		
		System.out.println(b3);
		
		b3= b1 | b2; // ! sta per or
		System.out.println(b3);

	}

}
