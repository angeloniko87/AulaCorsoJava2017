package esempi.week1;

public class Confronti {

	public static void main(String[] args) {
		
		boolean b1,b2;
		int i1=3, i2=6;
		char c1='a', c2='b';
		
		b1=i1>=i2;//falso
		System.out.println(b1);

		b2=c1<c2; //vero
		System.out.println(b2);
		
		System.out.println(b1!=b2);// stampa se b1  � diverso da b2
 	}

}
