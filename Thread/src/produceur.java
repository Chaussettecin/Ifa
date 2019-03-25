
public class produceur implements Runnable{

	private MonEntier _monEntier;
	private Thread t; 
	
	public produceur (MonEntier monEntier) {
		this._monEntier = monEntier;
		t= new Thread (this);
		t.setDefaultUncaughtExceptionHandler(new CustomThreadException());
		t.start();
	}

	@Override
	public void run() {
		int i =0;
		
		while (i<10) {
			try {
				i++;
				this._monEntier.set(i);
				System.out.println("Producer set :" + i);
				Thread.sleep(1000); //quand le producer va set une valeur il va s'endormir
			} catch (InterruptedException e){
				System.out.println("Thread interrupted");
			}
		}
		System.out.println("Produceur run end ++");
	}

}
