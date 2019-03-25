package exo_json;

import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

public class personne implements serialisable {
	
//part 1 
		// une classe 'Personne'.
		//Cette personne est défini 
		//par un nom, un numéro de téléphone fixe et un numéro de téléphone mobile.


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

	//Modifier la méthode 'serializePersonne' pour accepter un tableau 
	//de Personne (ou créer une nouvelle version de votre méthode).
	//Vous allez donc sérialiser toutes les personnes de ce tableau 
	//et écrire dans un fichier JSon.

	

