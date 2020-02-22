package sample.designpattern.decorator;


public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder();
    }

    public void setRedBorder() {
        System.out.println("Border color: Red");
    }
}
