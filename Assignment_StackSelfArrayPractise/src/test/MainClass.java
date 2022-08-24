package test;

import maccess.*;
import java.util.*;

public class MainClass {
	public static void main(String[] args) {
		StackArrayImpl stck = new StackArrayImpl();
//		
		Scanner s = new Scanner(System.in);

		int k = 0;
		do {
			k = 0;
			System.out.println(
					"\nEnter choice::\n1.PUSH\n2.POP\n3.PEEK\n4.Display all elements\n5.exit\n6." + "Reverse Stack");
			int choice = Integer.parseInt(s.nextLine());
			switch (choice) {
			case 1:
				System.out.println("\nEnter value::");
				stck.push(Integer.parseInt(s.nextLine()));
				k = 1;
				break;
			case 2:
				System.out.println("====stack after a pop====");
				stck.pop();
				stck.display();
				k = 1;
				break;
			case 3:
				stck.peek();
				k = 1;
				break;
			case 4:
				stck.display();
				k = 1;
				break;
			case 5:
				System.exit(0);
				k = 0;
				break;

			case 6:// reverse the stack
				stck.reverseStack();
				stck.display();
				break;

			default:
				System.out.println("\nInvalid choice....");
				k = 1;
				break;
			}// end of switch
		} while (k == 1); // end of do-while loop

		System.out.println("\n===Length of stack===");
		stck.getSize();
		s.close(); // end of scanner
	}// end of main method
}// end of class
