package umi.list;

public class DoublyLinkedList 
{
	Node head,tail;
	
	public DoublyLinkedList() 
	{
		super();
		head = null;
		tail = null;
	}
	
	public boolean isEmpty()
	{
		return head == null;
	}
	
	public boolean insert(int value)
	{
		Node temp = new Node();
		temp.value = value;
		temp.next = null;
		temp.previous = null;
		
		if(isEmpty())
		{
			head = temp;
			tail = temp;
			
			return true;
		}
		else
		{
			tail.next = temp;
			temp.previous = tail;
			tail = temp;
			tail.next = null;
				
			return true;
		}
	}
	
	public boolean insertAtStart(int value)
	{
		Node temp = new Node();
		temp.value = value;
		temp.next = null;
		temp.previous = null;
		
		if(isEmpty())
		{
			head = temp;
			tail = temp;
			
			return true;
		}
		else
		{
			temp.next = head;
			head.previous = temp;
			head = head.previous;
			
			return true;
		}
	}
	
	public boolean insertAfter(int value, int after)
	{
		Node temp = new Node();
		temp.value = value;
		temp.next = null;
		temp.previous = null;
		
		if(!isEmpty())
		{
			Node current = head;
			
			while(current.value != after)
			{
				current = current.next;
			}
			
			temp.next = current.next;
			current.next.previous = temp;
			temp.previous = current;
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
	
	public void insertionSort(int value)
	{
		Node temp = new Node();
		temp.value = value;
		temp.next = null;
		temp.previous = null;
		
		if(isEmpty())
		{
			head = temp;
			tail = temp;
		}
		else
		{
				if(head.value > temp.value)
				{
					temp.next = head;
					head.previous = temp;
					head = head.previous;
				}
				else if(tail.value < temp.value)
				{
					tail.next = temp;
					temp.previous = tail;
					tail = tail.next;
				}
				else
				{
					Node current = head;
					
					while(current.next.value < temp.value)
					{
						current = current.next;
					}
					
					temp.next = current.next;
					current.next.previous = temp;
					temp.previous = current;
					current.next = temp;
					
				}
		}
	}
	
	public boolean delete(int value)
	{
		if(!isEmpty())
		{
			Node current = head;
			
			while(current.next.value != value)
			{
				current = current.next;
			}
			
			current.next = current.next.next;
			current.next.next.previous = current;
		}
		
		return true;
	}



	class Node
	{
		private int value;
		private Node next;
		private Node previous;
	}

}

