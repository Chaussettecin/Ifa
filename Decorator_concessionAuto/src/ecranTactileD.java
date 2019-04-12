
public class ecranTactileD extends voitureDecorator {

	public ecranTactileD(optionVoiture voiture) {
		super(voiture);
	}


// Méthode de l'interface Decorator  Description + Prix		
	
	@Override
	public String Description() {
		return voiture.Description()+ " + "+ "Ecran Tactile 12'";
	}

	
	@Override
	public int Prix() {
		return 450;
	}

}
