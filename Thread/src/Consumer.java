
public class Consumer implements Runnable{

	private MonEntier _monEntier;
	private Thread t; 
	
	//avoir une ref aussi à MonEntier
	public Consumer (MonEntier monEntier) {
		this._monEntier = monEntier;
		t= new Thread (this);
		t.start();
	}

	//la méthode run change par rapport au produceur
	@Override
	public void run() {
		int i =0; 
		
		while (i<10){
			i= this._monEntier.get();
			System.out.println("Consumer get :" + i);
		}
		
		System.out.println("-- Consumer Run End --");
	}

}
