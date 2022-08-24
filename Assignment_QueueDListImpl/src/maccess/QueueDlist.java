package maccess;

public class QueueDlist {
	DNode front, rear;
	public int length;
	int index;
	public int capacity;

	public QueueDlist() {

		length = 0;
		front = null;
		rear = null;
		capacity = 5;
		index = 0;
	}// end of constructor

	public void enqueue(DNode node) {
		// check
		if (length < capacity) {
			if (front == null) {
				index = 0;
				front = node;
				front.prev = null;
				front.next = null;
//			System.out.println("\nhii1");
			} // end of if case
			else {
				if (rear == null) {
					// if rear is null
					front.next = node;
					node.prev = front;
					node.next = null;
					rear = node;
//				System.out.println("\nhii2");

				} // end of if block
				else if (rear != null) {
					rear.next = node;
					node.prev = rear;
					node.next = null;
					rear = node;

//			System.out.println("\nHii3");
				} // end of else block
			} // end of else block
			length++;
			index++;
		} // end of if block
//		else {
//			System.out.println("Queue is empty!!!no insertion");
//		}
		// return length;
	}// end of method

	public String toString() {
		DNode temp = front;
		StringBuffer sb = new StringBuffer();
		while (temp != null) {
			// operation
			sb.append(temp.data + "|");
//			System.out.print(temp.data+"  ");
			temp = temp.next;
		} // end of while loop
		return new String(sb);
	}// end of method
		// peek method

	public void peek() {
		System.out.println("front element::" + front.data);
	}// end of peek method

	public void isempty() {
		if (front == null)
			System.out.println("empty!!!");
		else
			System.out.println("Not empty!!!!");
	}

	public void isFull() {
		if (length == capacity) {
			System.out.println("full..........");
		} else
			System.out.println("Not full!!!");
	}// end of method

	public int getSize() {
		return length;
	}// end of method

	public void deque() {
		// remove the last element
		if (front != null) {
			if (front.next == null) {
				front = null;
				length--;
			} // end of if block
			else {
				DNode temp = null;
				temp = front.next;
				temp.prev = null;
				front = null;
				front = temp;
				length--;
			} // end of else block
		} // end of if case
		else {
			System.out.println("sorry!! list is empty");
		} // enf of else block
	}// end of method

}// end of class
