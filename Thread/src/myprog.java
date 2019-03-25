
public class myprog {

public static void main(String[] args) {
		//testThread t1 = new testThread ("thread 1");
		//testThread t2 = new testThread ("thread 2");
		
//Lancer un thread toujours start, même si elle va rechercher dans la méthode Run
	//si on utilise la méthode run, on perd l'avantage du Thread. il va gerer le t1 et quand il 
		//aura fini  il attaquera le t2
		
		//t1.start();
		//t2.start();
		
//une fois lancer on voit dans la console des thread qui vont se lancer simultaner
		//Concurrence
		
	//On peut definir les priorités des thread en amont avant de le lancer
		//t1.getPriority(); //t1 deviens priorité par rapport le 2
		
	// mode sleep il attend 
		//t1.sleep(500);
		
		//t1.isAlive();
		//t1.joint();
	
//meilleure pratique avec l'interface Runnable... Donne juste un objet à executer dans le thread
// et on peut faire hérité l'objet à une autre classe.
	
	//Runnable r1 = new testRunnable ("1");
	
		//Thread tObj1 = new Thread(t1);
		//Thread tObj2 = new Thread(t1);

			//tObj1.start();
			//tObj2.start();
			
	//Thread t1 = new Thread (r1,"test R 1");
	//Thread t2 = new Thread (r1,"test R 1");
			
		//monitors
		//t1.start();
		//t2.start();
		
	//les threads peuvent communiquer entre eux
		//chaque objet = 1 monitors
	
		MonEntier monEntier = new MonEntier();
		new produceur (monEntier);
		new Consumer (monEntier);
	}
}
