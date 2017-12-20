// Exception classes
class QueueEmptyException extends Exception {

    public String toString() {
        return "\nQueue is empty.";
    }
}

class QueueFullException extends Exception {
    int size;

    QueueFullException(int s) {
        size = s;
    }

    public String toString() {
        return "\nQueue is full.  Max size is " + size;
    }
}

// Create a class that stores characters in a stack
class Stack {
	private char s[];
	private int stacksize;
	
	Stack(int size) {
		s = new char[size];
		stacksize = 0;
	}

	// put a character into the stack
	void push(char ch) 
        throws QueueFullException {
		if(stacksize==s.length)
            throw new QueueFullException(s.length);
		
        for(int i=stacksize; i>0; i--) {
		    s[i] = s[i-1];
		}
		stacksize++;
		s[0] = ch;
    }


// get a character out of the stack
	char pop() 
        throws QueueEmptyException {
		if(stacksize == 0)
           throw new QueueEmptyException(); 

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
		for(int i=0; i<28; i++) {
            try {
		        mystack.push((char) ('A' + i));
	        }
            catch(QueueFullException exc) {System.out.println(exc);}
        }
        for(int i=0; i<27; i++) {
            try {
                System.out.print(mystack.pop());
		    }
            catch(QueueEmptyException exc) {System.out.println("\n"
                    + exc);}
        }
    }
}
