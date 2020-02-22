package sample.designpattern.observer;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 9/9/13
 * Time: 9:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class SadObserver extends AbstractObserver {

    public SadObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println("Sadly noticed subject state change: " + subject.getState());
    }
}
