
public class toitOuvrantD extends voitureDecorator{

	public toitOuvrantD(optionVoiture voiture) {
		super(voiture);
		
	}

	
// Méthode de l'interface Decorator  Description + Prix	
	
	@Override
	public String Description() {
		return voiture.Description() + " + " +"Toit Ouvrant teinté";
	}

	@Override
	public int Prix() {
		return 250;
	}


}
