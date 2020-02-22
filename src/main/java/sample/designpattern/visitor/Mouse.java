package sample.designpattern.visitor;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 9/12/13
 * Time: 9:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerVisitor visitor) {
        visitor.visit(this);
    }
}
