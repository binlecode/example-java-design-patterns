package sample.designpattern.memento;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 9/9/13
 * Time: 9:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class Demo {

    public static void main(String[] args) {

        MementoStore mementoStore = new MementoStore();
        Originator originator = new Originator();

        originator.setState("STATE 1");
        mementoStore.add(originator.saveStateToMemento());
        originator.setState("STATE 2");
        mementoStore.add(originator.saveStateToMemento());
        originator.setState("STATE 3");

        System.out.println("Current state: " + originator.getState());
        originator.loadStateFromMemento(mementoStore.get(1));
        System.out.println("Previous state: " + originator.getState());
        originator.loadStateFromMemento(mementoStore.get(0));
        System.out.println("Initial state: " + originator.getState());

    }


}
