package dfault;
import qpack.*;

class IQDemo {
    public static void main(String args[]) {
        FixedQueue myqueue = new FixedQueue(5);

        for(int i=0; i < 5; i++)
            myqueue.put((char) ('A' + i));

        for(int i=0; i < 5; i++)
            System.out.println(myqueue.get());
   }
}

