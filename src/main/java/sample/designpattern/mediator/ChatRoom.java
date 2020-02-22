package sample.designpattern.mediator;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 9/5/13
 * Time: 2:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class ChatRoom {

    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " - " + user.getName() + " is sending message: " + message);
    }


}
