package Assignment_4_2;


public class Assign02 {

	public static void main(String[] args) {
		Stack st = new Stack();
		Queue que = new Queue();
		st.push(20);
		st.push(30);
		st.push(60);
		st.push(80);
		//st.peek();
		st.pop();
//		st.pop();
//		st.pop();
//		st.pop();
		System.out.println("Top Element : " +st.peek());
		System.out.println("Stack Data : ");
		st.display();
		
		que.push(20);
		que.push(30);
		que.push(60);
		que.push(80);
		//st.peek();
		que.pop();
		que.pop();
//		que.pop();
//		que.pop();
		System.out.println("Top Element : " + que.peek());
		que.display();
	}

}
