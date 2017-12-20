/*
	Try This 2-2

	Truth Table for the Logical Operators
*/
class LogicalOpTable {
	public static void main(String arg[]) {
		System.out.println("p\tq\tAND\tOR\tXOR\tNOT");
		boolean p, q;
		int P, Q, and, or, xor, not;


		p = false; q = false;
                // convert boolean values to binary
                if (!p & !q) {
                        P = 0; Q = 0; and = 0; or = 0; xor = 0; not = 1;
                        System.out.println(P + "\t" + Q + "\t" + and + "\t" + or + "\t" + xor + "\t" + not);
                }
		p = true; q = false;
                // convert boolean values to binary
                if (p & !q) {
                        P = 1; Q = 0; and = 0; or = 1; xor = 1; not = 0;
                        System.out.println(P + "\t" + Q + "\t" + and + "\t" + or + "\t" + xor + "\t" + not);
                }
		p = false; q = true;
                // convert boolean values to binary
                if (!p & q) {
                        P = 0; Q = 1; and = 0; or = 1; xor = 1; not = 1;
                        System.out.println(P + "\t" + Q + "\t" + and + "\t" + or + "\t" + xor + "\t" + not);
                }
		p = true; q = true;
		// convert boolean values to binary
		if (p & q) {
			P = 1; Q = 1; and = 1; or = 1; xor = 0; not = 0;
			System.out.println(P + "\t" + Q + "\t" + and + "\t" + or + "\t" + xor + "\t" + not);
		}
	}
}
