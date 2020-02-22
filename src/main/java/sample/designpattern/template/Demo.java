package sample.designpattern.template;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 9/12/13
 * Time: 8:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class Demo {

    public static void main(String[] args) {
        Game soccer = new Soccer();
        Game tennis = new Tennis();

        soccer.play();
        tennis.play();
    }
}
