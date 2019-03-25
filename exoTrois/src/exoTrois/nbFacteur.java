package exoTrois;
import java.util.Scanner;

public class nbFacteur {
	
	public static void main(String[] args) {
		 int nbreUse = 0;
		 int factoriel =1;
		 int cal;
		 
		//lance le programme
		System.out.println ("----- C'est parti ! -----");
		System.out.println ("   ");
		 
		//demande un nbre à l'user	
		System.out.println ("Veuillez entrer un nombre :" );
		Scanner sc = new Scanner (System.in);
			nbreUse = sc.nextInt();
		
			//Prens le chiffre et calcul son factoriel
			for (int i=1; i<=nbreUse; i++) {
				 factoriel= factoriel*1;
			}
			 
		System.out.println ("   ");
		System.out.println ("   ");
		System.out.println ("Voici le calcul de sa factoriel : ");
		System.out.println (factoriel);
		System.out.println ("------------------------------------");
			
	
	}
}
