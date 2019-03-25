package liste_chainee;

public class maillons {


	//les diff�rentes contraintes de ces maillons : 

	//- Chaque maillon contient un �l�ment de la liste.
	//- Chaque maillon contient une r�f�rence vers le maillon suivant sauf le dernier maillon de la liste.
	
	//- On doit pouvoir consulter la valeur d'un maillon (ou d'un �l�ment).
	//- On doit pouvoir modifier cette valeur.
	//- On doit pouvoir acc�der � l'�l�ment suivant depuis un maillon.
	//- On doit pouvoir modifier l'�l�ment suivant.
	

	    private int principalMaillon;
	    private maillons suivant;

	    // maillon complet
	    public maillons (int principalMaillon, maillons suiv){

	        this.principalMaillon = principalMaillon;
	        this.suivant = suiv;

	    }

	    // Maillon seul ou dernier maillon
	    public maillons (int principalMaillon){

	        this.principalMaillon = principalMaillon;
	        this.suivant = null;

	    }

	    // getter
	    public int getprincipalMaillon() {
	        return principalMaillon;
	    }

	    public maillons getNext() {
	        return suivant;
	    }

	    // setter

	    public void setprincipalMaillon(int principalMaillon) {
	        this.principalMaillon = principalMaillon;
	    }

	    public void setNext(maillons suiv) {
	        this.suivant = suiv;
	}
	    
}
