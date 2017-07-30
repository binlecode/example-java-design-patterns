package sample.designpattern.iterator;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 9/5/13
 * Time: 2:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class Demo {

    public static void main(String[] args) {
        Container nameRepo = new NameRepository();
        Iterator nameItr = nameRepo.getIterator();
        while (nameItr.hasNext()) {
            System.out.println("name: " + nameItr.getNext());
        }
    }

}
