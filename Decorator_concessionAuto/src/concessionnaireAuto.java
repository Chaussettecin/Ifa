
public class concessionnaireAuto {

	public static void main(String[] args) {
	
	//-- exemple : Voiture simple - Sans option et prix de base
		optionVoiture voitClassique = new voitureClassique();
			voitClassique.Description();
			voitClassique.Prix();
		
		
	//-- exemple : Voiture + option climatisation et son prix
		optionVoiture voitClim = new climatisationD(new voitureClassique());
			voitClim.Description();
			voitClim.Prix();
		
		
	//-- exemple : Voiture + Climatisation + toitOuvrant + prix 
		optionVoiture voitClimToit = new toitOuvrantD(new climatisationD(new voitureClassique()));
			voitClimToit.Description();
			voitClimToit.Prix();
	
	//-- exemple : Voiture + full option
		optionVoiture voitureFull = new ecranTactileD(new toitOuvrantD(new climatisationD(new voitureClassique())));
			voitureFull.Description();
			voitureFull.Prix();
			 System.out.println(voitureFull);

	}

}
