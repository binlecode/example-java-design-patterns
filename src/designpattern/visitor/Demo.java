package sample.designpattern.visitor;

/**
 * Different visitors share same interface {@link sample.designpattern.visitor.ComputerVisitor} thus
 * are all accepted by target objects. Since visitor implementations are different, target object
 * behaviors are different at runtime.
 */
public class Demo {

    public static void main(String[] args) {
        ComputerPart[] computerParts = { new Keyboard(), new Mouse(), new Monitor() };

        ComputerVisitor[] visitors = { new ComputerPartDisplayVisitor(), new ComputerPartPackagingVisitor() };

        for (int i = 0; i < computerParts.length; i++) {
            // randomly select visitor
            if (Math.random() < 0.5) {
                computerParts[i].accept(visitors[0]);
            } else {
                computerParts[i].accept(visitors[1]);
            }

        }

    }

}
