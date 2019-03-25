package frist_exo;

import java.util.Arrays;

public class test {

	public static void main(String[] args) 
    { 
		
		int tableau[]= {};	
		for (int i= 0; i <tableau.length; i++) {
				System.out.print(tableau[i] + ";");
			}
	}
		
	public static void tableauDeux(int[] tableau) {
		    int i = 0;
		    int vide = -1;
		    while (i < tableau.length && tableau[i] != vide) {
		      System.out.print(tableau[i] + " ; ");
		      i++;
		    }
		  }
		
    // Création d'un tableau et de sa copie 
	public static void tableauCopie(int[] tab) {
        int intArr[] = { 10, 20, 15, 22, 35 }; 
  
        System.out.println("Integer Array: "
                           + Arrays.toString(intArr)); 
  
        System.out.println("\nNew Arrays by copyOf:\n"); 
  
       
        //Affiche une copie du tableau
        	System.out.println("Integer Array: "
                           + Arrays.toString( 
                             Arrays.copyOf(intArr, 10))); 
    } 
	
	
	//Tableau d'entier non trier de 0 à 49;
	
	
 }
