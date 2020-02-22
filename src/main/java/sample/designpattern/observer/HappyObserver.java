package sample.designpattern.observer;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 9/9/13
 * Time: 9:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class HappyObserver extends AbstractObserver {

    public HappyObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println("Happily noticed subject state change: " + subject.getState());
    }
}
