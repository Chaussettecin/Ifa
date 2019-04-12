
public class Main {

	public static void main(String[] args) {
		
//--- Chaque animaux à un type et sa friandise préféree --
		
		//Animals animalsFac = new Animals.getType("Type");
		
//-- Méthode sound avec le cri des animaux
		//Animals sonFactory = sonFactory.sound();
		
//-- friandises factory
		//Friandise_Factory  friandiseFactory = Friandise_Factory.miam();
		
	//-- Son factory----		
		Animals a1 = Animals.type("cat");
		Friandise f1 = Friandise_Factory.getMiam("Souris");
			System.out.println("le son du chat est " + a1.sound() + "" + "et sa friandise" + f1.type);
		
//										----------			
			
		Animals a2 = Animals.type("dog");
		Friandise f2 = Friandise_Factory.getMiam("OS");	
			System.out.println("Le son du chien est : " + a2.sound()+ "" + "et sa friandise" + f2.type);
	
//										----------
			
		Animals a3 = Animals.type("redPanda");
		Friandise f3 = Friandise_Factory.getMiam("Bambou");	
			System.out.println("le son du Panda roux " + a3.sound()+ "" + "et sa friandise" + f3.type);
	
//										----------
			
		Animals a4 = Animals.type("Bird");
		Friandise f4 = Friandise_Factory.getMiam("graine");
			System.out.println("le son de l'oiseau" + a4.sound()+ "" + "et sa friandise" + f4.type);

	}

}
