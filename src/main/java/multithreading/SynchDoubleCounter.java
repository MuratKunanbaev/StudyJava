package multithreading;

public class SynchDoubleCounter {
    private long first = 0;
    private long second = 0;

    private Object monFirst = new Object();
    private Object monSecond = new Object();

    public long getFirst() {
        return first;
    }

    public long getSecond() {
        return second;
    }

    public void incrementFirst() {
        synchronized (monFirst) {
            first++;
        }
    }

    public void incrementSecond() {
        synchronized (monSecond) {
            second++;
        }
    }

    public synchronized void decrementFirst() {
        synchronized (monFirst) {
            first--;
        }
    }

    public synchronized void decrementSecond() {
        synchronized (monSecond) {
            second--;
        }
    }
}
