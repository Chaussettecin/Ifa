package exoQuatre;

import java.util.Hashtable;
import java.util.Set;

public class densite {
	//Tableau avec les 10 + grandes villes de France
	
	public static void main(final String[] args) {
		
	Hashtable<String,Hashtable<String,Float>> pays = new Hashtable<>();
		
		Hashtable <String, Float> Paris = new Hashtable<String, Float>(); 
			pays.put("Paris", Paris);
	        Paris.put("Habitants",(float)224462);
	        Paris.put("Surface",(float)105.4);

	    Hashtable<String,Float> Marseille = new Hashtable<String, Float>();
	        pays.put("Marseille",Marseille);
	        Marseille.put("Habitants",(float)852516);
	        Marseille.put("Surface",(float)240.6);

		Hashtable<String,Float> Lyon = new Hashtable<String, Float>();
		    pays.put("Lyon",Lyon);
		    Lyon.put("Habitants",(float)496343);
		    Lyon.put("Surface",(float)47.87);

		Hashtable<String,Float> Toulouse = new Hashtable<String, Float>();
		    pays.put("Toulouse",Toulouse);
		    Toulouse.put("Habitants",(float)453317);
		    Toulouse.put("Surface",(float)118.3);
		    
		Hashtable<String,Float> Nice = new Hashtable<String, Float>();
		    pays.put("Marseille",Nice);
		    Nice.put("Habitants",(float)343629);
		    Nice.put("Surface",(float)71.92);
		    
		Hashtable<String,Float> Nantes = new Hashtable<String, Float>();
		    pays.put("Nantes",Nantes);
		    Nantes.put("Habitants",(float)291604);
		    Nantes.put("Surface",(float)65.19);
		    
	Hashtable<String,Float> Strasbourg = new Hashtable<String, Float>();
		    pays.put("Strasbourg",Strasbourg);
		    Strasbourg.put("Habitants",(float)274394);
		    Strasbourg.put("Surface",(float)78.26);
		    
	Hashtable<String,Float> Montpellier = new Hashtable<String, Float>();
		    pays.put("Montpellier",Montpellier);
		    Montpellier.put("Habitants",(float)2244621);
		    Montpellier.put("Surface",(float)105.4);
	
	Hashtable<String,Float> Bordeaux = new Hashtable<String, Float>();
		    pays.put("Bordeaux",Bordeaux);
		    Bordeaux.put("Habitants",(float)241287);
		    Bordeaux.put("Surface",(float)49.36);
		    
	Hashtable<String,Float> Rennes = new Hashtable<String, Float>();
		    pays.put("Rennes",Rennes);
		    Rennes.put("Habitants",(float)209860);
		    Rennes.put("Surface",(float)50.39);
		    
		    
	   Set<String> villes = pays.keySet();

	    for (String ville : villes) {
	    	Hashtable<String, Float> densite = pays.get(ville);

	            float hab = densite.get("Habitants");
	            float surface = densite.get("Surface");
	            float dens = surface/hab;
	            densite.put("Densité", dens);
	     }

	        System.out.println(pays);
	    //Affiche juste le nom des villes en liste
	        System.out.println(villes);
	   //System.out.println(pays);
	              
	}
}

		