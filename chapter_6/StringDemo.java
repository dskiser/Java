// class to read a string backwards
class RevString {
	static int counter = 0;
	static String ch;
	static String rev_str = "";
	
	static String reverse(String clip) {
		if(counter < clip.length()) {
			ch = clip.substring(counter, ++counter);
			rev_str = ch + rev_str;
			reverse(clip);
		}
		return rev_str;
	}
}
class StringDemo {
	public static void main(String args[]) {
		String reverse = "";

		reverse = RevString.reverse("Daniel is amazing");
		System.out.println(reverse);
	}
}
