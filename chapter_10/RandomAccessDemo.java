// Demonstrate random access files.

import java.io.*;

class RandomAccessDemo {
    public static void main(String args[]) {
        char data[] = { 'H', 'G', 'F', 'E', 'D', 'C' };
        char d;

        // Open and use a random access file.
        try (RandomAccessFile raf = new RandomAccessFile("random.dat", "rw")) {
            for(int i=0; i < data.length; i++) {
                raf.writeDouble(data[i]);
            }

            // Now, read back specific values
            raf.seek(8);
            d = raf.readChar();
            System.out.println("First value is " + d);
        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}

