package progetti.rubrica.v1;

import java.util.Scanner;

public class Voce {
	
	private String nome;
	private String telefono;
	
	public Voce(){
		
		nome=new String();
		telefono=new String();
	}
	
	public void stampa(){
		
		System.out.println("\nNome: " + this.nome);
		System.out.println("\nTelefono: " + this.telefono);
		System.out.println("\n\n");
	}
	
	public void inserisciVoce(){
		this.nome= InputDati.leggiStringa("inserisci nome");
		this.telefono= InputDati.leggiStringa("inserisci numero di telefono");
	}
	
	
	
	
}
