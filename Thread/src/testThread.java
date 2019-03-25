
public class testThread extends Thread {

	public testThread (String name) {
		this.setName(name);
		System.out.println("Thread name :" + this.getName() +"created");
	}
	

//lancer dans le main via start();
	public void run () {
		for (int i=0; i<10;  i++)
			System.out.println(this.getName() +"-i" + i);
		
		System.out.println("Thread run() end --");
		//die
	}


}