package sample.designpattern.proxy;

public class Demo {

    public static void main(String[] args) {

        Image img = new ImageProxy();

        img.display();
    }

}
