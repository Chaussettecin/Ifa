
public abstract class Friandise_Factory implements AnimalsInterfaceFactory {

	private static  String Miam;


	public Friandise getFriandise() {
		return getFriandise();
	}



	//-- M�thode friandises -
	public static Friandise getMiam(String type) {
		return (Friandise) Friandise.type(Miam);
	}
	
	
	public Friandise setMiam(Friandise type) {
		return type;
	}
	

//-- M�thode son -
	
	public String sound() {
		return sound();
	}

	
}