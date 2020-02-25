package sample.designpattern.singleton;

public class Singleton {

    private static Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        // only synchronize (aka put a lock) when instance is not available
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public static void main(final String[] args) {
        final Singleton obj = Singleton.getInstance();
        System.out.println("got instance in thread [main]: " + obj);

        Thread thd = new Thread(() -> {
            final Singleton obj2 = Singleton.getInstance();
            System.out.println("got instance in thread [" + Thread.currentThread() + "]: " + obj2);
        });
        thd.start();
        // make sure all threads created by the main thread is done before finishing the main thread
        try {
            thd.join();
        } catch (InterruptedException ex) {
            //
        }
    }

    /**
     * ** some common easy mistakes below **
     */

    /**
     * synchronized on method signature will potentially impact performance
     */
//    public synchronized static Singleton getInstance() {
//        if (singleton == null) {
//            singleton = new Singleton();
//        }
//        return singleton;
//    }

    /**
     * this will lead to concurrent new() calls from different threads
     */
//    public static Singleton getInstance() {
//        if (singleton == null) {
//            singleton = new Singleton();
//        }
//        return singleton;
//    }

}
