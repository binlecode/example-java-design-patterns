package sample.designpattern.state;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 9/9/13
 * Time: 10:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class EndState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("In end state");
        context.setState(this);
    }

    public String toString() {
        return "End State";
    }
}
