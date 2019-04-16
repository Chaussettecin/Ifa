
public class Colis {

/// Statut ou etat du colis
	private State _state; 
	private int numColis;
	
	public Colis() {   
		_state = null;  
		numColis = 0;
	}    
	
	
	public void setState(State newState, int newNumColis) {   
		_state = newState; 
		numColis = newNumColis;
	}    
	
	
	public State getState() {   
		return _state;  
	} 
	 
	
	public int getnumColis() {
		return numColis;
	}

}
