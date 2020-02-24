package umi.list;

public class CircularLinkedList 
{
	private Node head;
	private Node tail;
	private int size;
	
	public CircularLinkedList()
	{
		super();
		head = null;
		tail = null;	
		size = 0;
	}
	
	public boolean isEmpty()
	{
		return head == null;
	}
	
	public boolean insertAtEnd(int value)
	{
		Node temp = new Node();
		temp.value = value;
		temp.next = null;
		temp.previous = null;
		
		if(isEmpty())
		{
			head = temp;
			tail = temp;
			size++;
			return true;
		}
		else
		{
			temp.previous = tail;
			tail.next = temp;
			tail = tail.next;
			tail.next = head;
			head.previous = tail;
			size++;
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
			size++;
			return true;
		}
		else
		{
			temp.next = head;
			head.previous = temp;
			head = head.previous;
			head.previous = tail;
			tail.next = head;
			size++;
			return true;
		}
	}
	
	public int capacity()
	{
		return size;
	}
	
	public void display()
	{
		if(!isEmpty())
		{
			Node current = head;
			
			for(int i = 0 ; i < size ; i++)
			{
				System.out.println(" [ " + current.value + " ] ");
				current = current.next;
			}
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
			
			while(current.next.value != after)
			{
				current = current.next;
			}
			
			temp.next = current.next.next;
			current.next.next.previous = temp;
			current.next.next = temp;
			temp.previous = current.next;
			size++;
		}
		
		return true;
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
			size--;
		}
		
		return true;
	}
	
	public boolean deleteFromStart()
	{
		if(!isEmpty())
		{
			head = head.next;
			tail.next = head;
			head.previous = tail;
			
			size--;
		}
		
		return true;
	}
	
	public boolean deleteFromEnd()
	{
		if(!isEmpty())
		{
			tail = tail.previous;
			tail.next = head;
			head.previous = tail;
			
			size--;
		}
		
		return true;
	}
	
	public boolean modify(int value, int index)
	{
		if(!isEmpty())
		{
			Node current = head;
			
			while(current.next != head)
			{
				current = current.next;
			}
			
			current.value = value;
		}
		
		return true;
	}
	
	public void selectionSort()
	{
		if(!isEmpty())
		{	
			Node first = head;
			
			while(first.next != head)
			{
				int small = first.value;
				
				Node current = first;	
				Node pos = current;
				
				while(current.next != head)
				{
					if(small > current.value)
					{
						small = current.value;
						pos = current;
					}
					
					current = current.next;
				}
				
				int temp = first.value;
				first.value = small;
				pos.value = temp;
				
				first = first.next;
			}
			
			
		}
	}
	
	public int get(int index)
	{
		Node current = head;
		
		if(!isEmpty())
		{
			for(int i = 1 ; i <= index ; i++)
			{
				current = current.next;
			}
		}
		
		return current.value;
	}
	
	public int binarySearch(int value, int first, int last)
	{
		if(first <= last)
		{
			int mid = (last + first) / 2;
			
			if(get(mid) > value)
			{
				return binarySearch(value, first, mid - 1);
			}
			else if(get(mid) == value)
			{
				return get(mid);
			}
			else
			{
				return binarySearch(value, mid + 1, last);
			}
		}
		else
		{
			return 0;
		}
	}
	

	class Node
	{
		private int value;
		private Node next;
		private Node previous;
	}

}
