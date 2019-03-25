package exo_json;

import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

public class json {

	public static void main (String args []) throws IOException {

		String Nom; 
		String Prenom; 
		int telFixe;
		int telPort; 
		
//fichier Json
		
		JSONObject obj = new JSONObject();
		//obj.put("Liste des personnes");

		JSONArray Personne = new JSONArray();
			
		JSONObject identitePersonne = new JSONObject();
		identitePersonne.put("Nom", "Jean");
		identitePersonne.put("Prenom", "Pierre");
		identitePersonne.put("T. Fixe", "0302030308");
		identitePersonne.put("T. Port", "0602030308");
		
		identitePersonne.put("Nom", "Martin");
		identitePersonne.put("Prenom", "Philippe");
		identitePersonne.put("T. Fixe", "0302030308");
		identitePersonne.put("T. Port", "0602030308");
		
		identitePersonne.put("Nom", "Louis");
		identitePersonne.put("Prenom", "Quatorze");
		identitePersonne.put("T. Fixe", "0302030308");
		identitePersonne.put("T. Port", "0602030308");
		
		identitePersonne.put("Nom", "Michel");
		identitePersonne.put("Prenom", "Aurelie");
		identitePersonne.put("T. Fixe", "0302030308");
		identitePersonne.put("T. Port", "0602030308");
		
		Personne.put(identitePersonne);
		obj.put("Personne",Personne);;
		
		try (FileWriter file = new FileWriter("/Users/stagiaire/Documents/Java/Exercices/test.json")){
			file.write(obj.toString());
			System.out.println(" OK !");	
		} //fin try
	
	}

}
