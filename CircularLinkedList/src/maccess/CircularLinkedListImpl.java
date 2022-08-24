package maccess;

public class CircularLinkedListImpl {
	public Node head = null,root=null;
	//public Node tail = null;
	
	public int length = 0;

	public boolean InsertElementAtLast(Node n) {
		boolean res = false;
		if (head == null) {
			// then it is the first element
			head = n;
			head.next = head;
			res = true;
			//tail=head;
			length++;
			root=head;
//			System.out.println("cursor here===");
//			System.out.println(head.next);
		} // end of if case

		else {
			// add the element to the end
			// but first traverse and find the null
			if(head.next==head) {
				head.next=n;
				n.next=head;
				root=n;length++;
			}//end of if case
			else {
				root.next=n;
				n.next=head;
				root=n;length++;
			}//end of else case
		}
		return res;
	}	

	
	
	// to display all the data values in the node
	public void display() {
		// traverse the linked list till you dont find null
		if(head!=null) {
		Node temp = head;// Node q=temp;;
		do {
			// q=temp;
			// print the data of the node
			System.out.print(temp.getData() + "  ");
			// maintain the prevoius node
			temp = temp.getNext();
		} while (temp != head);// end of while loop
	}//end of outer if
		else {
			System.out.println("Sorry list is empty!!!");
		}
	}// end of display method

	
	public int getSize() {
		return length;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	

	
}// end of class