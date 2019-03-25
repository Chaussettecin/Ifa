
public class MonEntier {

	private int _valeur;
	private boolean _flag = false;
	
	public synchronized int get() {
		//dire si la méthode est consommé ou pas
		while(! _flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("Thread interrupted");
			}
		}
		_flag = false; // faut le produceur produit la valeur avant le Consumer
		notify(); // dis au Thread de reveiller un thread qui est entrain d'attendre de le monitor
		return this._valeur;
	}
	//l'exception concerne juste un thread
	
	public synchronized void set (int nouvelleValeur) {
		
		while(! _flag) {
			try {
				wait(); // dit que le thread rentre dans cette méthode, il se stop
			} catch (InterruptedException e) {
				System.out.println("Thread interrupted");
			}
		}
		_flag = true;
		this._valeur = nouvelleValeur;
		notify();
		//notifyAll(); //reveille tout les threads en meme temps en fonction des priorité
	}
}
