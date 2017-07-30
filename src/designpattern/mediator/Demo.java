package sample.designpattern.mediator;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 9/5/13
 * Time: 2:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class Demo {

    public static void main(String[] args) {
        User userA = new User("User A");
        User userB = new User("User B");

        userA.sendMessage("Hi, I am user A.");
        userB.sendMessage("Hi, I am user B.");
    }
}
