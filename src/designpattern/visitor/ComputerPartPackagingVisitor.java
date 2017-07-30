package sample.designpattern.visitor;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 9/12/13
 * Time: 9:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class ComputerPartPackagingVisitor implements ComputerVisitor {

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Packaging keyboard: " + keyboard);
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Packaging mouse: " + mouse);
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Packaging monitor: " + monitor);
    }
}
