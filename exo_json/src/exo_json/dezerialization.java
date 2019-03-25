package exo_json;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class dezerialization {
	
//Partie 3 :
		 //Ecrire une méthode 'deserializePersonne'
		 //qui va récupérer le contenu 
		// d'un fichier JSon et créer un objet Personne correspondant à ces données.

	public static void main (String args []) throws FileNotFoundException, IOException {

			File fichier =  new File("tmp/personne.ser") ;

		// ouverture d'un flux sur un fichier
			ObjectInputStream ois =  new ObjectInputStream(new FileInputStream(fichier)) ;
			
		// désérialization 
			personne p = null;
			try {
				p = (personne)ois.readObject();
				ois.getClass();
			} catch (ClassNotFoundException e) {
		
				e.printStackTrace();
			}
	
			System.out.println(p) ;
	}
}
