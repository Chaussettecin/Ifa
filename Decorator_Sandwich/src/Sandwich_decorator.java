
public abstract class Sandwich_decorator implements Sandwich {

//--Décoré
	protected static Sandwich Sandwich;
	
	public Sandwich_decorator (Sandwich Sandwich) {
		Sandwich_decorator.Sandwich = Sandwich;
	}
}
