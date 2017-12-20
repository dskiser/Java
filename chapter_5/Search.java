// Search array for value
class Search {
	public static void main(String args[]) {
		int array[] = {6,-7,8,3,2,1,9,10,123,-4};

		for(int x : array) {
			if(x<0) System.out.println("Found a negative number!: " + x);
		}
	}
}
