package sample.designpattern.decorator;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 8/27/13
 * Time: 10:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class Demo {

    public static void main(String[] args) {

        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        redCircle.draw();
        redRectangle.draw();
    }
}
