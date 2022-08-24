package maccess;

public class DoubleLinkedListImpl {
	public DNode head, tail;
	public int length;

	public DoubleLinkedListImpl() {
		this.head = null;
		this.tail = head;
		length = 0;
	}

	public void InsertElementAtLast(DNode node) {
		if (head == null) {
			head = node;
			head.prev = null;
			head.next = null;
			tail = head;
			length++;
		} // end of if case
		else {
			// head is not null
			// first traverse the list
			DNode temp = head;
			DNode q = temp;
			do {
				q = temp;

				temp = temp.next;

			} while (temp != null);
			// add value to end
			q.next = node;
			node.prev = q;
			node.next = null;
			tail = node;
			length++;
		} // end of else
	}// end of add method

	public void deleteElementAtLast() {
		// remove the tail
		if (tail != null) {
			DNode temp = tail.prev;
			// tail=tail.prev;
			tail.prev.next = null;
			tail = null;
			// updating last value as tail
			tail = temp;
			length--;
		} // end of if case
		else {
			System.out.println("=====No Element to remove====");
		} // end of else block
	}// end of remove method

	public void insertElementAtIndex(int position, DNode node) {
		// trigger that position by travesring upto that location
		if (position <= length && position > 0) {
			if (head != null) {
				DNode temp = head;
				int count = 1;
				XYZ: do {
					if (position == count) {
						// node triggered
						DNode q = temp.prev;
						// DNode r=temp.next;
						temp.prev.next = node;
						node.prev = q;
						node.next = temp;
						temp.prev = node;

						break XYZ; // insertion of node in between done
					} // end of if case

					// update the value
					temp = temp.next;

				} while (temp != null);
			} // end of if case
		} // end of outer if case
	}// end of method

	public void deleteElementAt(int position) {
		// traverse the list to find the right element
		if (head != null) {
			DNode temp = head;
			int count = 1;
			XYZ: do {
				temp = temp.next;
				count++;

				if (position == count) {
					System.out.println("currently at::" + position);
					// node triggered
					DNode q = temp.prev;
					DNode r = temp.next;
					temp.prev.next = r;
					temp.next.prev = q;
					temp = null;
					length--;
					break XYZ;
				} // end of if case
			} while (temp != null);
		} // end of if case
	}// end of method

	// to display the data
	public void display() {
		// traverse the element to last
		if (head != null) {
			DNode temp = head;
			do {
				System.out.print(temp.data + "  ");
				temp = temp.next;
			} while (temp != null);
		} // end of if case
	}// end of display method

	public void findElement(int value) {
		// traverse from beginneg to last
		boolean k = false;
		if (head != null) {
			DNode temp = head;
			int i = 0;
			do {
				if (temp.data == value) {
					k = true;
					System.out.println("Element found at index/location::" + i);
				} // end of if case
				temp = temp.next;
				i++;
			} while (temp != null);

			if (k == false) {
				System.out.println("element not found!!!");
			} // end of if case

		} // end of if case
		else {
			System.out.println("List is empty....");
		} // end of else case
	}// end of method

	public int getSize() {
		return this.length;
	}// end of method

}// end of class
