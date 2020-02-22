package sample.designpattern.chainofresponsibility;

/**
 * In chain of responsibility pattern, each receiver has a reference of next
 * receiver to pass the payload.
 *
 */
public abstract class AbstractLogger {
    public static final int ERROR = 1;
    public static final int INFO = 2;
    public static final int DEBUG = 3;

    protected int level;
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    public abstract void write(String message);
}
