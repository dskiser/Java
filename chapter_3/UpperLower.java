/*
	Question 3.10

	Covert lowercase letters to uppercase and vice versa.
*/
class UpperLower {
	public static void main(String args[])
		throws java.io.IOException {
		char ch;
		int count = 0;

		System.out.print("Enter a sentence: ");
		do {
			ch = (char) System.in.read();
			if(ch >= 65 && ch <= 90) {
				ch += 32;
				count++;
				System.out.print(ch);
			}
			else if(ch >= 97 && ch <= 122) {
                               	ch -= 32;
                               	count++;
                               	System.out.print(ch);
			}
			else
				System.out.print(ch);
		} while (ch != '.');
		System.out.println("\nNumber of case changes: " + count);
	}
}
