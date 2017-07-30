package sample.designpattern.flyweight;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 8/28/13
 * Time: 2:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class Demo {
    private static final String[] colors = { "RED", "GREEN", "BLUE", "WHITE", "BLACK" };

    public static void main(String[] args) {
        for(int i = 0; i < 50; i++) {
            Circle circle = ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(getRandomRadius());
            circle.draw();
            System.out.println("Current hash size: " + ShapeFactory.getHashSize());
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random()*colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random()*100);
    }

    private static int getRandomY() {
        return getRandomX();
    }

    private static int getRandomRadius() {
        return getRandomX()*10;
    }

}
