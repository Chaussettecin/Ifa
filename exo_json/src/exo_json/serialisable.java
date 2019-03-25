package exo_json;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public interface serialisable {
	
	public static void main(final String argv[]) {

		ObjectInputStream ois = null;
	
			try {
	
				final FileInputStream fichier = new FileInputStream("personne.ser");
				ois = new ObjectInputStream(fichier);
	
				final personne personne = (personne) ois.readObject();
		
				System.out.println("Personne : ");
				System.out.println("nom : " + personne.getNom());
				System.out.println("prenom : " + personne.getPrenom());
				System.out.println("tel fixe : " + personne.gettelFixe());
				System.out.println("tel port : " + personne.gettelPort());
	
			} catch (final java.io.IOException e) {
	
				e.printStackTrace();
	
			} catch (final ClassNotFoundException e) {
	
				e.printStackTrace();
	
			} finally {

				try {
					if (ois != null) {
						ois.close();
					}
		
				} catch (final IOException ex) {
	
				ex.printStackTrace();
		
				}
		
			}
		}
}
