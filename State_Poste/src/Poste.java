
public class Poste {

	public static void main(String[] args) {
		
		
		Colis colis = new Colis(); 
		
		Livraison livraison = new Livraison (); livraison.printStatus(colis,colis);  
		
			System.out.println(colis.getState());
		 
		Livrer re�ue = new Livrer(); re�ue.printStatus(colis, colis); 
		
			System.out.println(colis.getState()); 
		
	}

}
