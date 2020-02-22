package sample.designpattern.bridge;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 8/25/13
 * Time: 7:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class Demo {

    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 10, 5, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }

}
