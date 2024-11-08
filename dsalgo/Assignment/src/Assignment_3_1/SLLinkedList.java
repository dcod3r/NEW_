package Assignment_3_1;

class List
{
	static class Node
	{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	private Node head;
	private Node tail;
	
	public List() {
		head = null;
	}
	
	public boolean isEmpty()
	{
		return head == null;
	}	
	public void addFirst(int value)
	{
		Node newnode = new Node(value);
		
		if(head == null )
		{
			head = newnode;
			tail = newnode;
		}
		else
		{
			newnode.next = head;
			head = newnode;
		}
	}
	
	public void addLast(int value)
	{
		Node newnode = new Node(value);
		
		if(head == null)
		{
			head = newnode;
			tail = newnode;
		}
		else
		{ 
			tail.next = newnode;
			tail = newnode;
		}
	}
	
	public void addPosition(int value, int pos)
	{
		Node newnode = new Node(value);
		
		if(head == null)
		{
			head = newnode;
			tail = newnode;
		}
		else  if(pos <= 1) 
		{
			newnode.next = head;
			head = newnode;
		}
			
		else
		{
			Node trav = head;
			// special condition : pos > count + 1
			for(int i = 1 ; i < pos - 1 && trav.next != null ; i++)
				trav = trav.next;
			
			if(trav.next == null )
			{
				tail.next = newnode;
				tail = newnode;
				return;
			}
			//b. add pos node into next of newnode
			newnode.next = trav.next;
			//c. add newnode into next of pos-1 node
			trav.next = newnode;
		}
	}
	public void display()
	{
		Node trav = head;
		System.out.println("List : ");
		
		while(trav != null)
		{
			System.out.println(" " + trav.data);
			trav = trav.next;
		}
		System.out.println();
	}
	
	public void deleteFirst()
	{
		if(head == null)
			return;
		head = head.next;
	}
	
	public void deleteLast()
	{
		if(head == null)
			return;
		Node trav = head;
		while(trav.next.next != null)
			trav = trav.next;
		tail = trav;
		trav.next = null;
	}
}
public class SLLinkedList {

	public static void main(String[] args) {
		
		List l1 = new List();
		
		l1.addFirst(10);
		l1.display();
	
		l1.addLast(20);
		l1.display();
		
		l1.addPosition(99,3);
		l1.display();
		
		l1.addLast(40);
		l1.display();
		
		l1.addPosition(50, 2);
		l1.display();
		
		l1.deleteFirst();
		l1.display();
		
		l1.deleteLast();
		l1.display();
		
	}
}
