
public class Factory_Provider {

    
	public static abstractFactoryShape getFactory(ShapeType fType) {

        if (ShapeType.SHAPE_FACTORY2D == fType) {

            return new Shape_Factory2d();

        } else if (ShapeType.SHAPE_FACTORY3D == fType) {

            return new Shape_Factory3d();
        }

        return null;

    }
	
}
