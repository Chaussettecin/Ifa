
public class climatisationD extends voitureDecorator{

	public climatisationD(optionVoiture voiture) {
		super(voiture);
	}

	
// Méthode de l'interface Decorator  Description + Prix	
	
	@Override
	public String Description() {
		return voiture.Description() + "Climatisation";
	}

	@Override
	public int Prix() {
//-- Prix de base + option
		return voiture.Prix() +250;
	}

}
