package sample.designpattern.prototype;

import java.util.HashMap;

/**
 * Cache class for holding the original cloneable object instance.
 * @see {@link sample.designpattern.prototype.Shape}
 * And generate additional copies via cloning.
 */
public class ShapeCache {
    private static HashMap<String, Shape> shapeHashMap = new HashMap<String, Shape>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeHashMap.get(shapeId);
        if (cachedShape == null) {
            return null;
        }
        return (Shape) cachedShape.clone();
    }

    public static void putShape(Shape shape) {
        shapeHashMap.put(shape.getId(), shape);
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.setId("c1");
        c.setType("CIRCLE");
        ShapeCache.putShape(c);

        Square s = new Square();
        s.setId("s1");
        s.setType("SQUARE");
        ShapeCache.putShape(s);

        Rectangle r = new Rectangle();
        r.setId("r1");
        r.setType("RECTANGLE");
        ShapeCache.putShape(r);

        Shape clonedShape = ShapeCache.getShape("c1");
        System.out.println("Shape: " + clonedShape.getType());
        clonedShape = ShapeCache.getShape("s1");
        System.out.println("Shape: " + clonedShape.getType());
        clonedShape = ShapeCache.getShape("r1");
        System.out.println("Shape: " + clonedShape.getType());
    }

}
