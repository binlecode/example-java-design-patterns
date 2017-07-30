package sample.designpattern.abstractfactory;

import sample.designpattern.factory.Shape;

/**
 * Provides a standardized way of creating objects by their specific types.
 */
public abstract class AbstractFactory {

    abstract Shape getShape(String shapeType);
    abstract Color getColor(String colorType);


}
