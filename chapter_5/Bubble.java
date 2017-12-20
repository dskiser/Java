/*
	Try this 5-1

	Performs the bubble sort
*/
class Bubble {
	public static void main(String args[]) {
		String strings[] = {"abc", "jkl", "hij", "mno", "pqr", "zzx", "ynp", "bcd", "vky", "aab"};
		int a, b;
		for(a = 1; a <= 9; a++) {
			for(b = 0; b <= 8; b++) {
				if(strings[b].compareTo(strings[b+1]) > 0) {
					String x = strings[b];
					strings[b] = strings[b+1];
					strings[b+1] = x;
				}
			}
		}
		System.out.println("Sorted array is:");
		for(b = 0; b <= 9; b++)
			System.out.print(strings[b] + " ");
		System.out.println();
	}
}
