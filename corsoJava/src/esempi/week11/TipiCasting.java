package esempi.week11;

public class TipiCasting {

	public static void main(String[] args) {
		
		int valore1=56;
		int valore2=valore1;
		System.out.println(valore2);

		//promotion
		long valoreLong1=valore1;
		System.out.println(valoreLong1);
		
		//casting
		short valoreShort1=(short) valore1;
		System.out.println(valoreShort1);
		
		int valore3= 1024;
		byte valoreByte1=(byte) valore3;
		System.out.println(valoreByte1);
		
		//la d finale serve a far interpretare che il numero è un double
		double valoreDouble1=3.99999d;
		int valoreInt1= (int)valoreDouble1;
		System.out.println(valoreInt1);
	}

}
