
public interface Command {

	public void execute();
	
//-- Methode pour retour en arrière
	 public void unExecute();
}
