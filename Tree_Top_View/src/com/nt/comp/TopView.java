package com.nt.comp;

import java.util.*;
public class TopView
{
	static class Node
	{
		Node left;
		Node right;
		int data;
		Node(int data)
		{
			this.left = this.right = null;
			this.data=data;
		}
	}
	public static class QueueObject
	{
		Node node;
		int hd;
		QueueObject(Node node,int hd)
		{
			this.node = node;
			this.hd=hd;
		}
	}
	public static void topview(Node root)
	{
		if(root==null)
			return;
		Queue<QueueObject> qo = new LinkedList<>();
		Map<Integer,Integer> mp = new HashMap<>();
		int min = 0;
		int max = 0;
		qo.add(new QueueObject(root,0));
		while(!qo.isEmpty())
		{
			QueueObject q = qo.poll();
			if(!mp.containsKey(q.hd))
			{
				mp.put(q.hd, q.node.data);
			}
			if(q.node.left != null)
			{
				min = Math.min(min, q.hd-1);
				qo.add(new QueueObject(q.node.left,q.hd-1));
			}
			if(q.node.right != null)
			{
				max = Math.max(max, q.hd+1);
				qo.add(new QueueObject(q.node.right,q.hd+1));
			}
		}
		for(;min<=max;min++)
		{
			System.out.print(mp.get(min)+" ");
		}
	}

	public static void main(String[] args) 
	{
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.right = new Node(4);
		root.left.right.right = new Node(5);
		root.left.right.right.right = new Node(6);
		System.out.println("Following are Nodes in top View of BinaryTree");
		topview(root);

	}

}
