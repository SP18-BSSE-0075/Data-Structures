package umi.nonlinear;

public class BinarySearchTree
{
	private Node root;
	
	public BinarySearchTree()
	{
		super();
		root = null;
		
	}
	
	public void grow(int value)
	{
		root = grow(value, root);
	}
	
	private Node grow(int value, Node current)
	{
		if(current == null)
		{
			current = new Node();
			current.setValue(value);
			
			return current;
		}
		else
		{
			if(current.getValue() < value)
			{
				current.setRight(grow(value, current.getRight()));
			}
			else
			{
				current.setLeft(grow(value, current.getLeft()));
			}
			
			return current;
		}
	}
	
	public void inOrderTraverse()
	{
		inOrder(root);
	}
	
	private void inOrder(Node current)
	{
		if(current != null)
		{
			inOrder(current.getLeft());
			System.out.println(current.getValue());
			inOrder(current.getRight());
		}
	}
	
	public int height()
	{
		return height(root);
	}
	
	private int height(Node current)
	{
		if(current == null)
		{
			return 0;
		}
		else if(current.aLeaf())
		{
			return 1;
		}
		else
		{
			return 1 + max(height(current.getLeft()), height(current.getLeft()));
		}
	}
	
	public int depth(int value)
	{
		return depth(value, root, 0);
	}
	
	private int depth(int value, Node current, int count)
	{
		if(current == null)
		{
			return 0;
		}
		else if(current.getValue() == value)
		{
			return count;
		}
		else if(current.getValue() < value)
		{
			return depth(value, current.getRight(), count+1);
		}
		else
		{
			return depth(value, current.getLeft(), count+1);
		}
	}
	
	private int max(int n1, int n2)
	{
		if(n1 > n2)
		{
			return n1;
		}
		else
		{
			return n2;
		}
	}


	class Node
	{
		private int value;
		private Node left;
		private Node right;
		
		public int getValue() {
			return value;
		}
		public void setValue(int value) {
			this.value = value;
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
		
		public boolean aLeaf()
		{
			return (this.getLeft() == null && this.getRight() == null);
		}
		
		
	}

}
