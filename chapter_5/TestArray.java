// Experimenting with arrays

class Array {
	int array[];

	Array(int size) {
		array = new int[size];
	}
}

class charArray {
	char chars[];

	charArray(int size) {
		chars = new char[size];
	}
}
class TestArray {
	public static void main(String args[]) {
		Array myarray = new Array(10);
		for(int i=0; i<=9; i++) {
			myarray.array[i] = i;
		}

		for(int i=0; i< myarray.array.length; i++)
			System.out.print(myarray.array[i] + " ");
		System.out.println();

		charArray mychars = new charArray(10);
		for(int i=90; i<=99; i++) {
			mychars.chars[i-90] = (char) i;
		}
		for(int i=0; i< myarray.array.length; i++)
                        System.out.print(mychars.chars[i] + " ");
                System.out.println();
		System.out.println((char) 0 + "?" + (char) 0 + "?");
	}
}
