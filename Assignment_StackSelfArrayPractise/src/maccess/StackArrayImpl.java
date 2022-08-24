package maccess;

public class StackArrayImpl {
	// create an array with initial size
	public int container[];
	int top;
	int length = 0;
	int capacity;

	public StackArrayImpl() {
		capacity = 10;
		this.container = new int[capacity];
		top = -1;
	}// end of constructor

	public void push(int value) {
		// check whether length <=capapcity

		if ((top + 1) < capacity) {
			top++; // top points to the current index
			container[top] = value;
			length++;
		} // end of if case
		else {
			System.out.println("stack overflow!!!");
		} // end of else block
	}// end of push method

	public int pop() {
		int res = Integer.MIN_VALUE;
		if (top >= 0) {
			res = container[top];
			container[top] = 0;
			length--;
			top--;
		} // end of if
		else {
			System.out.println("Stack is empty");
		}
		return res;
	}// end of pop method

	public void peek() {
		System.out.println("Element at top::" + container[top]);
	}// end of method

	public void getSize() {
		System.out.println("stack size::" + length);
	}

	public void reverseStack() {
		int ar[] = new int[capacity];
		int length1 = length;
		int i = 0;
		length = 0;
		while (i < length1) {
			ar[i] = this.pop();
			i++;
		} // end of while loop

		System.out.println("index::::" + top);
		int j = 0;
		for (; j < length1; j++) {
			this.push(ar[j]);
		} // end of for loop
			// update
		length = j;
	}// end of method

	public void display() {
		for (int i = 0; i <= top; i++) {
			System.out.print(container[i] + "  ");
		} // end of for loop
	}// end of display method
}// end of class
