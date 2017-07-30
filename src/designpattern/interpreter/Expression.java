package sample.designpattern.interpreter;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 9/4/13
 * Time: 9:43 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Expression {
    boolean interpret(String context);
}
