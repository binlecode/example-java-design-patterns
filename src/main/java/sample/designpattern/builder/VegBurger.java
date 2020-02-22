package sample.designpattern.builder;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 8/24/13
 * Time: 6:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
