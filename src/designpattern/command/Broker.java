package sample.designpattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Broker is the invoker class for command ({@link sample.designpattern.command.Order})
 * objects. It invokes the method in the command objects.
 */
public class Broker {
    List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
    }

}
