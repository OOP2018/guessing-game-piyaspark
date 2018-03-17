
/**
 * A simple counter.
 *
 * @author Piyaphol Wiengperm.
 */
public class Counter extends java.util.Observable {
    private int count;

    /**
     * Constructor of Counter class.
     */
    public Counter() {
        this.count = 0;
    }

    /**
     * This method is use to count when user act on button.
     * It will add count to the counter.
     * @param howmuch is how much you want to add.
     */
    public void add(int howmuch) {
        count += howmuch;
        setChanged();
        notifyObservers();
    }

    /**
     * Get count in integer type.
     * @return count
     */
    public int getCount() {
        return count;
    }

    /**
     * set count to determine number.
     * @param count
     */
    public void setCount(int count){
        this.count = count;
        setChanged();
        notifyObservers();
    }
}
