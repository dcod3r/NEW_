 package Assignment_3_4;

//4. Write a function which will insert values in sorted order into linked list.

public class SortedLinkedList {
	static class Node{
		int data;
		Node next;
		public Node(int value) {
			data=value;
			next=null;
		}
	}
	private Node head;
	public SortedLinkedList() {
		head=null;
	}
	public void sortedInsertion(int value) 
	{
		Node newnode=new Node(value);
		
		if(head == null)
			head = newnode;
		
		else if(head.next==null) 
		{
			
				if(head.data>value) 
				{
					newnode.next=head;
					head=newnode;
				}
				else 
				{
				head.next=newnode;
				}
			
		}
		else {
			
			Node trav=head;
			while(trav.next!=null && trav.next.data<value ) {
				trav=trav.next;
			}
			newnode.next=trav.next;
			trav.next=newnode;
			
		}
		
	}
	public void display() 
	{
		Node trav=head;
	while(trav!=null) {
		System.out.print(trav.data+ " ");
		trav=trav.next;
	}
	System.out.println();}

}
