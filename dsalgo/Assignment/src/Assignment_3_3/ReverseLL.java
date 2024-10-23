package Assignment_3_3;

import java.util.Stack;

public class ReverseLL {
	
	public static void main(String[] args) {
	
List l1 = new List();
		
		l1.addFirst(40);
		l1.addFirst(30);
		l1.addFirst(20);
		l1.addFirst(10);
		// 10 - 20 - 30 - 40
		
		l1.addLast(50);
		l1.addLast(60);
		// 10 - 20 - 30 - 40 - 50 - 60
		
		System.out.println("Before Reverse ");
		l1.displayList();
		
		l1.reverseLL();
		
		System.out.println("After Reverse");
		l1.displayList();
	}
}
