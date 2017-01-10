package esempi.week10;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class InfoSistema {
	
	public static void main (String[] args){
	
	File output=new File("testFile/infoSistema.txt");
	
	FileOutputStream fos;
	
	try{
		fos=new FileOutputStream(output);
	}catch(IOException e){
		fos= null;
	}
	
	PrintStream ps= new PrintStream(fos);
	System.setOut(ps);//stampa il risultato sul file infosistema.txt
	
	long tempo=System.currentTimeMillis(); //tempo in millisecondi
	System.out.println("Tempo in millisecondi: " + tempo);
	
	long tsec=tempo/1000; //tempo in secondi
	System.out.println("Tempo in secondi: " + tsec);
	
	long sec=tsec % 60; //tempo in secondi
	long t3=tsec/60; //tempo in secondi
	long min=t3 % 60; //tempo in secondi
	long t4=t3/ 60; //tempo in ore
	
	System.out.println("Tempo in ore: " + t4 + " minuti " + min + " secondi " + sec);
	System.out.println("Tempo trascolso dal 1 gennaio 1970");
	
	System.out.println("Proprietà del sistema");
	String temp=System.getProperty("java.version");
	System.out.println("Versione di Java " + temp);
	
	temp= System.getProperty("java.vendor");
	System.out.println("Vendor " + temp);
	
	temp= System.getProperty("java.home");
	System.out.println("Home " + temp);
	
	temp= System.getProperty("java.vm.version");
	System.out.println("Home " + temp);
	
	System.out.println("Propietà del Sistema Operativo");
	
	temp= System.getProperty("os.version");
	System.out.println("Sistema Operativo " + temp);
	
	temp= System.getProperty("os.name");
	System.out.println("Name " + temp);
	
	temp= System.getProperty("os.arch");
	System.out.println("Harch " + temp);

	temp= System.getProperty("path.separator");
	System.out.println("Separator " + temp);
	
	temp= System.getProperty("user.name");
	System.out.println("User " + temp);
	
	temp= System.getProperty("user.dir");
	System.out.println("User dir " + temp);
	}
}
