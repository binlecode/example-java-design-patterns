package sample.designpattern.template;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 9/12/13
 * Time: 8:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class Soccer extends Game {
    @Override
    public void initialize() {
        System.out.println("Initializing game Soccer");
    }

    @Override
    public void startPlay() {
        System.out.println("Starting game Soccer");
    }

    @Override
    public void endPlay() {
        System.out.println("Ending game Soccer");
    }
}
