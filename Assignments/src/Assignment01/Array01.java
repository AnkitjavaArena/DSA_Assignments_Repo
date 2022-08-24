//[8/3 3:37 PM] Chetan Prasad
//Assignment for 1d array
//
//1. Given an arrya, print the second largest element in the array, please mention the time and space complexity.
//{1,2,3,4,5,6,2,8,25,42};

//find the second largest
package Assignment01;

import java.util.Scanner;

public class Array01 {
	private int ar[] = null;

	public void createArray(Scanner sr) {
		System.out.println("Enter the number of elements::");
		int n = sr.nextInt();
		ar = new int[n];

		// enter elements::
		for (int i = 0; i < n; i++) {
			System.out.println("Enter elements::");
			ar[i] = sr.nextInt();
		} // end of loop
	}// end of method

	public void Display() {
		System.out.println("===Array elements===");
		for (int k : ar) {
			System.out.print(k + "  ");
		}
	}

	public int findSecondLargest() {
		int largest = Integer.MIN_VALUE;
		int sLarge = Integer.MIN_VALUE;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > largest) {
				sLarge = largest;
				largest = ar[i];
			} // end of if case
		} // end of for loop

		System.out.println("\nLargest::" + largest);
		return sLarge;
	}

}// end of class
