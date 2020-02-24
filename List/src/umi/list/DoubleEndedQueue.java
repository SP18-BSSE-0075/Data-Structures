package umi.list;

public class DoubleEndedQueue <T> extends Queue <T>
{
	public boolean enqueueRear(T value)
	{
		enqueue(value);
		return true;
	}
	
	public boolean enqueueFront(T value)
	{
		Node temp = new Node();
		temp.value = value;
		temp.next = null;
		
		if(isEmpty())
		{
			head = temp;
			tail = temp;
		}
		else
		{
			temp.next = head;
			head = temp;
		}
		
		return true;
	}
	

}
