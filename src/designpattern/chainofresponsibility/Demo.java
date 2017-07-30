package sample.designpattern.chainofresponsibility;

/**
 * Chain of responsibility pattern is via a set of receivers
 * chained one after another.
 * @see {@link sample.designpattern.chainofresponsibility.AbstractLogger}
 */
public class Demo {

    private static AbstractLogger getChainOfLoggers() {
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        fileLogger.setNextLogger(consoleLogger);
        consoleLogger.setNextLogger(errorLogger);
        return fileLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();
        loggerChain.logMessage(AbstractLogger.ERROR, "this is error level message");
        loggerChain.logMessage(AbstractLogger.INFO, "this is info level message");
        loggerChain.logMessage(AbstractLogger.DEBUG, "this is debug level message");
    }

}
