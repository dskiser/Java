// use values

enum Tools {
    SCREWDRIVER, WRENCH, HAMMER, PLIERS
}

class UseValues {
    public static void main(String args[]) {
        Tools tool;

        for(Tools t : Tools.values())
           System.out.println(t + " " + t.ordinal());
    }
} 
