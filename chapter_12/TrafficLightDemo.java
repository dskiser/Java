// An enumeration of the colors of a traffic light.
enum TrafficLightColor {
    RED(12000), GREEN(10000), YELLOW(2000);

    private int time;

    TrafficLightColor(int t) { time = t; }
    
    synchronized int getDelay() { return time; }
}

// A computerized traffic light.
class TrafficLightSimulator implements Runnable {
    private TrafficLightColor tlc;
    private boolean stop = false;
    private boolean changed = false;

    TrafficLightSimulator(TrafficLightColor init) {
        tlc = init;
    }

    TrafficLightSimulator() {
        tlc = TrafficLightColor.RED;
    }

    // Start up the light.
    public void run() {
        while(!stop) {
            try {
                switch(tlc) {
                    case GREEN:
                        Thread.sleep(tlc.getDelay());
                        break;
                    case YELLOW:
                        Thread.sleep(tlc.getDelay());
                        break;
                    case RED:
                        Thread.sleep(tlc.getDelay());
                        break;
                }
           } catch(InterruptedException exc) {
               System.out.println(exc);
           }
           changeColor();
        }
    }


    // Change color.
    synchronized void changeColor() {
        switch(tlc) {
            case RED:
                tlc = TrafficLightColor.GREEN;
                break;
            case YELLOW:
                tlc = TrafficLightColor.RED;
                break;
            case GREEN:
                tlc = TrafficLightColor.YELLOW;
                break;
        }
        changed = true;
        notify();
   }

   // Wait until a light change occurs.
   synchronized void waitForChange() {
       try {
           while(!changed)
               wait();
           changed = false;
       } catch(InterruptedException exc) {
           System.out.println(exc);
       }
   }

   // Return current color.
   synchronized TrafficLightColor getColor() {
       return tlc;
   }

   // Stop the traffic light.
   synchronized void cancel() {
       stop = true;
   }
}

class TrafficLightDemo {
    public static void main(String args[]) {
        TrafficLightSimulator t1 =
            new TrafficLightSimulator(TrafficLightColor.GREEN);
        Thread thrd = new Thread(t1);
        thrd.start();

        for(int i=0; i < 9; i++) {
            System.out.println(t1.getColor());
            t1.waitForChange();
        }

        t1.cancel();
   }
}

                
