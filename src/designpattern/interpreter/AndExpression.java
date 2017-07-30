package sample.designpattern.interpreter;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 9/4/13
 * Time: 9:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class AndExpression implements Expression {
    Expression exp1, exp2;

    public AndExpression(Expression exp1, Expression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public boolean interpret(String context) {
        return exp1.interpret(context) && exp2.interpret(context);
    }
}
