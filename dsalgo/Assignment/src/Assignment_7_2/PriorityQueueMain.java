package Assignment_7_2;

public class PriorityQueueMain {

	public static void main(String[] args) {
		
		Queue pq = new Queue(5);
		
		pq.push(10);
		pq.push(1);
		pq.push(15);
		pq.push(12);
		pq.push(8);
		System.out.println("Queue before Pop");
		pq.printData();
		pq.peek();
		pq.pop();
		System.out.println("Queue After Pop");
		pq.printData();
	}

}
