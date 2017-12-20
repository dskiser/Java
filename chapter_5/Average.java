// Find the average of 10 values

class Average {
	public static void main(String args[]) {
		double array[] = {1.1,2.35,3,4.4,5,6,7,8,9,10};
		double sum = 0;

		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		System.out.println("Average of numbers in array is: " + sum / array.length);
	}
}
