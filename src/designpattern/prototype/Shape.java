package sample.designpattern.prototype;

/**
 * Prototype pattern involves implementing a prototype interface which tells
 * to create a clone of the current object.
 * This pattern is used when creation of object directly is costly. For example,
 * a object is to be created after a costly database operation.
 * A common way is put the original object into cache and clone additional ones
 * for application logic usage.
 * @see {@link sample.designpattern.prototype.ShapeCache}
 */
public abstract class Shape implements Cloneable {

    private String id;
    protected String type;

    public abstract void draw();

    /**
     * Provide clone way of creating new instances. This is typically used when new() is expensive.
     * @return cloned instance
     */
    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
