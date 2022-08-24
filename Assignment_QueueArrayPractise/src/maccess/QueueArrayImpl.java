package maccess;

public class QueueArrayImpl {
	int ar[];
	int front, rear, capacity;

	public QueueArrayImpl() {
		super();
		capacity = 10;
		this.ar = new int[capacity];
		this.front = -1;
		this.rear = -1;
	}// end of constructor

	public void enqueue(int value) {
		// check
		if (front == -1) {
			ar[0] = value;
			front++;
			rear++;
		} // end of if case
		else {
			if ((rear + 1) < capacity) {
				rear++;
				ar[rear] = value; // element inserted
			} // end of if blcok
			else {
				System.out.println("queue filled!!!");
			}
		} // end of else block
	}// end of method

	public void deque() {
		if (front >= 0) {
			int i = 1;
			for (; i <= rear; i++) {
				ar[i - 1] = ar[i]; // value updated
			} // end of for loop
			ar[i - 1] = 0;
			rear = i - 2;
		} // end of if case
	}// end of method

	public void peek() {
		if (front != -1)
			System.out.println("Element at first::" + ar[front]);
		else {
			System.out.println("Queue is empty!!!!");
		}
	}

	public void isempty() {
		if (front == -1)
			System.out.println("empty!!!");
		else
			System.out.println("Not empty!!!!");
	}

	public void isFull() {
		if (rear == capacity) {
			System.out.println("full..........");
		} else
			System.out.println("Not full!!!");
	}// end of method

	public void display() {
		if (front > -1) {
			for (int i = front; i <= rear; i++) {
				System.out.print(ar[i] + "  ");
			} // end of for loop
			System.out.println();
		} // end of if case
		else {
			System.out.println("Queue is empty....");
		}
	}// end of method

}// end of class
