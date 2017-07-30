package sample.designpattern.state;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 9/9/13
 * Time: 10:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class BeginState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("In begin state");
        context.setState(this);
    }

    public String toString() {
        return "Begin State";
    }
}
