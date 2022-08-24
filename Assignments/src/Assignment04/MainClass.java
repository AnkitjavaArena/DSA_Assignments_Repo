package Assignment04;

import java.util.Scanner;

import Assignment04.Array2D;

public class MainClass {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);

		System.out.println("Enter Number of rows::");
		int row = sr.nextInt();
		System.out.println("Enter number of columns::");
		int column = sr.nextInt();

		Array2D obj = new Array2D();
		obj.insert(sr, row, column);

		System.out.println("Largest::" + obj.largest());

		System.out.println("====Original array::");
		obj.display();

	}// end of main method
}// end of class

/*
 * To find largest Time Complexity::O(n) Space Complexity:: O(1)
 */
