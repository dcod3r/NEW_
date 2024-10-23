package Assignment_4_3;

// Output Restricted Queue
public class DeQueue {

private LinkedList list;
	
	public DeQueue() {
		list = new LinkedList();
	}
		
		public void push(int value) {
			list.addLast(value);
		}
		
		public void pushFromFront(int value) {
			list.addFirst(value);
		}
		
		public void pop(){
			if(isEmpty())
				System.out.println("Stack is empty");
			else
				list.deleteFirst();
		}
		
		public int peek() {
			if(isEmpty())
			{
				System.out.println("Stack is Empty ");
				return -1;
			}
			else 
				return list.getHead().getData();
		}
		
		public boolean isEmpty() {
			return list.isEmpty();
		}
		
		public void display() {
			list.fDisplay();
		}
		
		
		
	}


