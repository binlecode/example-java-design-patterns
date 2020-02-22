package sample.designpattern.interpreter;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 9/4/13
 * Time: 9:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class Demo {

    public static void main(String[] args) {
        String context = "this is a testing context string";

        Expression term1 = new TerminalExpression("test");
        Expression term2 = new TerminalExpression("strange");
        Expression term3 = new TerminalExpression("string");

        Expression and12 = new AndExpression(term1, term2);
        Expression or23 = new OrExpression(term2, term3);

        System.out.println("AND expression interpreter: " + and12.interpret(context));
        System.out.println("OR  expression interpreter: " + or23.interpret(context));

    }

}
