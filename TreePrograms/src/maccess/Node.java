package maccess;

public class Node{
	public int data;
	public Node left,right;
	
	public Node(int data) {
		this.data=data;
		left=null;
		right=null;
	}//end of cons.

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}
	
	
}//end of class