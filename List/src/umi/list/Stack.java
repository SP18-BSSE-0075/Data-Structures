package umi.list;

public class Stack<T> 
{
	private Node head;
	private int capacity;
		
	public Stack() 
	{
		super();
		head = null;
		capacity = 0;
	}
	
	public boolean isEmpty()
	{
		return head == null;
	}
	
	public boolean push(T value)
	{
		Node temp = new Node();
		temp.value = value;
		temp.next = null;
		
		if(isEmpty())
		{
			head = temp;
			capacity++;
			
			return true;
		}
		else
		{
			temp.next = head;
			head = temp;
			capacity++;
			
			return true;
		}
	}
	
	public T pop()
	{
		T value = null;
		
		if(!isEmpty())
		{
			value = head.value;
			head = head.next;
			capacity--;
		}
		
		return value;
	}
	
	public int capacity()
	{
		return capacity;
	}
	
	public T top()
	{
		return !isEmpty() ? head.value : null;
	}



	class Node
	{
		private T value;
		private Node next;
	}

}
