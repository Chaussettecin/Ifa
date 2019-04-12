
public class game {


	public static void main(String[] args) {
	
		dice des = new dice(6);
		
		player p1 = new player("Joueur 1", des);
		player p2 = new player("Joueur 2", des);
		player p3 = new player("Joueur 3", des);
		
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		Thread t3 = new Thread(p3);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		
		System.out.println("OHOHOH");
		

	}
}
