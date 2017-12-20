// Write and then read back binary data


import java.io.*;

class RWData {
    public static void main(String args[]) {
        int i = 10;
        double d = 1023.56;
        boolean b = true;

        try (DataOutputStream dataOut = 
                new DataOutputStream(new FileOutputStream("testdata"))) {
            System.out.println("Writing " + i);
            dataOut.writeInt(i);
        }
        catch(IOException exc) {
            System.out.println("Write error.");
            return;
        }

        System.out.println();

        try (DataInputStream dataIn =
                new DataInputStream(new FileInputStream("testdata"))) {
            i = dataIn.readInt();
            System.out.println("Reading " + i);
        }
        catch(IOException exc) {
            System.out.println("Read error.");
        }
    }
}
