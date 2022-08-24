package maccess;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Mainclass {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter element for rootNode::");
		Node rootNode=new Node(Integer.parseInt(s.nextLine()));
	BinaryTreeImpl bT=new BinaryTreeImpl(rootNode);	
	
	//System.out.println("\nRootNode::"+rootNode.hashCode());
	String ch;
	do {
		System.out.println("Enter elements::");
		bT.insertInBinaryTreeLevelOrder(rootNode,Integer.parseInt(s.nextLine()));
		
		System.out.println("Press y/Y to enter more elements::");
		ch=s.nextLine();
	}while(ch.equalsIgnoreCase("y"));
	

	
	System.out.println("\n====All elements(inOrder traversal====");
	bT.inOrder(rootNode);
	
	
	System.out.println("\n===Level order traversal====");
	ArrayList<ArrayList<Integer>> al=bT.levelOrder(rootNode);
	
	System.out.println();
	System.out.println(al.toString());	
	
	s.close();
	}//end of main
	
}//end of class
