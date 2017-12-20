// Chapter 6 Self Test, question 4
class Test {
	int a;
	int temp;
	Test(int i) { a = i;}

	void swap(Test ob) {
		temp = a;
		a = ob.a;
		ob.a = temp;
	}
}
class TestDemo {
	public static void main(String args[]) {
		Test firstobject = new Test(1);
		System.out.println("firstobject: " + firstobject.a);

		Test secondobject = new Test(2);
		System.out.println("secondobject: " + secondobject.a);

		firstobject.swap(secondobject);
		System.out.println("After swap...");
		System.out.println("firstobject: " + firstobject.a);
		System.out.println("secondobject: " + secondobject.a);
	}
}
