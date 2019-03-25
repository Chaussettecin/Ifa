
public class testRunnable implements Runnable{

	private String _name; 
	
	public testRunnable (String name) {
		this._name = name;
		
		System.out.println("Runnable object" + this._name + "created");
	}

	
	@Override
	public void run() {
		printNumber();
		System.out.println("");
	}
	
	
	//synchroniser les thread : concept = monitor
	//un seul thread peut vérouiller un monitor à la fois
	
	public synchronized void printNumber() {
		for (int i=0; i<10;  i++)
			System.out.println(this._name() +"-i" + i);
		
		System.out.println("Thread run() end --");
		//die
	}
	
	private String _name() {
		// TODO Auto-generated method stub
		return _name;
	}

}
