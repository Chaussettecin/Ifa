package exoQuatre;

import java.util.Hashtable;
import java.util.Set;

public class compteBq {

	 public static void main(final String[] args) {

//Cr�ation d'un Hahstable principal pour la Bq
		 Hashtable<String,Hashtable<String,Integer>> bq = new Hashtable<>();

		 Hashtable<String,Integer> Marie = new Hashtable<String, Integer>();
    	//rappel du Hastable principal de la BQ	
    		bq.put("Marie",Marie);
    				Marie.put("D�bit",6);
    				Marie.put("Cr�dit",9);

    	Hashtable<String,Integer> Julien = new Hashtable<String, Integer>();

    		bq.put("Julien",Julien);
    			Julien.put("D�bit",21);
    			Julien.put("Cr�dit",19);

    	Hashtable<String,Integer> Sophie = new Hashtable<String, Integer>();

    		bq.put("Sophie",Sophie);
    			Sophie.put("D�bit",15);
    			Sophie.put("Cr�dit",10);

    	Hashtable<String,Integer> John = new Hashtable<String, Integer>();

    		bq.put("John",John);
    			John.put("D�bit",10);
    			John.put("Cr�dit",14);

    Set<String> clients = bq.keySet();

    for (String client : clients) {

    	Hashtable<String, Integer> mouv = bq.get(client);

    		int debit = mouv.get("D�bit");
    		int credit = mouv.get("Cr�dit");
    		int valeur = credit - debit;

    		mouv.put("Solde", valeur);
    }

    System.out.println(bq);

	 }
	
}
		
	

	
