package sample.designpattern.state;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 9/9/13
 * Time: 10:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class Context {
    State state;

    public Context() {
        state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

}
