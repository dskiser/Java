/*
    Try this 13-1

    Demonstrate a generic queue class
*/
class GenQDemo {
    public static void main(String args[]) {
        // Create an integer queue.
        Integer iStore[] = new Integer[10];
        GenQueue<Integer> q = new GenQueue<Integer>(iStore);

        Integer iVal;

        System.out.println("Demonstrate a queue of Integers.");
        try {
            for(int i=0; i < 5; i++) {
                System.out.println("Adding " + i + " to q.");
                q.put(i);
            }
        }
        catch(QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            for(int i=0; i < 5; i++) {
                System.out.print("Getting next Integer from q: ");
                iVal = q.get();
                System.out.println(iVal);
            }
        }
        catch (QueueEmptyException exc) {
            System.out.println(exc);
        }

        System.out.println();

    }
}
               
