package exoQuatre;

import java.util.Hashtable;
import java.util.Set;

public class compteBq {

	 public static void main(final String[] args) {

//Création d'un Hahstable principal pour la Bq
		 Hashtable<String,Hashtable<String,Integer>> bq = new Hashtable<>();

		 Hashtable<String,Integer> Marie = new Hashtable<String, Integer>();
    	//rappel du Hastable principal de la BQ	
    		bq.put("Marie",Marie);
    				Marie.put("Débit",6);
    				Marie.put("Crédit",9);

    	Hashtable<String,Integer> Julien = new Hashtable<String, Integer>();

    		bq.put("Julien",Julien);
    			Julien.put("Débit",21);
    			Julien.put("Crédit",19);

    	Hashtable<String,Integer> Sophie = new Hashtable<String, Integer>();

    		bq.put("Sophie",Sophie);
    			Sophie.put("Débit",15);
    			Sophie.put("Crédit",10);

    	Hashtable<String,Integer> John = new Hashtable<String, Integer>();

    		bq.put("John",John);
    			John.put("Débit",10);
    			John.put("Crédit",14);

    Set<String> clients = bq.keySet();

    for (String client : clients) {

    	Hashtable<String, Integer> mouv = bq.get(client);

    		int debit = mouv.get("Débit");
    		int credit = mouv.get("Crédit");
    		int valeur = credit - debit;

    		mouv.put("Solde", valeur);
    }

    System.out.println(bq);

	 }
	
}
		
	

	
