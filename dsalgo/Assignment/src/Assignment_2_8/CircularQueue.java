package Assignment_2_8;

import java.util.Scanner;

public class CircularQueue {
	

	public static void main(String[] args) {
		Queue q = new Queue(4);
		int choice;
		Scanner sc = new Scanner (System.in);
		do
		{
			System.out.println("0.Exit\n1. push\n2.pop\n3.peek");
			System.out.println("Enter your choice:- ");
			choice = sc.nextInt();
			
			switch(choice){
			case 1:
				if(q.isFull())
					System.out.println("Queue is full");
				else
				{
					System.out.println("Enter data to pushed:- ");
					
					int data = sc.nextInt();
					q.push(data);
				}
				break;
			case 2:
				if(q.isEmpty())
					System.out.println("Queue is Empty");
				else
					System.out.println("Poped data : " +q.pop() );
				
					
				break;
			case 3:
				if(q.isEmpty())
					System.out.println("queue is empty");
				else
					System.out.println("peek data:- "+ q.peek());
				
			}
			
		
	
		}while(choice !=0);
		
		sc.close();
		
	}	
	

}