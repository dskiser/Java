/*
	Try this 5-2

	Create a queue
*/
class Queue {
	char q[];
	int putloc, getloc;

	Queue(int size) {
		q = new char[size];
		putloc = size;
		getloc = 0;
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

class QDemo {
	public static void main(String args[]) {
		Queue myq = new Queue(26);
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
	}
}
