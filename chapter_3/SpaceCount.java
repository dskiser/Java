/*
	Question 3.1

	Reads characters from the keyboard until a period is received.
	Also counts the number of spaces and reports the total.
*/
class SpaceCount {
	public static void main(String ars[])
		throws java.io.IOException {

		int spaces = 0;
		char ch;

		System.out.print("Enter any character('.' to quit): ");
		do {
			ch = (char) System.in.read();
			if(ch == ' ') spaces++;
		} while(ch != '.');

		System.out.println("Number of spaces: " + spaces);
	}
}
