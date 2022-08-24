package test;

import maccess.QueueArrayImpl;

public class MainClass {
	public static void main(String[] args) {
		QueueArrayImpl qe = new QueueArrayImpl();
		qe.enqueue(10);
		System.out.println("\n===all elements====");
		qe.display();
		qe.enqueue(11);
		System.out.println("\n===all elements====");
		qe.display();

		qe.enqueue(12);
		qe.enqueue(13);
		qe.enqueue(14);
		qe.enqueue(15);
		qe.enqueue(16);
		System.out.println("\n===all elements====");
		qe.display();
		// dequeue
		qe.deque();
		System.out.println("\n===After dequeu all elements====");
		qe.display();
		qe.deque();
		System.out.println("\n===After dequeu all elements====");
		qe.display();
		System.out.println("===Peek operation===");
		qe.peek();

		System.out.println("===check whether empty or not===");
		qe.isempty();

		System.out.println("===check whether full or not===");
		qe.isFull();

	}// end of main method
}// end of main method
