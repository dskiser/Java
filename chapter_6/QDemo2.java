/*
	Try this 6-2

	Modify original queue class to include additional constructors
*/
class Queue {
	public char q[];
	private int putloc, getloc;

	Queue(int size) {
		q = new char[size];
		putloc = size;
		getloc = 0;
	}
	
	Queue(Queue ob) {
		putloc = ob.putloc;
		getloc = ob.getloc;
		q = new char[ob.q.length];

		for(int i=getloc; i < putloc; i ++)
			q[i] = ob.q[i];
		}
	Queue(char a[]) {
		putloc = 0;
		getloc = 0;
		q = new char[a.length];

		for(int i=0; i < a.length; i++) put(a[i]);
	}

	// put a character into the queue
	void put(char ch) {
		if(putloc==q.length) {
			System.out.println(" - Queue is full.");
			return;
		}
		q[putloc++] = ch;
	}

	char get() {
		if(getloc==putloc) {
			System.out.println(" - Queue is empty.");
			return (char) 0;
		}
		char ch = q[0];
		for(int i=0; i<q.length-1; i++)
			q[i] = q[i+1];
		putloc--;
		return ch;
	}
}

class QDemo2 {
	public static void main(String args[]) {
		int size = 26;
		Queue myq = new Queue(size);
		for(int i=0; i<=25; i++)
			myq.q[i] = (char) ('A' + i);

		for(int i=1; i<=29; i++) {
			System.out.print(myq.get() + " ");
			myq.put((char)('Z'+ i));
		}
		System.out.println();
		for(int i=0; i<myq.q.length; i++)
			System.out.print(myq.q[i] + " ");
		System.out.println();

		// construct queue from another queue
		Queue myq2 = new Queue(myq);
		System.out.println("Queue created from a queue:");
		for(int i=0; i<=25; i++)
			System.out.print(myq2.q[i] + " ");
		System.out.println();

		// construct queue from an array
		Queue myq3 = new Queue(myq.q);
		System.out.println("Queue created from an array:");
		for(int i=0; i<=25; i++)
			System.out.print(myq3.q[i] + " ");
		System.out.println();
	}
}
