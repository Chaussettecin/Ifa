
public class Shape_Factory3d extends abstractFactoryShape {

    Shape getShape(ShapeType name) {

        if (ShapeType.SPHERE == name) {

            return new Sphere();
        }

        return null;

    }

}
