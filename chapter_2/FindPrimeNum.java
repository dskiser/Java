/*
	Question 2.10

	Find prime numbers between 2 and 100
*/
class FindPrimeNum {
	public static void main(String args[]) {
		int number;

		for (number = 2; number <= 100; number++){
			int factor;
			boolean prime = true;
			for (factor = 2; factor <= number; factor++) if ((number % factor) == 0 & factor != number) prime = false;
			if (prime) System.out.println(number);
		}
	}
}
