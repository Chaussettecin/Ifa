package exoSdeux;
import java.util.Scanner;
 
//On attend une entrée de la part de l'utilisateur.
//Si il tape un entier, tester si ce nombre est un entier premier ou non.

public class exoDeux {
 
	public static void main(String[] args) {
		 
		int entTest;
			System.out.println ("----- C'est parti !. -----");
		
		//Demande à l'utilisateur de taper un nombre
			System.out.println ("Veuillez entrer un nombre :" );
		
				Scanner nb = new Scanner (System.in);
						entTest = nb.nextInt();
			
		for(int i =2; i<entTest-1;i++) {
		//a finir la logique de la boucle
		}
			System.out.println ("Fin du programme");
	 }
}
