
public class MainCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//--- Exemple d'operation
		  Calculator user = new Calculator();

	        user.compute('+', 100);
	        user.compute('-', 50);
	        user.compute('*', 10);
	        user.compute('/', 2);

	        // Undo 3 
	        user.undo(3);

	        // Redo 1
	        user.redo(1);

	    }


}
