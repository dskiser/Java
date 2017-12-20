// Find the minimum and maximum values in an array
class MinMax {
	public static void main(String args[]) {
		int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
		int min, max;

		min = max = nums[0];
		for(int num : nums) {
			if(num < min) min = num;
			if(num > max) max = num;
		}
		System.out.println("min and max: " + min + " " + max);
	}
}
