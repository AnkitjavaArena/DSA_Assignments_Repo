package Assignment01;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Array01 ob = new Array01();
		Scanner sr = new Scanner(System.in);
		ob.createArray(sr);
		ob.Display();
		System.out.println("SecondLargest::" + ob.findSecondLargest());
	}// end of main method
}// end of cl