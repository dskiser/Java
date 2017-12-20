// Implement Series
class ByTwos implements Series {
    int start;
    int val;
    int prev;

    ByTwos() {
        start = 0;
        val = 0;
    }

    public int getNext() {
        val += 2;
        return val;
    }

    public void reset() {
        val = start;
    }

    public void setStart(int x) {
        start = x;
        val = x;
    }

    int getPrevious() {
        return prev;
    }
}

class ByThrees implements Series {
    int start;
    int val;

    ByThrees() {
        start = 0;
        val = 0;
    }

    public int getNext() {
        val += 3;
        return val;
    }

    public void reset() {
        val = start;
    }

    public void setStart(int x) {
        start = x;
        val = x;
    }
}
class SeriesDemo {
    public static void main(String args[]) {
        ByTwos ob = new ByTwos();

        for(int i = 0; i < 5; i++)
            System.out.println("Next value is " + ob.getNext());

        System.out.println("\nResetting");
        ob.reset();
        for(int i=0; i<5; i++)
            System.out.println("Next value is " + ob.getNext());

        System.out.println("\nStarting at 100");
        ob.setStart(100);
        for(int i=0; i < 5; i++)
            System.out.println("Next value is " + ob.getNext());

        ByThrees ob2 = new ByThrees();

        for(int i = 0; i < 5; i++)
            System.out.println("Next value is " + ob2.getNext());

        System.out.println("\nResetting");
        ob2.reset();
        for(int i=0; i<5; i++)
            System.out.println("Next value is " + ob2.getNext());

        System.out.println("\nStarting at 100");
        ob2.setStart(100);
        for(int i=0; i < 5; i++)
            System.out.println("Next value is " + ob2.getNext());
    }
}
