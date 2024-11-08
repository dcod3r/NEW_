package Assignment_4_3;

public class LinkedList {
	static class Node{
		private int data;
		private Node next, prev;
		public Node(int value) {
			setData(value);
			next = prev = null;
		}
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
	}
	
	private Node head;
	private int size;
	public LinkedList() {
		setHead(null);
		size = 0;
	}
	
	public boolean isEmpty() {
		//return head == null;
		return size == 0;
	}
	
	public int size() {
		return size;
	}
	
	public void fDisplay() {
		// forward traversal
		//1. start at head
		Node trav = getHead();
		System.out.print("Forward List : ");
		do {
			//2. print current node
			System.out.print(" " + trav.getData());
			//3. go on next node
			trav = trav.next;
		}while(trav != getHead());//4. repeat step 2 and 3 till last node
		System.out.println("");
	}
	
	public void rDisplay() {
		// reversal traversal
		//1. start at last node
		Node trav = getHead().prev;
		System.out.print("Reverse List : ");
		do {
			//2. print current node
			System.out.print(" " + trav.getData());
			//3. go on prev node
			trav = trav.prev;
		}while(trav != getHead().prev);//4. repeat step 2 and 3 till first node
		System.out.println("");
	}
	
	public void addFirst(int value) {
		//a. create a newnode
		Node nn = new Node(value);
		//b. if list is empty
		if(getHead() == null) {
			//1. add newnode into head
			setHead(nn);
			//2. make list circular
			getHead().prev = getHead().next = getHead();
		}
		//c. if list is not empty
		else {
			//1. add first node into next of newnode
			nn.next = getHead();
			//2. add last node into prev of newnode
			nn.prev = getHead().prev;
			//3. add newnode into next of last node
			getHead().prev.next = nn;
			//4. add newnode into prev of first node
			getHead().prev = nn;
			//5. move head on newnode
			setHead(nn);
		}
		size++;
	}
	
	public void addLast(int value) {
		//a. create a newnode
		Node nn = new Node(value);
		//b. if list is empty
		if(getHead() == null) {
			//1. add newnode into head
			setHead(nn);
			//2. make list circular
			getHead().prev = getHead().next = getHead();
		}
		//c. if list is not empty
		else {
			//1. add first node into next of newnode
			nn.next = getHead();
			//2. add last node into prev of newnode
			nn.prev = getHead().prev;
			//3. add newnode into next of last node
			getHead().prev.next = nn;
			//4. add newnode into prev of first node
			getHead().prev = nn;
		}
		size++;
	}
	
	public void addPosition(int value, int pos) {
		if(pos < 1 || pos > size + 1)
			return;
		//a. create a newnode
		Node nn = new Node(value);
		//b. if list is empty
		if(getHead() == null) {
			//1. add newnode into head
			setHead(nn);
			//2. make list circular
			getHead().next = getHead().prev = getHead();
		}
		else if(pos == 1){
			addFirst(value);
			return;
		}
		//c. if list is not empty
		{
			// traverse till pos-1 node
			Node trav = getHead();
			for(int i = 1 ; i < pos - 1 ; i++)
				trav = trav.next;
			//1. add pos node into next of newnode
			nn.next = trav.next;
			//2. add pos-1 node into prev of newnode
			nn.prev = trav;
			//3. add newnode into next of pos-1 node
			trav.next = nn;
			//4. add newnode into prev of pos node
			nn.next.prev = nn;
		}
		size++;
	}
	
	public void deleteFirst() {
		//1. if list is empty
		if(getHead() == null)
			return;
		//2. if list has single node
		else if(getHead().next == getHead())
			setHead(null);
		//3. if list has multiple node
		else {
			//a. add last node into prev of second node
			getHead().next.prev = getHead().prev;
			//b. add second node into next of last node
			getHead().prev.next = getHead().next;
			//c. move head on second node
			setHead(getHead().next);
		}
		size--;
	}
	
	public void deleteLast() {
		//1. if list is empty
		if(getHead() == null)
			return;
		//2. if list has single node
		else if(getHead().next == getHead())
			setHead(null);
		//3. if list has multiple node
		else {
			//a. add first node into next of second last node
			getHead().prev.prev.next = getHead();
			//b. add second last node into prev of first node
			getHead().prev = getHead().prev.prev;
		}
		size--;
	}
	
	public void deletePosition(int pos) {
		if(pos < 1 || pos > size)
			return;
		//1. if list is empty
		if(getHead() == null)
			return;
		//2. if list has single node
		else if(getHead().next == getHead())
			setHead(null);
		else if(pos == 1) {
			deleteFirst();
			return;
		}
		//3. if list has multiple nodes
		else {
			//a. traverse till pos node
			Node trav = getHead();
			for(int i = 1 ; i < pos ; i++)
				trav = trav.next;
			//b. add pos-1 node into prev of pos+1 node
			trav.next.prev = trav.prev;
			//c. add pos+1 node into next of pos-1 node
			trav.prev.next = trav.next;
		}
		size--;
	}
	
	public void deleteAll() {
		setHead(null);
		size = 0;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
}






