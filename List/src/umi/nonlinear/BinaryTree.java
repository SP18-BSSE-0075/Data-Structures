package umi.nonlinear;

public class BinaryTree
{
	
	private Node root;
	
	
	public BinaryTree() 
	{
		super();
		root = null;
	}
	
	public boolean isEmpty()
	{
		return root == null;
	}
	
	public void grow(int value)
	{
		root = grow(root, value);    // root value depends on return statement of grow(n, value);
	}
	
	private Node grow(Node n, int value)
	{
		if(n == null)
		{
			n = new Node();
			n.setValue(value);        // creating node 
		}
		else
		{
			if(n.getRight() == null)
			{
				n.setRight(grow(n.getRight(), value));  // if right is not null then put node at right
			}
			else
			{
				n.setLeft(grow(n.getLeft(), value));     // otherwise put in left
			}	
			
		}
		
		return n;
	}
	
	public void inOrder()
	{
		inOrder(root);
	}
	
	private void inOrder(Node n)
	{
		if(n != null)
		{
			inOrder(n.getLeft());
			System.out.println(n.getValue());
			inOrder(n.getRight());
		}
	}
	
	public void postOrder()
	{
		postOrder(root);
	}
	
	private void postOrder(Node n)
	{
		if(n != null)
		{
			postOrder(n.getLeft());
			postOrder(n.getRight());
			System.out.println(n.getValue());
		}
	}
	
	public void preOrder()
	{
		preOrder(root);
	}
	
	public void preOrder(Node n)
	{
		if(n != null)
		{
			System.out.println(n.getValue());
			preOrder(n.getLeft());
			preOrder(n.getRight());
		}
	}
	
	public int height()
	{
		return height(root);
	}
	
	private int height(Node n)
	{
		if(n == null)
		{
			return 0;
		}
		else if(n.aLeaf())
		{
			return 1;
		}
		else
		{
			return 1 + n.max(height(n.getLeft()), height(n.getRight()));
		}
	}
	
	public int depth(int value)
	{
		return depth(root, value, 1);
	}
	
	private int depth(Node n, int value, int count)
	{	
		if(n == null)
		{
			return 0;
		}
		else if(n.value == value)
		{
			return count;
		}
		else
		{
			return n.max(depth(n.getLeft(), value, count+1), depth(n.getRight(), value, count+1));
		}
	}


	class Node
	{
		private Node left,right;
		private int value;
		
		public synchronized Node getLeft() 
		{
			return left;
		}
		public synchronized void setLeft(Node left)
		{
			this.left = left;
		}
		public synchronized Node getRight()
		{
			return right;
		}
		public synchronized void setRight(Node right) 
		{
			this.right = right;
		}
		public synchronized int getValue() 
		{
			return value;
		}
		public synchronized void setValue(int value) 
		{
			this.value = value;
		}
		
		public boolean aLeaf()
		{
			return (this.getLeft() == null && this.getRight() == null);
		}
		
		public int max(int left, int right)
		{
			if(left > right)
			{
				return left;
			}
			else
			{
				return right;
			}
		}
		
	}

}
