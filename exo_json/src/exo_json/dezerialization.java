package exo_json;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class dezerialization {
	
//Partie 3 :
		 //Ecrire une m�thode 'deserializePersonne'
		 //qui va r�cup�rer le contenu 
		// d'un fichier JSon et cr�er un objet Personne correspondant � ces donn�es.

	public static void main (String args []) throws FileNotFoundException, IOException {

			File fichier =  new File("tmp/personne.ser") ;

		// ouverture d'un flux sur un fichier
			ObjectInputStream ois =  new ObjectInputStream(new FileInputStream(fichier)) ;
			
		// d�s�rialization 
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
