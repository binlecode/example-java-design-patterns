package sample.designpattern.proxy;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 8/28/13
 * Time: 3:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class ImageProxy implements Image {
    private Image imageDelegate;

    @Override
    public void display() {
        if (imageDelegate == null) {
            System.out.println("proxy is (lazy) loading image");
            imageDelegate = new ImageImpl();
        }
        System.out.println("calling ImageProxy::display method");
        imageDelegate.display();
    }
}
