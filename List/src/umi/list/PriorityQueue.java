package umi.list;

public class PriorityQueue <T>
{
	private Node head;
	private Node tail;

	public PriorityQueue() 
	{
		super();
		head = null;
		tail = null;
	}
	
	public boolean isEmpty()
	{
		return head == null;
	}
	
	public void enqueue(T value, int priority)
	{
		Node temp = new Node();
		temp.value = value;
		temp.priority = priority;
		temp.next = null;
		temp.previous = null;
		
		if(isEmpty())
		{
			head = temp;
			tail = temp;
		}
		else
		{
			if(head.priority < temp.priority)
			{
				temp.next = head;
				head.previous = temp;
				head = head.previous;
			}
			else if(temp.priority < tail.priority)
			{
				tail.next = temp;
				temp.previous = tail;
				tail = tail.next;
			}
			else
			{
				Node current = head;
				
				while(current.priority > temp.priority)
				{
					current = current.next;
				}
				
				temp.next = current;
				temp.previous = current.previous;
				current.previous.next = temp;
				current.previous = temp;
			}
		}
		
	}
	
	public void display()
	{
		Node current = head;
		
		while(current != null)
		{
			System.out.println(" [ " + current.value + ", p" + current.priority + " ] ");
			current = current.next;
		}
	}
	
	public void dequeue()
	{
		if(!isEmpty())
		{
			head = head.next;
		}
	}


	class Node
	{
		private T value;
		private int priority;
		private Node next;
		private Node previous;
	}

}
