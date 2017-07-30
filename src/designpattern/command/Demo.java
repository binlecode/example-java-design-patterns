package sample.designpattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Command pattern is a data driven design pattern.
 * A request is wrapped under a object as command ({@link sample.designpattern.command.Order}
 * and passed to invoker object ({@link sample.designpattern.command.Broker}).
 * Invoker object looks for the appropriate object ({@link sample.designpattern.command.Stock})
 * which can handle this command and pass the command to the corresponding object and that
 * object executes the command.
 */
public class Demo {

    public static void main(String[] args) {
        Stock abcStock = new Stock("ABC");
        Stock skyStock = new Stock("SKY");

        Broker broker = new Broker();
        broker.takeOrder(new SellStockOrder(abcStock, 10));
        broker.takeOrder(new BuyStockOrder(skyStock, 20));

        broker.placeOrders();
    }


}
