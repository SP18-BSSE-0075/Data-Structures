package umi.list;

public class ArrayList <T>
{
	private Node head;
	
	
	public ArrayList() 
	{
		this.head = null;
	}
	
	public boolean isEmpty()
	{
		return head == null;
	}
	
	public boolean insert(T value)
	{
		Node temp = new Node();
		temp.value = value;
		temp.next = null;
		
		if (isEmpty())
		{
			head = temp;
			
			return true;
		}
		else
		{
			Node current = head;
			
			while(current.next != null)
			{
				current = current.next;
			}
			
			current.next = temp;
			
			return false;
		}
	}
	
	public boolean insertAtStart(T value)
	{
		Node temp = new Node();
		temp.value = value;
		temp.next = null;
		
		if(!isEmpty())
		{
			temp.next = head;
			head = temp;
		}
		
		return true;
	}
	
	public boolean insertAfter(T value, T after)
	{
		Node temp = new Node();
		temp.value = value;
		temp.next = null;
		
		if(!isEmpty())
		{
			Node current = head;
			
			while(current.value != after)
			{
				current = current.next;
			}
			
			temp.next = current.next;
			current.next = temp;
		}
		
		return true;
	}
	public void display()
	{
		if(!isEmpty())
		{
			Node current = head;
			
			while(current != null)
			{
				System.out.println(" { " + current.value + " } ");
				current = current.next;
			}
		}
	}
	
	public boolean delete(T value)
	{
		if(!isEmpty())
		{
			Node current = head;
			
			while(current.next.value != value)
			{
				current = current.next;
			}
			
			current.next = current.next.next;
				
		}
		
		return true;
	}
	
	public boolean deleteFromStart()
	{
		if(!isEmpty())
		{
			head = head.next;
		}
		
		return true;
	}
	
	public boolean deleteFromEnd()
	{
		if(!isEmpty())
		{
			Node current = head;
			
			while(current.next.next != null)
			{
				current = current.next;
			}
			
			current.next = null;
		}
		
		return true;
	}
	
	public int capacity()
	{
		int size = 0;
		
		if(!isEmpty())
		{
			Node current = head;
			
			while(current != null)
			{
				size++;
				current = current.next;
			}
		}
		
		return size;
	}
	
	public boolean modify(int index, T value)
	{
		if(!isEmpty())
		{
			Node current = head;
			
			for(int i = 0 ; i < index ; i++)
			{
				current = current.next;
			}
			
			current.value = value;
		}
		
		return true;
	}
	
	class Node
	{
		private T value;
		private Node next;
	}

}
