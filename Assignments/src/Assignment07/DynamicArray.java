
/*[8/4 2:53 PM] Chetan Prasad
Assignment for Dynamic array
Implement a Dynamic array with the following functionalities
AddItem(int value);
RemoveItem();InsertAt(int index, int value);RemoveAt(int index);GetSize();GetCapacity();GetElementAt(int index);GetElement(int value);
 like 1
*/

package Assignment07;

public class DynamicArray {
	public int ar[];
	public int index = -1;
	public int length = 0;
	int capacity = 0;

	public DynamicArray() {
		ar = new int[1];
		capacity = 1;
	}// end of constructor

	// getters and setters
	public int[] getAr() {
		return ar;
	}

	public void setAr(int[] ar) {
		this.ar = ar;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public void createDuplicateArray() {
		capacity = 2 * capacity;
		int ar2[] = new int[capacity];

		// fill ar2
		index = -1;
		for (int k : ar) {
			index++;
			ar2[index] = k;
		} // end of for loop
			// change the rederence
		ar = ar2; // here previous ar is destroyed

	}// end of method

	// creating an array with initial size
	public void addItem(int value) {
		// first check the size
		if (length >= capacity) {
			// space is filled
			// double the size of array and refill it
			this.createDuplicateArray();
			index++;
			ar[index] = value;
			length++;
		} // end of if case
		else {
			// space is vacant
			index++;
			ar[index] = value;

			length++;
		}
	}// end of addItem method

	public boolean remove() {
		boolean k = false;
		// check whether list is empty or not
		if (length == 0) {
			// empty
			System.out.println("List is empty");
		} // end of if

		else {
			ar[index] = 0;
			index--;
			length--;

			if (length == (capacity / 2)) {
				capacity = length;
				int ar2[] = new int[capacity];

				index = -1;
				// fill ar2
				for (int j = 0; j < length; j++) {
					++index;
					ar2[j] = ar[j];
				}
				// end of for loop
				// change the rederence
				ar = ar2; // here previous ar is destroyed

			} // end of if
		} // end of else case
		return k;
	}// end of method

	public void insertAt(int index2, int value) {
		// check the index is valid or not
		if (index2 <= this.index && index2 >= 0) {
			// valid
			// check the capacity
			if ((length + 1) >= capacity) {
				this.createDuplicateArray();
			} // end of if case
				// we r good to insert in array

			for (int i = index + 1; i >= index2; i--) {
				ar[i] = ar[i - 1];
			} // end of for loop
				// now index2 is empty insert
			ar[index2] = value;
			index++;
			length++;
		} else {
			System.out.println("Invalid index!!!");
		}

	}// end of method

	public void removeAT(int index2) {
		/// validate the index
		if (index2 <= this.index && index2 >= 0) {
			// valid
			for (int i = index2; i < (length - 1); i++) {
				// dump all the values to forward
				ar[i] = ar[i + 1];
			}

			index--;
			length--;
		} else {
			System.out.println("Invalid index!!!");
		}

	}// end of method

	public void getElementAt(int index2) {
		// validate the index
		if (index2 <= this.index && index2 >= 0) {
			// valid index
			System.out.println("Element at index::" + index2 + " is::" + ar[index2]);
		} // end of if case
		else {
			System.out.println("Invalid index!!!!!!");
		} // end of else case
	}// end of method

	public void getElement(int value) {
		boolean b = false;
		int i = 0;
		for (int k : ar) {
			if (k == value) {
				b = true;
				System.out.println("Element found at index::" + i);
			} // end of if case
			i++;
		} // end of loop

		if (b == false) {
			System.out.println("Element not found!!!");
		} // end of if case
	}// end of method

	public void display() {
		for (int k = 0; k <= index; k++) {
			System.out.print(ar[k] + "  ");
		}
		System.out.println();
	}// end of display method

}// end of class
