package sample.designpattern.interpreter;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 9/4/13
 * Time: 9:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class TerminalExpression implements Expression {
    private String pattern;

    public TerminalExpression(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public boolean interpret(String context) {
        if (context != null && context.contains(pattern)) {
            return true;
        }
        return false;
    }
}
