package maccess;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeImpl {
	public Node root=null;
	public BinaryTreeImpl(Node root) {
		this.root=root;
	}//end of constructor

	public Node insertInBinaryTreeLevelOrder(Node root, int data) {
		if(root==null) {
			return null;
		}//end of if blcok
		
		Queue<Node> q=new LinkedList<Node>();
		
		q.offer(root);
		while(!q.isEmpty()) {
			Node temp=q.poll();
			if(temp!=null) {
				if(temp.left!=null)
					q.offer(temp.left);
				else {
					temp.left=new Node(data);
					return root;
				}
			}//end of if
			
			if(temp.right!=null)
				q.offer(temp.right);
			else {
				temp.right=new Node(data);
				return root;
			}//end of else
			
			
		}//end of while loop
		
		
	return root;		
	}//end of method
	
	//logic for preorder travesrasl
	public void preOrder(Node root) {
		if(root!=null) {
			System.out.print(root.data+" ");
			preOrder(root.left);
			preOrder(root.right);
		}//end of if
	}//end of method
	
	
	public void inOrder(Node root) {
		if(root!=null) {
			inOrder(root.left);
			System.out.print(root.data+" ");
			inOrder(root.right);
		}//end of if
	}//end of method
	
	
	
	//logic for level order traversal
	
	public ArrayList<ArrayList<Integer>> levelOrder(Node node){
		
		ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
		
		if(root==null)
			return res;
		
		//initialization
		Queue<Node> q=new LinkedList<Node>();
		q.offer(root);
		q.offer(null);
		ArrayList<Integer> curr=new ArrayList<Integer>();
		while(!q.isEmpty()) {
			Node tmp=q.poll();
			if(tmp!=null)
			{
				curr.add(tmp.data);
				if(tmp.left!=null)
					q.offer(tmp.left);
				if(tmp.right!=null)
					q.offer(tmp.right);
			}
			else {
				ArrayList<Integer> c_curr=new ArrayList<Integer>(curr);
				res.add(c_curr);
				curr.clear();  
				//java will clear the reference,so have to new an arrayliost
				//completion of a leevel
				if(!q.isEmpty())
					q.offer(null);
			}
		}//end of while loop
		return res;
	}//end of method
	
	
	
	
	
	
	
	
	
	
	
	
}//end of class
