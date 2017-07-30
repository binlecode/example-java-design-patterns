package sample.designpattern.observer;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 9/9/13
 * Time: 9:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class Demo {

    public static void main(String[] args) {
        Subject subject = new Subject();

        Observer happyObserver = new HappyObserver(subject);
        subject.addObserver(happyObserver);
        AbstractObserver sadObserver = new SadObserver(subject);
        subject.addObserver(sadObserver);
        subject.setState("STATE 1");

        subject.removeObserver(sadObserver);
        subject.setState("STATE 2");
    }

}
