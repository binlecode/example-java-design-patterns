package sample.designpattern.mediator;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 9/5/13
 * Time: 2:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class User {
    String name;

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }

    public String getName() {
        return name;
    }

}
