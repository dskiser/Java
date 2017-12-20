// sum integers passed to varargs methods
class Sum {
	int nums[];
	int sum;

	int findsum(int ... v) {
		nums = v;
		for(int i = 0; i <= v.length-1; i++) {
			sum += v[i];
		}
		return sum;
	}
}
class VarargsDemo {
	public static void main(String args[]) {
		int array[] = { 1,2,3,4,5,6,7,8 };
		Sum s = new Sum();

		System.out.println(s.findsum(array));
	}
}
	
