
public class Prog {

 

	public static void main(String[] args) {

 //--- Dessiner une forme en 2 D -
    	abstractFactoryShape factory = Factory_Provider.getFactory(ShapeType.SHAPE_FACTORY2D);

        	if (factory == null) {
        		System.out.println("Oupss ! Invalide.");
        		System.exit(1);

        	}

        	//-- getting shape using factory obtained --

       Shape shape = factory.getShape(ShapeType.LINE);

        	if (shape != null) {
        		shape.draw();

        	} else {

            System.out.println("La forme n'existe pas.");

        	}
        
//--- Dessiner une forme 3 D

       factory = Factory_Provider.getFactory(ShapeType.SHAPE_FACTORY3D);

       		if (factory == null) {
       			System.out.println("Cette forme n'exite pas.");
       			System.exit(1);
       		}

      shape = factory.getShape(ShapeType.SPHERE);

      		if (shape != null) {
      			shape.draw();

      		} else {
      			System.out.println("La forme donnée n'existe pas.");
      		}

   }// fin main ---

}
