package sample.designpattern.command;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 9/4/13
 * Time: 9:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class Stock {
    String name;


    public Stock(String name) {
        this.name = name;
    }

    public void buy(int quantity) {
        System.out.println("buying stock, name: " + name + ", quantity: " + quantity);
    }

    public void sell(int quantity) {
        System.out.println("selling stock, name: " + name + ", quantity: " + quantity);
    }
}
