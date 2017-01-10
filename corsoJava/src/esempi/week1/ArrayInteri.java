package esempi.week1;

public class ArrayInteri {

	public static void main(String[] args) {
		
		int [] ora; //stiamo dichiaranto un array di interi, possiamo anche dichiarlo con "int ora[];"
		
		//inizializzo array monodirezionale
		//array è un oggetto particolare
		ora= new int[7];//[7] allocazione in memoria è 7 in questo caso
		
		//compilazione array
		ora[0]=10;
		ora[1]=9;
		ora[2]=8;
		ora[3]=7;
		ora[4]=6;
		ora[5]=5;
		ora[6]=4;
		
		for (int i=0;i<=ora.length;i++){
			if(i<7)
			
			System.out.println("il giorno " + i + " della settimana lavoo " + ora[i] + " ore");
		}
	}

}
