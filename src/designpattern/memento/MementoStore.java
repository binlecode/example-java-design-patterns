package sample.designpattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 9/9/13
 * Time: 8:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class MementoStore {

    List<Memento> mementos = new ArrayList<Memento>();

    public void add(Memento memento) {
        mementos.add(memento);
    }

    public Memento get(int index) {
        if (index < mementos.size()) {
            return mementos.get(index);
        }
        return null;
    }


}
