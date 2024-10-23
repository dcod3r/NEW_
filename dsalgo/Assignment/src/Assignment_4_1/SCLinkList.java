package Assignment_4_1;

//1. Implement singly circular linked list using tail pointer (no head pointer). Compare time complexities of all operations

public class SCLinkList {

	static class Node
	{
		private int data;
		private Node next;
		
		public Node(int value)
		{
			data = value;
			next = null;
		}
	}
	
	private Node tail;
	private int count;
	
	public SCLinkList()
	{
		tail = null;
		count = 0;
	}
	
	public boolean isEmpty() {
		return tail == null;
	}
	
	
}
