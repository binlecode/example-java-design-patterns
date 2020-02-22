package sample.designpattern.strategy;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 9/10/13
 * Time: 8:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
