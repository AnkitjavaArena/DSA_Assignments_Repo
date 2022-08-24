package test;

import maccess.*;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		DoubleLinkedListImpl dl = new DoubleLinkedListImpl();

		// insert
		String ch;
		do {
			System.out.println("Enter the Element::");
			int data = Integer.parseInt(s.nextLine());
			DNode node = new DNode(null, null, data);
			dl.InsertElementAtLast(node);

			System.out.println("Press y/Y to enter more elements::");
			ch = s.nextLine();
		} while (ch.equals("y") || ch.equals("y"));

		// display the list
		System.out.println("====ALL Elements====");
		dl.display();
		// remove last elements::
		dl.deleteElementAtLast();
		System.out.println("\n====After removeal List====");
		dl.display();
		System.out.println("\n===Length===");
		System.out.println(dl.length);
//		
		dl.insertElementAtIndex(3, new DNode(null, null, 19));
		System.out.println("\nAfter adding in third position===");
		dl.display();
		System.out.println("\n===Length===");
		System.out.println(dl.length);
//		
		System.out.println("===Removing At particular position===");
		dl.deleteElementAt(4);
//		
		System.out.println("===After removing in between node list====");
		dl.display();
		System.out.println("\n===length====");
		System.out.println(dl.length);

		System.out.println("\nsearching element::5");
		dl.findElement(5);
//		
		System.out.println("===length of list====");
		System.out.println("Length::" + dl.getSize());
		s.close();
	}// end of main method
}// end of class
