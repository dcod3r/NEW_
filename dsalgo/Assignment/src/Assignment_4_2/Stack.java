package Assignment_4_2;

public class Stack {
	
	private LinkedList list;
	
	public Stack() {
		list = new LinkedList();
	}
		
		public void push(int value) {
			list.addFirst(value);
		}
		
		public void pop(){
			if(isEmpty())
				System.out.println("Stack is empty");
			else
				list.delFirst();
		}
		
		public int peek() {
			if(isEmpty())
			{
				System.out.println("Stack is Empty ");
				return -1;
			}
			else 
				return list.head.data;
		}
		
		public boolean isEmpty() {
			return list.isEmpty();
		}
		
		public void display() {
			list.displayList();
		}
		
		
		
	}
