package sample.designpattern.template;

/**
 * This abstract class provides the logic template for subclasses to follow.
 */
public abstract class Game {

    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    /**
     * template method
     */
    public void play() {
        initialize();
        startPlay();
        endPlay();
    };

}
