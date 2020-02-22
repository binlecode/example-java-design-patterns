package sample.designpattern.bridge;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 8/25/13
 * Time: 7:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius + ", x: " + x + ", " + y + "]");
    }
}
