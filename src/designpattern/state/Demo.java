package sample.designpattern.state;

/**
 * Created with IntelliJ IDEA.
 * User: ble
 * Date: 9/9/13
 * Time: 10:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class Demo {

    public static void main(String[] args) {

        Context context = new Context();

        BeginState beginState = new BeginState();
        beginState.doAction(context);
        System.out.println(context.getState());

        EndState endState = new EndState();
        endState.doAction(context);
        System.out.println(context.getState());

    }
}
