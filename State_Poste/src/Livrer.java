
public class Livrer implements State{

	@Override
	public void printStatus(Colis colis,Colis numColis) {
		
		System.out.println("Votre colis" + colis + "est livrer au client");
		
		colis.setState(this, 0);  
	}    
	
	public String toString() {   
		return "Status : Livrer !";  
	}
	 
}




