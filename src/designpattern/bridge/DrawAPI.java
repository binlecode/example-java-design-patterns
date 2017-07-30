package sample.designpattern.bridge;

/**
 * This interface acts as a bridge which makes the functionality of the
 * class (that has members of this interface, which is {@link sample.designpattern.bridge.Shape})
 * independent from interface implementer classes (such as
 * {@link sample.designpattern.bridge.RedCircle}, and {@link sample.designpattern.bridge.GreenCircle}).
 */
public interface DrawAPI {
    void drawCircle(int radius, int x, int y);
}
