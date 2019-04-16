
public class Client {

	public static void main(String[] args) {
	
			Context context = new Context(); 
			
			ConcreteEtatA cA = new ConcreteEtatA();
			cA.printStatus(context); 
			
			ConcreteEtatB cB = new ConcreteEtatB();
			cB.printStatus(context);
	}

}
