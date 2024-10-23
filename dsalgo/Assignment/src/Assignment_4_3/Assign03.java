package Assignment_4_3;

public class Assign03 {

	public static void main(String[] args) {
		DeQueue que = new DeQueue();
		que.push(20);
		que.push(30);
		que.push(60);
		que.push(80);
		que.display();
		System.out.println("Top Element : " + que.peek());
		que.pop();
		que.pop();
		que.display();
		que.pushFromFront(200);
		que.display();
		System.out.println("Top Element : " + que.peek());
		que.pop();
//		que.pop();
		System.out.println("Top Element : " + que.peek());
		que.display();

	}

}
