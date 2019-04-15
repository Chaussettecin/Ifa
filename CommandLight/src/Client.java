
public class Client {

	public static void main(String[] args) {
	

	// -- Créa Lumiere 
		Light light = new Light("salon"); 
		
	
	// -- Créa Interrupteur
		Switch inter = new Switch ();
		
	// -- Execution des actions 
		inter.receiveCommand(new OpenSwitch(light));
		inter.receiveCommand(new CloseSwitch(light));
		 	
	}

}
