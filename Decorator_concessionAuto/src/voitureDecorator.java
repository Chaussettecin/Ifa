
public abstract class voitureDecorator implements optionVoiture {

//--Décoré -
		protected static optionVoiture voiture;
		
		
		public voitureDecorator(optionVoiture voiture) {
			voitureDecorator.voiture = voiture;
		}

}
