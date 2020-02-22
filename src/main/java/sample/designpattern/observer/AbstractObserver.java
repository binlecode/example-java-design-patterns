package sample.designpattern.observer;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 9/9/13
 * Time: 9:35 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractObserver implements Observer {
    protected Subject subject;

    public AbstractObserver(Subject subject) {
        this.subject = subject;
        System.out.println("added observer to subject: " + subject);
    }

    public abstract void update();

}
