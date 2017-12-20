// Copies a file and replaces spaces with hyphens
import java.io.*;

class AddHyphens {
    public static void main(String args[]){
        int i;

        try (FileInputStream original = new FileInputStream(args[0]);
                FileOutputStream copy = new FileOutputStream(args[1])) {
            do {
                i = original.read();
                if((i != -1) & (i != ' ')) copy.write(i);
                if(i == ' ') copy.write('-'); 
            } while (i != -1);
        }
        catch(IOException exc) {
            System.out.println("I/O error: " + exc);
        }
   }
}
