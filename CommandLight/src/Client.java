
public class Client {

	public static void main(String[] args) {
	

	// -- Cr�a Lumiere 
		Light light = new Light("salon"); 
		
	
	// -- Cr�a Interrupteur
		Switch inter = new Switch ();
		
	// -- Execution des actions 
		inter.receiveCommand(new OpenSwitch(light));
		inter.receiveCommand(new CloseSwitch(light));
		 	
	}

}
