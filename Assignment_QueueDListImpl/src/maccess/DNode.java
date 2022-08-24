package maccess;

public class DNode {
	public DNode prev, next;
	public int data;

	public DNode(DNode prev, DNode next, int data) {
		super();
		this.prev = null;
		this.next = null;
		this.data = data;
	}// end of constructor

	// end of getter and setter
	public DNode getPrev() {
		return prev;
	}

	public void setPrev(DNode prev) {
		this.prev = prev;
	}

	public DNode getNext() {
		return next;
	}

	public void setNext(DNode next) {
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

}// end of class
