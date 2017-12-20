// Create a class that stores characters in a stack
class Stack {
	private char s[];
	private int stacksize;
	
	Stack(int size) {
		s = new char[size];
		stacksize = 0;
	}

	// put a character into the stack
	void push(char ch) {
		if(stacksize==s.length) {
			System.out.println(" - Stack is full.");
			return;
		}
		for(int i=stacksize; i>0; i--) {
			s[i] = s[i-1];
		}
		stacksize++;
		s[0] = ch;
	}

	// get a character out of the stack
	char pop() {
		if(stacksize == 0) {
			System.out.println(" - Stack is empty.");
			return (char) 0;
		}
		char ch = s[0];
		for(int i=0; i<s.length-1; i++) {
			s[i] = s[i+1];
		}
		stacksize--;
		return ch;
	}
}

class StackDemo {
	public static void main(String args[]) {
		int size = 26;
		Stack mystack = new Stack(size);
		
		for(int i=0; i<26; i++) mystack.push((char) ('A' + i));
		
		for(int i=0; i<26; i++) {
			System.out.println(mystack.pop());
		}
	}
}
