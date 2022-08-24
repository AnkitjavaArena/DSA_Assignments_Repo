package test;

import maccess.*;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// insert the element at node
		CircularLinkedListImpl li = new CircularLinkedListImpl();
		String ch;
		do {
			System.out.println("Enter the value::");
			int value = Integer.parseInt(s.nextLine());
			Node ob = new Node(value);
			boolean b = li.InsertElementAtLast(ob);

			System.out.println("Enter y/Y to add more elements::");
			ch = s.nextLine();
		} while (ch.equals("y") || ch.equals("Y"));

		System.out.println("\nno of nodes::" +li.getSize());
		System.out.println("All node elements::");
		li.display();
		
		System.out.println("\n===all elements===");
		li.display();
		
		
		s.close();
	}// end of main method

}// end of class
