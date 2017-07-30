package sample.designpattern.abstractfactory;

/**
 * Factory producer class. Provides factory by abstract factory class type.
 * Another way could be providing factory with a common interface.
 * Note the concrete factory instance is depend on input factory type.
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String factoryType) {
        if (factoryType == null) {
            return null;
        } else if (factoryType.equalsIgnoreCase("SHAPE")) {
            return ShapeFactory.getInstance();
        } else if (factoryType.equalsIgnoreCase("COLOR")) {
            return ColorFactory.getInstance();
        }

        return null;
    }

    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        shapeFactory.getShape("CIRCLE").draw();
        shapeFactory.getShape("RECTANGLE").draw();
        shapeFactory.getShape("SQUARE").draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        colorFactory.getColor("BLUE").fill();
        colorFactory.getColor("GREEN").fill();
        colorFactory.getColor("ORANGE").fill();
    }
}
