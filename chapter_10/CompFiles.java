import java.io.*;

class CompFiles {
    public static void main(String args[]){
        int i=0, j=0;
        int placeCounter = 0;

        // First make sure that both files have been specified.
        if(args.length != 2) {
            System.out.println("Usage: CompFiles f1 f2");
            return;
        }

        // Compare the files.
        try (FileInputStream f1 = new FileInputStream(args[0]);
                FileInputStream f2 = new FileInputStream(args[1])){
            // Check the contents of each file.
            do {
                placeCounter++;
                i = f1.read();
                j = f2.read();
                if((i != j+32) & (i != j) & (i != j-32)) break;
            } while(i != -1 && j != -1);

            if((i != j) & (i != j+32) & (i != j-32))
                System.out.println("Files differ at position " + placeCounter);
            else
                System.out.println("Files are the same.");
            } catch(IOException exc) {
                System.out.println("I/O Error: " + exc);
            }
    }
}
