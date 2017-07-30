package sample.designpattern.iterator;

/**
 * Iterator pattern provides a common way of accessing elements of a collection
 * object in sequential manner without knowing the implementation details of the
 * collection object.
 */
public class NameRepository implements Container {
    private String[] names = {"Robert" , "John" ,"Julie" , "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    /**
     * This iterator implementing class is an instance inner class, which
     * has access to enclosing instance fields.
     */
    private class NameIterator implements Iterator {
        int index = 0;

        @Override
        public boolean hasNext() {
            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object getNext() {
            if (hasNext()) {
                return names[index++];
            }
            return null;
        }
    }

}
