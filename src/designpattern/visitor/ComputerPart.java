package sample.designpattern.visitor;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 9/12/13
 * Time: 9:21 PM
 * To change this template use File | Settings | File Templates.
 */
public interface ComputerPart {

    public void accept(ComputerVisitor visitor);

}
