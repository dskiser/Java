// Simple phone directory
class PhoneDir {
	public static void main(String args[]) {
		String directory[][] = {
			{"Tom", "488-0256"},
			{"Mary", "345-7890"},
			{"Fred", "541-4562"}
		};

		for (String names[] : directory) {
			for (String name : args) {
				if(name.equals(names[0])){
					System.out.println(name + 
						"'s phone number is " + names[1]);
				}
			}
		}
	}
}
