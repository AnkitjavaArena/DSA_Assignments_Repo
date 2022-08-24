package test;

import maccess.*;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// insert the element at node
		LinkedListImpl li = new LinkedListImpl();
		String ch;
		do {
			System.out.println("Enter the value::");
			int value = Integer.parseInt(s.nextLine());
			Node ob = new Node(value);
			boolean b = li.InsertElementAtLast(ob);

			System.out.println("Enter y/Y to add more elements::");
			ch = s.nextLine();
		} while (ch.equals("y") || ch.equals("Y"));

		System.out.println("no of nodes::" + li.length);
		System.out.println("All node elements::");
		li.display();

		// search the element
		System.out.println("\nEnter the value to search::");
		int value = Integer.parseInt(s.nextLine());
		li.findElement(value);
//
		// insert a new node in between
		System.out.println("===Inserting node at between====");
		System.out.println("Enter the position::");
		int position = Integer.parseInt(s.nextLine());
//
		System.out.println("no of nodes::" + li.length);
		System.out.println("All node elements::");
		li.display();
//
		System.out.println("Length::" + li.length);
		System.out.println("Enter the index value you want to remove::");
		int index = Integer.parseInt(s.nextLine());
		li.deleteElementAtIndex(index);
//
		System.out.println("\n==display after deleting index " + index + " position " + (index + 1) + " value:: ");
		li.display();
		System.out.println("\nLength::" + li.length);

//		

		// code for getElementAtIndex(int i) //substituting the element
		System.out.println("\n all elements===");
		li.display();
		System.out.println("\n===Extracting element at particular index====");
		System.out.println("Enter the index whose value you want::");
		li.getElementAtIndex(Integer.parseInt(s.nextLine()));
		System.out.println();

		System.out.println("length/size of the list::" + li.getSize());

		s.close();
	}// end of main method

}// end of class
