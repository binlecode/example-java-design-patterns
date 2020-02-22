package sample.designpattern.bridge;

/**
 * This is the abstract class that employs a {@link sample.designpattern.bridge.DrawAPI} member object to
 * aid its own subclasses (such as {@link sample.designpattern.bridge.Shape} functionality.
 * With the bridging of {@link sample.designpattern.bridge.DrawAPI} interface, Shape subclasses
 * can be developed independent from DrawAPI implementation classes, and vice versa.
 */
public abstract class Shape {

    protected DrawAPI drawer;

    protected Shape(DrawAPI drawer) {
        this.drawer = drawer;
    };

    public abstract void draw();
}
