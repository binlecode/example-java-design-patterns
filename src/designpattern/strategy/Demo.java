package sample.designpattern.strategy;

/**
 * In Strategy pattern, a class behavior or its algorithm can be changed at run time.
 * This is achieved by method late binding and metamorphism.
 */
public class Demo {

    public static void main(String[] args) {
        Context ctx = new Context(new OperationAdd());
        System.out.println("100 + 200 = " + ctx.executeStrategy(100, 200));

        ctx = new Context(new OperationSubtract());
        System.out.println("100 - 200 = " + ctx.executeStrategy(100, 200));

        ctx = new Context(new OperationMultiply());
        System.out.println("100 * 200 = " + ctx.executeStrategy(100, 200));
    }
}
