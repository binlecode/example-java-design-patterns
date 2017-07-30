package sample.designpattern.nullobject;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 9/9/13
 * Time: 10:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class CustomerFactory {

    private static final String[] names = {"Bob", "Tracy", "Jack"};

    public static Customer getCustomer(String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }

}
