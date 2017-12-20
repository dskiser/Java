/*
	Try This 3-1

	Simple help system for Java control statements
*/
class Help {
	public static void main(String args[])
		throws java.io.IOException {

		char choice;

		System.out.println("Help on:\n" + "\t1. if\n" + "\t2. switch");
		System.out.print("Choose one: ");
		choice = (char) System.in.read();
		System.out.println(choice);
		switch (choice) {
			case '1':
				System.out.println("The if:\n\nif(condition) statement;\n" +
							"else statement;");
				break;
			case '2':
				System.out.println("The switch:\n\nswitch(expression) {\n\tcase constant:\n" +
							"\tstatement sequence;\nbreak;");
				break;
			default: System.out.println("Selection not found.");
		}
	}
}
