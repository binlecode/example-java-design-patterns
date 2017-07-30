package sample.designpattern.memento;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 9/9/13
 * Time: 8:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class Memento {
    String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

}
