/*
	Demonstrate the if.

	Call this file IfDemo.java
*/
class IfDemo {
	public static void main(String args[]) {
		int a,b,c;

		a = 2;
		b = 3;

		if (a < b) System.out.println("a is less than b");

		// this won't display anything
		if (a == b) System.out.println("You won't see this");

		System.out.println();

		c = a - b;

		System.out.println("c contains -1");
		if (c >= 0) System.out.println("c is non-negative");
		if (c < 0) System.out.println("c is negative");
	}
}
