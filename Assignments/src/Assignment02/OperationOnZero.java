//
//[8/3 3:37 PM] Chetan Prasad
//Assignment for 1d array
//
//1. Given an arrya, print the second largest element in the array, please mention the time and space complexity.
//{1,2,3,4,5,6,2,8,25,42};
//
//2. Sort all 0's on 1 side and 1's on another side, please mention the time and space complexity.
//{0,1,0,1,0,1,0,1,0,1,0,1,0,1};
//
package Assignment02;

public class OperationOnZero {
	public static void main(String[] args) {
		int ar[] = { 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1 };

		// sorting logic
		int pos = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == 0) {
				int temp = ar[pos];
				ar[pos] = ar[i];
				ar[i] = temp;
				pos++;
			} // end of if case
		} // end of for loop

		// print the array

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + "  ");
		}
	}// end of main
}// end of class
