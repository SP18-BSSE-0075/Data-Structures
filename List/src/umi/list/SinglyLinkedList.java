package umi.list;

public class SinglyLinkedList   // Outer Class 
{
	private Node head;             // The head of the list initialized
	
	public SinglyLinkedList() 
	{
		head = new Node();        // Head node is created
		head.value = 0;           // Head is by default empty and not have address of further nodes
		head.next = null;
		
	}
	
	public boolean insertAtEnd(int value)
	{
		if(isEmpty())               // checking condition if head is empty put value in head and next node would not be created i.e head.next = null;
		{
			Node temp = new Node();
			temp.value = value;
			temp.next = null;
			head.next = temp;
			
			return true;
		}
		else
		{
			Node temp = new Node();
			Node current = head.next;
			temp.value = value;
			temp.next = null;
			
			while(current.next != null)
			{
				current = current.next;
			}
			
			current.next = temp;
			
			return true;
		}
		
	}
	
	public boolean insertAtStart(int value)
	{
		if(isEmpty())
		{
			Node temp = new Node();
			temp.value = value;
			temp.next = null;
			head.next = temp;
			
			return true;
		}
		else
		{
			Node current = head;
			Node temp = new Node();
			temp.value = value;
			temp.next = null;
		
			temp.next = current.next;
			current.next = temp;
			
			return true;
		}
	}
	
	public boolean insertAfter(int value, int after)
	{
		if(isEmpty())
		{
			Node temp = new Node();
			temp.value = value;
			temp.next = null;
			head.next = temp;
			
			return true;
		}
		else
		{
			Node current = head.next;
			
			while(current.value != after)
			{
				current = current.next;
			}
			
			Node temp = new Node();
			temp.value = value;
			temp.next = current.next;
			current.next = temp;
			
			return true;
		}
	}
	
	public void display()
	{
		Node any = new Node();
		any = head.next;
		
		while(any != null)
		{
			System.out.println(any);
			any = any.next;
		}
		
	}
	
	public boolean delete(int value)
	{
		Node current = head;
		
		while(current.next.value != value)
		{
			current = current.next;
		}
		
		current.next = current.next.next;
		
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
	
	public boolean deleteFromStart()
	{
		if(!isEmpty())
		{
			head.next = head.next.next;
		}
		
		return true;
	}
	
	public boolean delete()
	{
		head.next = null;
		
		return isEmpty();
	}
	
	public int sync(int index)
	{
		if(!isEmpty())
		{
			Node current = head.next;
			
			for(int i = 0 ; i < index ; i++)
			{
				if(current.next == null)
				{
					break;
				}
				
				current = current.next;
			}
			
			return current.value;
		}
		
		return 0;
	}
	
	public boolean isEmpty()
	{
		return head.next == null;
	}
	
	public void search(int value)
	{
		if(isEmpty())
		{
			System.out.println("null");
		}
		else
		{
			Node n = new Node();
			n = head.next;
			int position = 1;
			
			while(n.value != value)
			{
				position++;
				n = n.next;
			}
			
			if(position == 1)
			{
				System.out.println(position + "st : " + n.value);
			}
			else if(position == 2)
			{
				System.out.println(position + "nd : " + n.value);
			}
			else if(position == 3)
			{
				System.out.println(position + "rd : " + n.value);
			}
			else
			{
				System.out.println(position + "th : " + n.value);
			}
		}

	}
	
	public int capacity()
	{
		if(isEmpty())
		{
			return 0;
		}
		else
		{
			Node tmp = new Node();
			tmp = head.next;
			int size = 0;
			
			while(tmp != null)
			{
				tmp = tmp.next;
				size++;
			}
			
			return size;
		}
	}
	
	public void sort(String order)
	{
		if(order.equalsIgnoreCase("Ascending"))
		{
			if(head.next != null)
			{
				Node first = head.next;
				
				while(first.next != null)                                 // Bubble sorting 
				{
					Node sec = head.next;
					
					while(sec.next != null)
					{
						if(sec.value > sec.next.value)
						{
							int temp = sec.value;
							sec.value = sec.next.value;
							sec.next.value = temp;
						}
						
						sec = sec.next;
					}
					
					first = first.next;
				}
				
			}
		}
		
		else if(order.equalsIgnoreCase("Descending"))
		{
			if(!isEmpty())
			{
				Node first = head.next;
				
				while(first.next != null)
				{
					Node sec = head.next;
					
					while(sec.next != null)
					{
						if(sec.value < sec.next.value)
						{
							int swap = sec.value;
							sec.value = sec.next.value;
							sec.next.value = swap;
						}
						sec = sec.next;
					}
					
					first = first.next;
				}
			}
		}
			
	}
	
	public SinglyLinkedList evens()
	{
		Node current = head;
		SinglyLinkedList even = new SinglyLinkedList();
		
		while(current.next != null)
		{
			if(current.value % 2 == 0)
			{
				even.insertAtEnd(current.value);
			}
			
			current = current.next;
		}
		
		return even;
	}
	
	public void odds()
	{
		Node current = head;
		SinglyLinkedList odd = new SinglyLinkedList();
		
		while(current.next != null)
		{
			if(current.value % 2 != 0)
			{
				odd.insertAtEnd(current.value);
			}
			current = current.next;
		}
		
		odd.display();
	}

	class Node           // Inner Class  -> Only be used by SinglyLinkedList
	{
		private int value;        // The value to be store in a node
		private Node next;        // The address of the very next node
		
		@Override
		public String toString() 
		{
				return " { " + value + " } ";
			
		}
		
	}

}
