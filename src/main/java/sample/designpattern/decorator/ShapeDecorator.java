package sample.designpattern.decorator;

/**
 * Decorator pattern allows to add new functionality an existing object
 * without altering its structure.
 * The key difference between decorator pattern and adaptor pattern is that
 * adaptor pattern does not introduce new logic while decorator does.
 * In other words, adaptor is to fix the interface mismatch, while decorator
 * is to fill up the missing logic.
 *
 * In this code example, the decorator has an abstract class to support flexible
 * implementations via subclasses.
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public abstract void draw();
}
