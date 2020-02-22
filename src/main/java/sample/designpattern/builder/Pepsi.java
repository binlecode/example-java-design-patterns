package sample.designpattern.builder;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 8/24/13
 * Time: 7:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
