package frist_exo;

import java.util.Arrays;

public class boucle_a {

	public static void main (String args []) {
		/*
		 * -- Exercice 1
		 * Reprenez le tableau de l'exercice 3.
		 * En utilisant une boucle, calculez le r√©sultat total des valeurs du tableaux.
		 */
		
		System.out.println("-- EXERCICE 1 --");
		
		int exArray1[] = {30, 15, 5, 10, 46, 2, 9};
		int total = 0;
		
		int i;
		
		for(i = 0; i < exArray1.length; i++) {
			total += exArray1[i];
		}
		
		System.out.println("Le total : " + total);
		
		/*
		 * -- Exercice 2
		 * une boucle pour crÈer un tableau.
		 * Ce dernier doit contenir la table de multiplication de 2.
		 * Table de multiplication de 1 ‡† 10.
		 * Utilisez for et while
		 */
		
		System.out.println("-- EXERCICE 2 --");
		
		int multiFor[] = new int[11];
		int multiWhile[] = new int[11];
		
	// Boucle For
		for(i = 0; i <= 10; i++) {
			multiFor[i] = (i * 2);
		}
		
		System.out.println("Avec la boucle for : " + Arrays.toString(multiFor));
		
	// Boucle While
		i = 0;
		while(i <= 10) {
			multiWhile[i] = (i * 2);
			i++;
		}
		
		System.out.println("Avec la boucle while : " + Arrays.toString(multiWhile));
		
		/*
		 * -- Exercice 3
		 * Reprenez le tableau de l'exercice 3 sur les tableaux.
		 * Trouver la plus petite valeur.
		 * Trouver la plus grande valeur. 
		 */
		
		System.out.println("-- EXERCICE 3 --");
		
		int exArray3[] = {30, 15, 5, 10, 46, 2, 9};
		int max = exArray3[0], min = exArray3[0];
		
		for(i = 0; i < exArray3.length; i++) {
			if(exArray3[i] > max) {
				max = exArray3[i];
			} else if (exArray3[i] < min) {
				min = exArray3[i];
			}
		}
		
		System.out.println("Le minimum : " + min);
	

	}
	
}
	

