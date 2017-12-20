// Generic stack interface
interface IGenStack<T> {
    void push(T ch) throws QueueFullException;
    T pop() throws QueueEmptyException;
}

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
class Stack<T> implements IGenStack<T> {
	T[] stack;
	private int stacksize;
	
	Stack(T[] o) {
		stack = o;
		stacksize = 0;
	}

	// put a character into the stack
	public void push(T ch) 
        throws QueueFullException {
		if(stacksize==stack.length)
            throw new QueueFullException(stack.length);
		
        for(int i=stacksize; i>0; i--) {
		    stack[i] = stack[i-1];
		}
		stacksize++;
		stack[0] = ch;
    }


// get a character out of the stack
	public T pop() 
        throws QueueEmptyException {
		if(stacksize == 0)
           throw new QueueEmptyException(); 

		T ch = stack[0];
		for(int i=0; i<stack.length-1; i++) {
			stack[i] = stack[i+1];
		}
		stacksize--;
		return ch;
	}
}

class StackDemo {
	public static void main(String args[]) {
		int size = 26;
        Integer intarray[] = new Integer[size];
		Stack<Integer> mystack = new Stack<Integer>(intarray);
		for(int i=0; i<28; i++) {
            try {
		        mystack.push(i);
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
