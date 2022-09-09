package com.nt.comp;

public class LeftView {
	Node root;
	static int max_Level;
	public void leftViewUtil(Node node,int level)
	{
		if(node == null)
		  return;
		if(max_Level<level)
		{
			System.out.print(" "+node.data);
			max_Level = level;
		}
		leftViewUtil(node.left,level+1);
		leftViewUtil(node.right,level+1);
	}
	void printLeftView()
	{
		max_Level = 0;
		leftViewUtil(root,1);
	}

	public static void main(String[] args) {
		LeftView lv = new LeftView();
		lv.root = new Node(1);
		lv.root.left = new Node(2);
		lv.root.right = new Node(3);
		lv.root.left.left = new Node(4);
		lv.root.left.right = new Node(5);
		lv.root.right.right = new Node(6);
		lv.root.right.left = new Node(7);
		lv.root.right.right.right = new Node(8);
		
		lv.printLeftView();
	}
}