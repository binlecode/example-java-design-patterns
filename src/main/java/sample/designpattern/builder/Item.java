package sample.designpattern.builder;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 8/24/13
 * Time: 5:24 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();

}
