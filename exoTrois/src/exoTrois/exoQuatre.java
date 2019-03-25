package exoTrois;

import java.util.Arrays;

public class exoQuatre {
	
	public static void main(String[] args) {
	
	System.out.println ("Etant donné un tableau d'entiers, retourner vrai si la séquence de nombre '1,2,3' se trouve quelque part dans ce tableau");
	System.out.println (" ");
	System.out.println (" ");
	System.out.println ("----- C'est parti ! -----");
		

	int[] tabEntiers = {1, 9, 8, 8, 7, 6, 5, 4, 3, 3, 2, 1};

	        Arrays.sort(tabEntiers);
	        int nbOccurences = 0;

	        //Programme qui va chercher les occurences dans le tableau
	        for (int i = 0, length = tabEntiers.length - 1; i < length; i++) {
	            if (tabEntiers[i] == tabEntiers[i + 1]) {
	                nbOccurences++;
	            }
	        }

	        System.out.println("");
	        System.out.println("");
	        System.out.println("Les occurences dans le tableau sont : " + nbOccurences);

	}
	
}
