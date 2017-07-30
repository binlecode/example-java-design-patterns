package sample.designpattern.nullobject;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 9/9/13
 * Time: 10:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class Demo {

    public static void main(String[] args) {
        String name = "Tracy";
        System.out.println("get customer with name " + name + ":");
        System.out.println(CustomerFactory.getCustomer(name).getName());

        name = "Julie";
        System.out.println("get customer with name " + name + ":");
        System.out.println(CustomerFactory.getCustomer(name).getName());

        name = "Bob";
        System.out.println("get customer with name " + name + ":");
        System.out.println(CustomerFactory.getCustomer(name).getName());

        name = "Bill";
        System.out.println("get customer with name " + name + ":");
        System.out.println(CustomerFactory.getCustomer(name).getName());
    }

}
