
public class Sandwicherie {

	public static void main(String[] args) {

	//-- Sandwich de base
		Sandwich_classique Sandwich = new Sandwich_classique();
					Sandwich.Description();
					System.out.println(Sandwich);
				
	//-- exemple : Sandwich style Jambon fromage
		Sandwich_decorator sandBeurre = new JambonD(new Sandwich_classique());
					sandBeurre.Description();
					System.out.println(sandBeurre);
				
	//-- exemple : Sandwich Style viande et fromage
		Sandwich_decorator sandViande = new viandeHachee(new Sandwich_classique());
					sandViande.Description();
					System.out.println(sandViande);
			
	//-- exemple : Sandwich legumes + fromages
		Sandwich_decorator sandVeggie = new poivronD(new Sandwich_classique());
					sandVeggie.Description();
					System.out.println(sandVeggie);

	//-- exemple : Sandwich Full
		Sandwich_decorator sandFull = new JambonD(new viandeHachee (new poivronD(new Sandwich_classique())));
					sandFull.Description();
					System.out.println(sandFull);		
		
	}
	
}
