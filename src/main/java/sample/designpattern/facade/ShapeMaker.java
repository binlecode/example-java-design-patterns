package sample.designpattern.facade;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 8/27/13
 * Time: 10:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class ShapeMaker {
    Shape circle, rectangle;

    public ShapeMaker() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
    }
}
