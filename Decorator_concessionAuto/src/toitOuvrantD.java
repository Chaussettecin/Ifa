
public class toitOuvrantD extends voitureDecorator{

	public toitOuvrantD(optionVoiture voiture) {
		super(voiture);
		
	}

	
// M�thode de l'interface Decorator  Description + Prix	
	
	@Override
	public String Description() {
		return voiture.Description() + " + " +"Toit Ouvrant teint�";
	}

	@Override
	public int Prix() {
		return 250;
	}


}
