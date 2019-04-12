
public class player implements Runnable {

	private String pseudo;
	private int resultat;
	private dice d;
	
	public player(String pseudo, dice d) {
		this.d = d;
		this.pseudo = pseudo;
	}
	
	public void run() {
		// Mon thread va essayer de lancer le dé
		resultat = d.lancer();
		
		System.out.println(pseudo + " a fait : " + resultat);
	}

}
