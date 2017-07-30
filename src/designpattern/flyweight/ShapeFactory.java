package sample.designpattern.flyweight;

import java.util.HashMap;

/**
 * Flyweight pattern is to reduce object volume by an object pool, which reduces memory
 * footprint as well as saving object construction cost.
 *
 * In this example, object pool is a hashMap. In case of a pool lookup miss, a new object
 * is added to the pool for future use.
 */
public class ShapeFactory {
    private static HashMap<String, Shape> shapeMap = new HashMap<String, Shape>();

    public static Circle getCircle(String color) {
        Circle circle = (Circle) shapeMap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            shapeMap.put(color, circle);
        }
        return circle;
    }

    public static int getHashSize() {
        return shapeMap.size();
    }

}
