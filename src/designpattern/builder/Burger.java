package sample.designpattern.builder;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 8/24/13
 * Time: 5:29 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Burger implements Item {
    public Packing packing() {
        return new Wrapper();
    }

}
