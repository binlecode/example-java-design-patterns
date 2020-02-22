package sample.designpattern.command;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 9/4/13
 * Time: 9:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class SellStockOrder implements Order {
    private Stock stock;
    private int quantity;

    public SellStockOrder(Stock stock, int quantity) {
        this.stock = stock;
        this.quantity = quantity;
    }

    @Override
    public void execute() {
        stock.sell(quantity);
    }
}
