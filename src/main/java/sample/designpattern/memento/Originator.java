package sample.designpattern.memento;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 9/9/13
 * Time: 9:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void loadStateFromMemento(Memento memento) {
        state = memento.getState();
    }

}
