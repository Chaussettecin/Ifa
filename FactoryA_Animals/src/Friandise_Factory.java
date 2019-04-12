
public abstract class Friandise_Factory implements AnimalsInterfaceFactory {

	private static  String Miam;


	public Friandise getFriandise() {
		return getFriandise();
	}



	//-- Méthode friandises -
	public static Friandise getMiam(String type) {
		return (Friandise) Friandise.type(Miam);
	}
	
	
	public Friandise setMiam(Friandise type) {
		return type;
	}
	

//-- Méthode son -
	
	public String sound() {
		return sound();
	}

	
}