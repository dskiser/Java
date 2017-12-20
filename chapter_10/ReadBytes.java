// Read an array of bytes from the keyboard.

import java.io.*;

class ReadBytes {
    public static void main(String args[])
        throws IOException {
            byte data[] = new byte[10];

            System.out.println("Enter some characters.");
            try {
                System.in.read(data);
            }
            catch(IOException exc) {
                System.out.println("Two many characters!");
            }
            System.out.print("You entered: ");
            for(int i=0; i < data.length; i++)
                System.out.print((char) data[i]);
    }
}
