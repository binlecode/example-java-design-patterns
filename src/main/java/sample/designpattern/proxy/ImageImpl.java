package sample.designpattern.proxy;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 8/28/13
 * Time: 3:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class ImageImpl implements Image {
    @Override
    public void display() {
        System.out.println("calling ImageImpl::display method");
    }
}
