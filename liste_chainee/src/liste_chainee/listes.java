package liste_chainee;



public class listes <T>  {
	
//les différentes contraintes de la liste en elle-même :
	
	maillons prems;

// retourne le premier maillon
    public maillons getPrems(){
        return prems;
    }

//Liste vide ?
    public boolean estVide(){
        return prems == null;
    }

// insert en debut de liste
    public void ajouterAuDebut (int valeur){

        maillons ancienprems = prems;
        prems = new maillons(valeur, ancienprems);
    }

// retourne la longueur de la liste
    public int longueurListe(){

        int longueur = 0;
        maillons ref=getPrems();

        while (ref !=null){
            longueur ++;
            ref = ref.getNext();
        }

        return longueur;

    }

// verifie si un element est ds la liste
    public boolean dedans(int v){

        boolean trouver = false;
        maillons ref = getPrems();

        while (!trouver && ref !=null){
            if (ref.getprincipalMaillon() == v){

                trouver = true;

            }else{
                ref = ref.getNext();
            }
        }
        return  trouver;
    }

// inserer en fin de liste
    public void insererFinListe(maillons dernier){
        maillons ref = getPrems();

        while (ref.getNext() != null){
          ref = ref.getNext();
        }

        ref.setNext(dernier);
    }

// donne le dernier element de la liste
    public maillons lastMaillon(){
        maillons ref = getPrems();

        while (ref.getNext() != null){
            ref = ref.getNext();

        }
        //peut retourner le dernier maillon
        return ref;
    }

// suprime un element de la liste
    public void supp(int v){

        if(estVide())
            return;

        if (prems.getprincipalMaillon() == v) {
            prems = prems.getNext();
        }else{

            maillons avant = prems;
            maillons ref = prems.getNext();
            while (ref != null && ref.getprincipalMaillon() != v){

                avant = ref;
                ref = ref.getNext();
            }
            if (ref != null){
                avant.setNext(ref.getNext());
            }
        }
    }

// revoit un string qui concatene la liste
    public String toString (){

        String liste = "";
        maillons ref = getPrems();

        while( ref.getNext() != null){
            liste = (""+ref.getprincipalMaillon()+" ");
        }

        return liste;
}
	}		

