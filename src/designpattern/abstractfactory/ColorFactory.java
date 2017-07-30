package sample.designpattern.abstractfactory;

import sample.designpattern.factory.Shape;

/**
 * Concrete factory for generating color objects.
 * Factory is normally with singleton scope as there's no need for multiple factories
 * for a specific object type.
 */
public class ColorFactory extends AbstractFactory {
    private static ColorFactory instance;  // class variable of instance to ensure singleton per its class
    private ColorFactory() {}  // privatize default constructor

    public static ColorFactory getInstance() {
        if (instance == null) {
            instance = new ColorFactory();
        }
        return instance;
    }

    @Override
    Shape getShape(String shapeType) {
        return null;
    }

    @Override
    Color getColor(String colorType) {
        if (colorType == null) {
            return null;
        } else if (colorType.equalsIgnoreCase("BLUE")) {
            return new Blue();
        } else if (colorType.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (colorType.equalsIgnoreCase("ORANGE")) {
            return new Orange();
        }
        return null;
    }
}
