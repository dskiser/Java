/*
 
   Try this 11-1

   Extend Thread
*/

class MyThread extends Thread {
    // Construct a new thread.
    MyThread(String name) {
        super(name); // name thread
    }

    public static MyThread createAndStart(String name) {
        MyThread MyThrd = new MyThread(name);
        MyThrd.start();
        return MyThrd;
    }

    // Entry point of thread.
    public void run() {
        System.out.println(getName() + " starting.");
        try {
            for(int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + getName() +
                        ", count is " + count);
            }
        }
        catch(InterruptedException exc) {
            System.out.println(getName() + " interrupted.");
        }

        System.out.println(getName() + " terminating.");
    }
}

class ExtendThread {
    public static void main(String args[]) {
        System.out.println("Main Thread starting.");

        MyThread mt1 = MyThread.createAndStart("Child #1");
        MyThread mt2 = MyThread.createAndStart("Child #2");
        MyThread mt3 = MyThread.createAndStart("Child #3");
        
        do {
            System.out.print(".");
            try {
                Thread.sleep(100);
            }
            catch(InterruptedException exc) {
                System.out.println("Main thread interrupted.");
            }
        } while (mt1.isAlive() ||
                mt2.isAlive() ||
                mt3.isAlive());

        System.out.println("Main thread ending.");
    }
}
