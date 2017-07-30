package sample.designpattern.abstractfactory;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 8/24/13
 * Time: 4:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("calling Green::draw() method");
    }
}
