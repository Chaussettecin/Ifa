
public class Shape_Factory2d extends abstractFactoryShape {
	
	Shape getShape(ShapeType name) {

        if (ShapeType.LINE == name) {
            
        	return new Line();

        } else if (ShapeType.CIRCLE == name) {

            return new Circle();

        } else if (ShapeType.CIRCLE == name) {

            return new Rectangle();
        }
 
        return null;

    }

	
}
