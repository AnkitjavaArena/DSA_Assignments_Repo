package Assignment06;
//- Find an element in a sorted matrix

//  10 20 30 40
//  15 25 35 45
//  27 29 37 48
//  32 33 39 50
//

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		int ar[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };
		Scanner sr = new Scanner(System.in);
		// print the data
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(ar[i][j] + "  ");
			} // end of innerloop
			System.out.println();
		} // end ofouter loop

		System.out.println("Enter the element to be searched::");
		int search = sr.nextInt();

		int colLock = -1;
		for (int j = ((ar[0].length) - 1); j >= 0; j--) {
			// System.out.println("hii4");
			if (search >= ar[0][j]) {
				colLock = j;
				break;
			} // end of if

		} // end of for loop

		// search in than=t column
		if (colLock >= 0) {
			// System.out.println("colLock::"+colLock);
			// System.out.println("hii1");
			boolean k = false;
			for (int i = 0; i < ar.length; i++) {
				// System.out.println("Hii2");
				if (search == ar[i][colLock]) {
					// System.out.println("hii3");
					k = true;
					System.out.println("element fount at::" + "row::" + (i + 1) + " Columns::" + (colLock + 1));
				} // end of if
			} // end of for
		}

	}/// end of main method
}// end of class
