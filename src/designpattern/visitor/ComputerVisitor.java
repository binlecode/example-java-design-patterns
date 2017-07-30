package sample.designpattern.visitor;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 9/12/13
 * Time: 9:21 PM
 * To change this template use File | Settings | File Templates.
 */
public interface ComputerVisitor {

    /**
     * The type parameter in the api signature is the second dispatch of
     * the double-dispatch nature of visitor pattern.
     * The first dispatch is the caller, aka the type of the specific
     * implementation of this interface.
     *
     * Double-dispatch provides double degrees of freedom at run time:
     * both visitor type and target object type are determined at run time.
     */
    public void visit(Keyboard keyboard);
    public void visit(Mouse mouse);
    public void visit(Monitor monitor);

}
