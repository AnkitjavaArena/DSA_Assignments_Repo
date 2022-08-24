package maccess;

public class StackListImpl {
	// create an array with initial size
	public Node head, top;
	int length = 0;
	int capacity;

	public StackListImpl() {
		capacity = 10;

		Node top = null;
	}// end of constructor

	public void push(Node node) {
		// check whether length <=capapcity

		if (length <= capacity) // chedcking capapcity
		{
			if (top == null) {
				top = node;
				head = node;
				top.next = null;
				length++;
			} // end of first case
			else { // not first element
				top.next = node;
				node.next = null;
				top = node;
				length++;
			} //
		} // end of if case
		else {
			System.out.println("Stack overflow!!!!!");
		} // end of else block
	}// end of push method

	public void pop() {
		// delete the last node traverse
		// traverse the linked list till you dont find null
		Node temp = head;
		Node q = temp;
		if (length > 0) {
			do {

				q = temp;
				temp = temp.getNext();

			} while (temp.getNext() != null);// end of while loop
			q.next = null;
			top = q;
//		
//		//now q is the last 2nd node
			temp = null;
			top = q;
			top.next = null;

			length--;
		} // end of if case
		else {
			System.out.println("Stack empty!!!");
		}
	}// end of pop method

	public void peek() {
		System.out.println("Last element::" + top.data);

	}// end of method

	public void getSize() {
		System.out.println("stack size::" + length);
	}

	// to display all the data values in the node
	public void display() {
		// traverse the linked list till you dont find null
		Node temp = head;// Node q=temp;;
		do {
			// q=temp;
			// print the data of the node
			System.out.print(temp.getData() + "  ");
			// maintain the prevoius node
			temp = temp.getNext();
		} while (temp != null);// end of while loop

	}// end of display method
}// end of class
