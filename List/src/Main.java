
import umi.list.*;

public class Main 
{
	
    public static void main(String[] args) 
	{
		SinglyLinkedList link = new SinglyLinkedList();
//		System.out.println("\t List is Empty :" + link.isEmpty());
//		System.out.println();
//		
		link.insertAtEnd(4);
		link.insertAtStart(2);
		link.insertAtEnd(9);
		link.insertAtStart(8);
		link.insertAtEnd(1);
		link.insertAtStart(3);
		link.insertAtEnd(7);
		link.insertAfter(5, 8);
		
		link.display();
		
		System.out.println();
		
		link.evens().display();
		
		System.out.println();
		
		link.odds();
//		
//		link.search(3);
//		
//		System.out.println("\t Capacity : " + link.capacity());
//		
//		System.out.println("Synced Element : " + link.sync(3));
//		
//		System.out.println("\t After Deletion :");
//		
//		link.delete(9);
//		
//		link.deleteFromEnd();
//		
//		link.deleteFromStart();
//		
//		
//		link.display();
//		
//		System.out.println();
//		
//		System.out.println("\t List is Empty :" + link.isEmpty());
//		
//		link.search(8);
//		
//		System.out.println("\t Capacity : " + link.capacity());
//		
//		link.sort("Ascending");
//		
//		link.display();
//		
//		System.out.println();
		
//		ArrayList <String> arr = new ArrayList<>();
//		
//		arr.insert("Umair");
//		arr.insert("Ali");
//		arr.insert("Umar");
//		arr.insert("Liaquat");
//		
//		arr.display();
//		
//		System.out.println();
//		
//		arr.delete("Ali");
//		
//		arr.display();
//		
//		System.out.println();
//		
//		arr.insertAtStart("Hi");
//		arr.insertAtStart("Hello");
//		arr.insertAfter("Fareed", "Umar");
//		arr.deleteFromStart();
//		arr.deleteFromEnd();
//		arr.modify(2, "Liaquat");
//		arr.display();
//		System.out.println(arr.capacity());

//		DoublyLinkedList dlist = new DoublyLinkedList ();
//		
//		dlist.insertionSort(4);
//		dlist.insertionSort(3);
//		dlist.insertionSort(8);
//		dlist.insertionSort(2);
//		dlist.insertionSort(5);
//		dlist.insertionSort(6);
//		
//		dlist.display();
//		
//		System.out.println();
//		
//		dlist.delete(5);
//		
//		dlist.display();
		
//		Stack<String> stk = new Stack<>();
//		
//		stk.push("Mahnoor");
//		stk.push("Umair");
//		stk.push("Basheer");
//		
//		System.out.println(stk.capacity());
//		
//		System.out.println(stk.pop());
//		
//		System.out.println(stk.capacity());
//		
//		System.out.println(stk.top());
		
//		Queue<Float> que = new Queue<>();
//		
//		que.enqueue(4.4f);
//		que.enqueue(5.6f);
//		que.enqueue(1.09f);
//		que.enqueue(8.7f);
//		
//		System.out.println(que.capacity());
//		
//		System.out.println(que.dequeue());
//		
//		System.out.println(que.capacity());
//		
//		System.out.println(que.front());
//		
//		System.out.println(que.rear());
		
//		CircularLinkedList clist = new CircularLinkedList();
//		
//		
//		clist.insertAtStart(1);
//		clist.insertAtStart(8);
//		clist.insertAtStart(7);
//		clist.insertAtStart(2);
//		clist.insertAtStart(5);
//		clist.insertAtEnd(3);
//		clist.insertAtEnd(4);
//		clist.insertAfter(9, 4);
//		
//		clist.display();
//		
//		System.out.println();
		
		//clist.delete(10);
		
		//clist.deleteFromStart();
		
		//clist.deleteFromEnd();
		
		//clist.selectionSort();
		
		
//		clist.display();
//		
//		System.out.println();
		
		//System.out.println(clist.binarySearch(7, 0, 10));
		
//		PriorityQueue<Integer> pque = new PriorityQueue<>();
//		
//		pque.enqueue(4, 1);
//		pque.enqueue(2, 3);
//		pque.enqueue(3, 2);
//		pque.enqueue(1, 4);
//		pque.enqueue(5, 0);
//		pque.dequeue();
//		
//		pque.display();
//		
//        DoubleEndedQueue<Integer> deque = new DoubleEndedQueue<>();
//		
//		deque.enqueueFront(9);
//		deque.enqueueRear(6);
//		deque.enqueueFront(2);
//		
//		deque.dequeue();
//		
//		System.out.println(deque.front());
//		System.out.println(deque.rear());
		
		
		

	}

}
