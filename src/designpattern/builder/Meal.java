package sample.designpattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 8/24/13
 * Time: 7:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class Meal {
    List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float cost() {
        float cost = 0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.println("Item : " + item.name() +
                    ", packing : " + item.packing().pack() +
                    ", price : " + item.price());
        }
    }

}
