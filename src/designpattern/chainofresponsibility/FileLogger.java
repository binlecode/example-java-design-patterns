package sample.designpattern.chainofresponsibility;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 9/3/13
 * Time: 11:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    public void write(String message) {
        System.out.println("FileLogger (level " + this.level + ") : " + message);
    }
}
