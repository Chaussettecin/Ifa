package frist_exo;

import java.util.Arrays;

public class two {

	//construction du tableau
	
	public static void main (String args []) {
		
		String tableauCaractere[] = {"Apple", "Strawberry", "Pineapple" , "Lemon"};
		
			//mettre les valeurs par odre alphabétique
			Arrays.sort(tableauCaractere);
		
			//afficher la valeur de la seconde position 
			 System.out.println("A l'emplacement " + 1 +" dans le tableau nous avons le fruit = " + tableauCaractere[1]);
	
			 // Convert données en string
			 System.out.println("Voici le contenu du tableau : " + Arrays.toString(tableauCaractere));
			
	}
}

