/*
	Question 3.9

	Display progression of 1, 2, 4, 8, and so on ...
*/
class ExGrowth {
	public static void main(String args[]) {
		for(int i=1; i <= 1000; i *= 2)
			System.out.println(i);
	}
}
