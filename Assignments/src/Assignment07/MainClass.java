package Assignment07;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		DynamicArray al = new DynamicArray();
		String ch;
		do {
			System.out.println("Enter element::");
			al.addItem(Integer.parseInt(s.nextLine()));
			System.out.println("Enter y/Y to enter more");
			ch = s.nextLine();
		} while ((ch.equals("y")) || (ch.equals("Y")));

		// display the data
		al.display();
		System.out.println("total index::" + al.index);
		System.out.println("total length::" + al.length);
		System.out.println("total capacity::" + al.capacity);

		al.remove();
		// add item completed
		// code for removing element from last index
		System.out.println("after removing::");
		al.display();
		System.out.println("total index::" + al.index);
		System.out.println("total length::" + al.length);
		System.out.println("total capacity::" + al.capacity);

		// removing code is done
		// code for insertAt(int index,int value)
		System.out.println("Enter index to insert::");
		int index = s.nextInt();
		System.out.println("Enter value to insert::");
		int value = s.nextInt();
		al.insertAt(index, value);
		al.display();
		System.out.println("total index::" + al.index);
		System.out.println("total length::" + al.length);
		System.out.println("total capacity::" + al.capacity);

		// code for inserting element at certain index is done
		// code for removing element at certain index
		System.out.println("Enter the index value to remove::");
		al.removeAT(s.nextInt());
		al.display();
		System.out.println("total index::" + al.index);
		System.out.println("total length::" + al.length);
		System.out.println("total capacity::" + al.capacity);

		// to get the size of array
		System.out.println("Length/size::" + al.getLength());
		// to get the capacity of array
		System.out.println("Capacity::" + al.getCapacity());

		// getElementAt(index)
		al.getElementAt(3);

		// search the value in array
		System.out.println("enter value to search::");
		int search = s.nextInt();
		al.getElement(search);

		s.close();
	}// end of main method
}// end of class
