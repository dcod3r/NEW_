package Assignment_7_2;


public class Queue {

private Heap list;
	
	public Queue(int size) {
		list = new Heap(size);
	}
		
		public void push(int value) {
			list.addHeap(value);
		}
		
		public void pop(){
			int deletedValue = list.deleteHeap();
	        if (deletedValue != -1)
	            System.out.println("Popped element: " + deletedValue);
		}
		
		public void peek() {
			int peekValue = list.peek();  // Peek at the root element
	        if (peekValue != -1) {
	            System.out.println("Peeked element: " + peekValue);
	        }
		}
		
		public void printData() {
			list.printHeap();
		}
		
	}

