package sample.designpattern.abstractfactory;

import sample.designpattern.factory.Circle;
import sample.designpattern.factory.Rectangle;
import sample.designpattern.factory.Shape;
import sample.designpattern.factory.Square;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 8/24/13
 * Time: 4:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class ShapeFactory extends AbstractFactory {
    private static ShapeFactory instance = new ShapeFactory();

    private ShapeFactory() {}

    public static ShapeFactory getInstance() {
        return instance;
    }

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }

    @Override
    Color getColor(String colorType) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //get an object of Circle and call its draw method.
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //call draw method of Circle
        shape1.draw();

        //get an object of Rectangle and call its draw method.
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //call draw method of Rectangle
        shape2.draw();

        //get an object of Square and call its draw method.
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //call draw method of circle
        shape3.draw();
    }
}
