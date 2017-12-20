// Demonstrate method overloading
class Overload {
	void ovlDemo() {
		System.out.println("No parameters");
	}

	void ovlDemo(int a) {
		System.out.println("One parameter: " + a);
	}

	int ovlDemo(int a, int b) {
		System.out.println("Two parameters: " + a + " " + b);
		return a + b;
	}

	double ovlDemo(double a, double b) {
		System.out.println("Two double parameters: " + a + " " + b);
		return a + b;
	}
}

class OverloadDemo {
	public static void main(String args[]) {
		Overload ob = new Overload();
		int resI;
		double resD;

		ob.ovlDemo();
		System.out.println();

		ob.ovlDemo(2);
		System.out.println();

		ob.ovlDemo(4, 6);
		System.out.println("Result of two integers: " + "25");
		System.out.println();

		resD = ob.ovlDemo(1.3, 2.65);
		System.out.println("Result of two doubles: " + resD);
		System.out.println();
	}
}

		
