package exo_json;

import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

public class personne implements serialisable {
	
//part 1 
		// une classe 'Personne'.
		//Cette personne est d�fini 
		//par un nom, un num�ro de t�l�phone fixe et un num�ro de t�l�phone mobile.


	public static void main (String args []){

	}
	
//Variables
	private String nom    = "";
	private String prenom = "";
	private int    telFixe = 0;
	private int    telPort = 0;
	
		public personne(final String nom, final String prenom, final int telFixe, int telPort) {

				this.nom = nom;
				this.prenom = prenom;
				this.telFixe = telFixe;
				this.telPort = telPort;
		}

		public String getNom() {
			return this.nom;
		}

		public String getPrenom() {
			return this.prenom;
		}

		public int gettelFixe() {
			return this.telFixe;
		}
		
		public int gettelPort() {
			return this.telPort;
		}

//setter
		
		public void setNom(final String nom) {
			this.nom = nom;
		}

		public void setPrenom(final String prenom) {
			this.prenom = prenom;
		}
		
		public void settelFixe(final int telFixe) {
			this.telFixe = telFixe;
		}

		public void settelPort(final int telPort) {
			this.telPort = telPort;
		}	
	}
	
	
//Part4 :

	//Modifier la m�thode 'serializePersonne' pour accepter un tableau 
	//de Personne (ou cr�er une nouvelle version de votre m�thode).
	//Vous allez donc s�rialiser toutes les personnes de ce tableau 
	//et �crire dans un fichier JSon.

	

