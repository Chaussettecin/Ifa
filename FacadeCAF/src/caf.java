
public class caf {

//-- Façade et Main
	
	client clt;
	archive arch;
	compta comptabilite;
	recouvrement recouv;
	
	
	caf (){
		clt = new client();
		arch = new archive();
		comptabilite = new compta();
		recouv = new recouvrement();
			
	}
	
	public static void main(String[] args) {
		
	//-- va ouvir un nouveau dossier -
		client newClient = new client();
			newClient.createDossier();
			
	//-- verifie s'il y a des dettes 
		recouvrement verif = new recouvrement();
			verif.dettes();
			
	//-- paiement dettes 
		compta reglementClt = new compta();
			reglementClt.reglement();
			
	}

}
