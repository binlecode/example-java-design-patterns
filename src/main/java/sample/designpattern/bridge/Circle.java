package sample.designpattern.bridge;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 8/25/13
 * Time: 7:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class Circle extends Shape {

    private int radius, x, y;

    protected Circle(int radius, int x, int y, DrawAPI drawer) {
        super(drawer);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        drawer.drawCircle(radius, x, y);
    }
}
