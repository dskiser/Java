// A fixed size queue class for characters that uses exceptions.
public class FixedQueue implements ICharQ {
    private char q[];
    private int putloc, getloc;

    public FixedQueue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    synchronized void put(char ch)
        throws QueueFullException {

        if(putloc==q.length)
            throw new QueueFullException(q.length);

        q[putloc++] = ch;
    }

    synchronized char get() 
        throws QueueEmptyException {

        if(getloc==putloc)
            throw new QueueEmptyException();

        return q[getloc++];
    }

    synchronized void reset() {}

    public int length() {return 0;}
}
