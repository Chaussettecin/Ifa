
public class animal {

	public static void main(String[] args) {
	
		cat Cat = new cat();
		dog Dog = new dog();
		
		sound soundAdaptator = new soundAdaptator(Cat);
		
		System.out.println("Chat....");
		Cat.makeSound();
		
		System.out.println("Chien....");
		Dog.makeSound();
		
		System.out.println("Sound adapter...");
		soundAdaptator.makeSound();
		
		
		
	}

}
