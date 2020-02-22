package sample.designpattern.facade;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 8/24/13
 * Time: 4:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("calling Rectangle::draw() method");
    }
}
