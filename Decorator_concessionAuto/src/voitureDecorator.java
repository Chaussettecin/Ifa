
public abstract class voitureDecorator implements optionVoiture {

//--D�cor� -
		protected static optionVoiture voiture;
		
		
		public voitureDecorator(optionVoiture voiture) {
			voitureDecorator.voiture = voiture;
		}

}
