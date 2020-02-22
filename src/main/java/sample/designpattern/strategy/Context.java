package sample.designpattern.strategy;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 9/10/13
 * Time: 8:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
