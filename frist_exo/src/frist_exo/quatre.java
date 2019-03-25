package frist_exo;


public class quatre {

	public static void main (String args []) {
		
		/*
		 * -- Exercice 4
		 * Nous avons un tableau d'entier, non trié, avec tous les nombres de 1 à 50 MAIS il manque un élément (le tableau est donc de taille 49).
		 * L'objectif est de retrouver l’élément qui manque (le nombre manquant).
		 * Cependant, vous avez 3 contraintes:
		 * - Vous n'avez le droit de parcourir le tableau qu'une seule fois!
		 * - Vous n'avez le droit d'utiliser qu'une seule variable!
		 * - Vous ne pouvez pas utiliser de fonctions (tri etc...)
		 */

			System.out.println("-- EXERCICE 4 --");
		
		int missingNumber[] = {9, 1, 8, 7, 2, 6, 5, 3, 10};
		int missing = 0;
		
		// On calcule ce qu'il devrait y 'avoir
		for(int i = 1; i <= missingNumber.length+1; i++) {
			missing += i;
		}
		
		// On enlève chaque élément du tableau
		for(int temp : missingNumber) {
			missing -= temp;
		}
		
		// Le restant est le nombre manquant
		System.out.println("Le nombre manquant : " + missing);
		
	}
}

