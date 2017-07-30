package sample.designpattern.builder;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 8/24/13
 * Time: 5:32 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class ColdDrink implements Item {
    public Packing packing() {
        return new Bottle();
    }

}
