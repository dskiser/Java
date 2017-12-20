import java.io.*;

class CopyFile {
    public static void main(String args[])
        throws IOException {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        // First, make sure that both files have been specified.
        if(args.length != 2) {
            System.out.println("Usage: CopyFile from to");
            return;
        }

        // Copy a file.
        try {
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1], true);

            do {
                i = fin.read();
                if(i != -1) fout.write(i);
            } while(i != -1);
        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        } finally {
            try {
                if(fin != null) fin.close();
            } catch(IOException exc) {
                System.out.println("Error Closing Input File");
            }
            try {
                if(fout != null) fout.close();
            } catch(IOException exc) {
                System.out.println("Error Closing Output File");
            }
        }
    }
}
