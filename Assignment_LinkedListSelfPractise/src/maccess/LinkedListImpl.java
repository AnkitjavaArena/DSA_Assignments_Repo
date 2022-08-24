package maccess;

public class LinkedListImpl {
	public Node head = null;
	// public Node tail = null;

	public int length = 0;

	public boolean InsertElementAtLast(Node n) {
		boolean res = false;
		if (head == null) {
			// then it is the first element
			head = n;
			head.next = null;
			res = true;
			// tail=head;
			length++;
//			System.out.println("cursor here===");
//			System.out.println(head.next);
		} // end of if case

		else {
			// add the element to the end
			// but first traverse and find the null
			Node temp = head;
			Node q = temp;
			;
			while (temp != null) {
				q = temp;
				// maintain the prevoius node
				temp = temp.getNext();
			} // end of while loop

			// now q has the last node reference and temp is pointing to null
			// we have set the reference of new node to the previous node's next variable
			q.next = n;
			// tail=n;
			n.next = null;
			length++;
		}
		return res;
	}// end of add method

	// to display all the data values in the node
	public void display() {
		// traverse the linked list till you dont find null
		if (head != null) {
			Node temp = head;// Node q=temp;;
			do {
				// q=temp;
				// print the data of the node
				System.out.print(temp.getData() + "  ");
				// maintain the prevoius node
				temp = temp.getNext();
			} while (temp != null);// end of while loop
		} // end of outer if
		else {
			System.out.println("Sorry list is empty!!!");
		}
	}// end of display method

	// search an element in linked list
	public void findElement(int value) {
		// traverse from scratch and identify the element
		int i = 0;
		boolean k = false;
		if (head != null) {
			Node temp = head;

			do {
				i++;
				if (temp.getData() == value) {
					k = true;
					System.out.println("Element at node::" + i);
				} // end of if case

				// maintain the prevoius node
				temp = temp.getNext();
			} while (temp != null);// end of while loop

			if (k == false) {
				System.out.println("Element not found!!!");
			} // end of if
		} // end of if case
	}// end of seaarch method

	public void insertAt(int pos, Node n) {
		// verify the position with the length
		if (pos > 1 && pos < length) {
			// insert between the nodes

			// traverse and spot the location
			Node temp = head;
			Node q = temp;
			;
			int index = 0;
			do {
				index++;
				// q=temp;
				if (index == pos) {
					// reached current location
					q.next = n;
					n.next = temp;
					break;
				} // end of if
					// print the data of the node
					// maintain the next and prevoius node
				q = temp;
				temp = temp.getNext();
			} while (temp != null);// end of while loop
			length++;
		} // end of if case
	}// end of method

	// find the middle element from list
	public void midSearch() {
		if (length > 0) {
			int i = 0;
			int mid = length / 2;
			// traverse and find the list
			if (head != null) {
				Node temp = head;

				do {
					i++;
					if (i == mid) {

						System.out.println("Element at node::" + i);
						System.out.println("mid value::" + temp.data);
					} // end of if case

					// maintain the prevoius node
					temp = temp.getNext();
				} while (temp != null);// end of while loop

			} // end of if case
		} // end of if
	}// end of method

	// adding functionality of deleteElementAtIndex(int i)
	public void deleteElementAtIndex(int i) {
		Node temp = head;
		Node q = temp;
		;
		// i here is to be the index
		// check the index value
		int k = -1;
		if (i <= (length - 1) && i >= 0) {
			if (i == 0) {
				// removing at first index
				if (head.next != null) {
					temp = head.next;
					head = null;
					head = temp;
					System.out.println("===first element deleted====");
					// first element deleted
					length--;
				} // end of inner if case
				else {
					System.out.println("deleted onee and only one element present in list::");
					head = null;
					length--;
				}
			} // end of outer if case
			else {

				do {
					// delete the element ,but first locate the element
					k++;
					if (i == k) {
						// match found
						q.next = temp.next;
						temp = null;
						length--;
						break;
					} // end of if case
					q = temp;
					temp = temp.getNext();

				} while (temp != null);// end of while loop
			} // end of else case
		} // end of outer if case
		else {
			System.out.println("Invalid index!!!");
		} // end of outer else case

	}// end of method

	// adding functionality of deleting element at last
	// we have tail variable whcih points to last node

	public void deleteElementAtLast() {
		// System.out.println("tail element::"+tail.data);
		Node temp = head;
		Node q = null;
		Node p = null;
		System.out.println("length::" + length);
		if (length == 1) {
			head = null;
			length--;
		} // end of if block

		else {

			do {
				// maintain the 2nd previous address
				p = temp;
				temp = temp.next;
			} while (temp.getNext() != null);// end of while loop

			System.out.println("2nd last element::" + p.getData());
			p.next = null;
			length--;
			// deleting the last element

			// now q is the maintaining previous address
		} // end of else block
	}// end of method

	public void getElementAtIndex(int index) {

		// traverse from scratch and identify the element
		int i = 0;
		boolean k = false;
		if (head != null) {
			if (index <= (length - 1) && index >= 0) {
				Node temp = head;
				do {
					if (index == i) {
						k = true;
						System.out.println("Element at index " + index + "::" + temp.getData());
					} // end of if case

					// maintain the prevoius node
					temp = temp.getNext();
					i++;
				} while (temp != null);// end of while loop

			} // end of inner if case
			else {
				System.out.println("Invalid index......");
			} // end of else case

		} // end of outer if case

		else {
			System.out.println("List is empty!!!!");
		} // end of else case
	}// end of method

	public int getSize() {
		return length;
	}

}// end of class