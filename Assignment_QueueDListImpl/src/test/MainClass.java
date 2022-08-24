package test;

import maccess.*;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		QueueDlist que = new QueueDlist();
		Scanner s = new Scanner(System.in);
		String ch;
		int length = 0;

		do {
			if (length < que.capacity) {
				length++;
				System.out.println("Enter element::");
				que.enqueue(new DNode(null, null, Integer.parseInt(s.nextLine())));
				System.out.println("Enter y/Y for more elements::");
				ch = s.nextLine();
			} // end of if
			else {
				System.out.println("Queue filled!!! no insertion possible");
				break;
			}
		} while (ch.equals("y") || ch.equals("Y"));

		System.out.println("\n===All elements=======");
		System.out.println(que.toString());

		System.out.println("\n===peek()====");
		que.peek();

		System.out.println("\n===isEmpty()====");
		que.isempty();

		System.out.println("Length::" + que.getSize());
//		
		System.out.println(que.toString());
		System.out.println("\n===deque===");
		que.deque();
		System.out.println(que.toString());
		System.out.println("\n===deque===");
		que.deque();
		System.out.println(que.toString());
		que.toString();

		s.close();
	}// end of main method
}// end of class
