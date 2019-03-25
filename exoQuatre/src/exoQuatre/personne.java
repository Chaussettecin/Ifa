package exoQuatre;


import java.util.HashMap;
import java.util.Set;


public class personne {
//Exercise 3 du S4
	
	public static void main(final String[] args) {

		   HashMap<String, String> personne = new HashMap<>();

		   //Liste des personnes
		   personne.put("Marie" , "Adulte");
		   personne.put("St�phane" , "Enfant");
		   personne.put("Alexandre" , "Adulte");
		   personne.put("Julie" , "Adolescent");
		   personne.put("Sarah" , "Adulte");
		   personne.put("Remi" , "Enfant");
		   
	
		 //variables pour stocker les pr�noms
		   Set<String> prenoms = personne.keySet();
		   		String adultes="";
		   		String enfants ="";

	        //on donne une collection au for, qui parcours les entr�es de la collection. 
		   		//Chaque entr�e est mise dans une variable prenom
	        //A chaque tour de boucle, ici � chaque pr�nom de la collection,

		   	//Ecrire un programme qui affiche les adultes et les enfants 
		   		
		   	for (	String prenom : prenoms) {
		   			String valeur= personne.get(prenom);
	            if(valeur.equals("Adulte")){
	                adultes=adultes +" "+prenom;
	            }
	            else if (valeur.equals("Enfant")){
	                enfants=enfants+" "+prenom;
	            }
	        }

		System.out.println("Voici la liste tri�s par croissance : ");
		System.out.println("      ");
		System.out.println("      ");
	    System.out.println("La liste des adultes :" + "  "+ adultes  + "." );
		System.out.println("-----------------------------------");
		System.out.println("La liste des enfants : " + "  "+ enfants+ ".");
	
	}
	   }

