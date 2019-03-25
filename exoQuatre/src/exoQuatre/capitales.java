package exoQuatre;
//import java.util.HashMap;

//import java.util.LinkedHashMap;
import java.util.Map;
//import java.util.Hashtable; 
import java.util.TreeMap;


public class capitales {
	
//Faire une structure qui permet de stocker une paire clé/valeur.
//Ecrire un programme qui affiche le Pays ET la Capitale sur chaque ligne.
	
	 public static void main(final String[] args) {

		   TreeMap<String, String> maMap = new TreeMap<String, String>();
  
//Liste des pays et des capitales
		   maMap.put("France" , "Paris");
		   maMap.put("Italy" , "Rome");
		   maMap.put("Luxembourg" , "Luxembourg");
		   maMap.put("Belgium" , "Brussels");
		   maMap.put("Denmark" , "Copenheng");
		   maMap.put("Finland" , "Helsinki");
		   maMap.put("Slovakia" , "Bratislava");
		   maMap.put("Slovania" , "Ljubljana");
		   maMap.put("Germany" , "Berlin");
		   maMap.put("Greece" , "Athens");
		   maMap.put("Ireland" , "Dublin");
		   maMap.put("Netherlands" , "Amsterdam");
		   maMap.put("Portugal" , "Lisbon");
		   maMap.put("Spain" , "Madrid");
		   maMap.put("Sweden" , "Stokholm");
		   
		   
		  
		   for (Map.Entry<String, String> element : maMap.entrySet()) {
			   System.out.println("La Capitale de" + "  "+ element.getKey()  + " " + "est" + " "+  element.getValue());
			   System.out.println("-----------------------------------");
		   }
		
	   }
		
}
