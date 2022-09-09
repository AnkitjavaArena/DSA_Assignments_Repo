package com.nt.comp;
public class Node
{
	int data;
	Node left,right;
	
	public Node(int item)
	{
		this.data = item;
		right = left = null;
	}
}
