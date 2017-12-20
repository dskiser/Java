/*
	This program illustrates the differences between int and double.

	Call this file Example3.java
*/
class Example3 {
	public static void main(String args[]) {
		int var; // this declares an int variable
		double x; // this declares a floating-point variable

		var=10;

		x = 10.0;

		System.out.println("Original value of var: " + var);
		System.out.println("Orignial value of x: " + x);
		System.out.println();

		var = var / 4;
		x = x/ 4;

		System.out.println("var after division: " + var);
		System.out.println("x after division: " + x);
	}
}

