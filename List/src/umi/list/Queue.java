package umi.list;

public class Queue<T>
{
	protected Node head;
	protected Node tail;
	protected int capacity;
	
	
	public Queue() 
	{
		super();
		head = null;
		tail = null;
	}
	
	public boolean isEmpty()
	{
		return head == null;
	}
	
	public int capacity()
	{
		return capacity;
	}
	
	public boolean enqueue(T value)
	{
		Node temp = new Node();
		temp.value = value;
		temp.next = null;
		
		if(isEmpty())
		{
			head = temp;
			tail = temp;
			
			capacity++;
			
			return true;
		}
		else
		{
			tail.next = temp;
			tail = tail.next;
			
			capacity++;
			
			return true;
		}
	}
	
	public T dequeue()
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
	
	public T front()
	{
		return !isEmpty() ? head.value : null;
	}
	
	public T rear()
	{
		return !isEmpty() ? tail.value : null;
	}


	class Node
	{
		protected T value;
		protected Node next;
	}

}
