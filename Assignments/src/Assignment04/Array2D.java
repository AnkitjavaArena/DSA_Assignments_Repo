//[8/3 3:47 PM] Chetan Prasad
//Assignment for 2D arrays
//- Find the largest element in a 2D matrix
//  15  30   20  19
//  101 202  45  60
//  75  101  500 34
//  35  28   19   0

package Assignment04;

import java.util.Scanner;

public class Array2D {

	public Integer ar[][];

	// method to insert elements to array
	public void insert(Scanner s, int row, int column) {
		ar = new Integer[row][column];
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.println("Enter array element::");
				ar[i][j] = s.nextInt();
			} // end of inner loop
		} // end of outer loop

	}// end of method

	public int largest() {
		int largest = Integer.MIN_VALUE;

		// logic to find the largest from 2-d array
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				if (ar[i][j] > largest) {
					largest = ar[i][j];
				} // end of if
			} // end of inner loop
		} // end of outer loop
		return largest;
	}

	public void display() {
		// using enhanced for loop

		for (Integer k[] : ar) {
			System.out.print("|");
			for (Integer l : k) {
				System.out.print(l.toString() + "  ");
			} // end of inner loop
			System.out.println("|");
		} // end of outer for

	}// end of display method

}// end of class
