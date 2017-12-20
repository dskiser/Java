import java.io.*;

class ShowFile1 {
    public static void main(String args[]) {
        int i;

        // First make sure that a file has been specified.
        if(args.length != 1 ) {
            System.out.println("Usage: ShowFile File");
            return;
        }

        try(FileInputStream fin = new FileInputStream(args[0])) {

            // read bytes until EOF is encountered
            do {
                i = fin.read();
                if(i != -1) System.out.print((char) i);
            } while(i != -1);
        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}

