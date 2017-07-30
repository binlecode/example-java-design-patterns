package sample.designpattern.factory;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 8/24/13
 * Time: 4:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("calling Square::draw() method");
    }
}
