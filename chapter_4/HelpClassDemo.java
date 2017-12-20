/*
	Try This 4-1

	More complex help system for Java control statements using methods
*/

// displays help information
class HelpMenu {

	// provides information on control statements
	void HelpOn(char choice) {
		switch (choice) {
                	case '1':
                        	System.out.println("The if:\n\nif(condition) statement;\n" +
                                        	"else statement;\n");
                        	break;
                	case '2':
                        	System.out.println("The switch:\n\nswitch(expression) {\n\tcase constant:\n" +
                                        	"\t\tstatement sequence;\n\t\tbreak;\n\t// ...\n");
                        	break;
                	case '3':
                        	System.out.println("The for:\n\nfor(initialization; condition; iteration) statement;\n");
                        	break;
                	case '4':
                        	System.out.println("The while:\n\nwhile(condition) statement;\n");
                        	break;
                	case '5':
                        	System.out.println("The do-while:\n\ndo {\n\tstatement;\n} while (condition);\n");
                        	break;
                	default: System.out.println("Selection not found.\n");
		}
	}

	// displays menu
	void showMenu() {
		System.out.println("Help on:\n" + "\t1. if");
		System.out.println("\t2. switch");
		System.out.println("\t3. for");
		System.out.println("\t4. while");
		System.out.println("\t5. do-while");
		System.out.print("Choose one (q to quit): ");
	}

	// check if input is valid
	boolean isValid(char ch) {
		if(ch >= '1' | ch <= '5') return true;
		else return false;
	}
}
// main class
class HelpClassDemo {
	public static void main(String args[])
		throws java.io.IOException {

		char choice, ignore;

		HelpMenu menu = new HelpMenu();


		cycle: for(;;) {
			do {
				menu.showMenu();
				choice = (char) System.in.read();
				if(choice == 'q') break cycle;
			} while (!menu.isValid(choice));
			menu.HelpOn(choice);
			do {
                          	 ignore = (char) System.in.read();
                        } while (ignore != '\n');
		}
	}
}
