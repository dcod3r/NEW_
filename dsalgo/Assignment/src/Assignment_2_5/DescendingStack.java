package Assignment_2_5;


public class DescendingStack {
	
	static class DeStack
	{
		private int arr[];
		private int top;
		
		public DeStack(int Size) {
			this.top = Size;
			arr = new int[top];
		}
		
		public boolean isFull()
		{
			return top == 0;
		}
		public boolean isEmpty()
		{
			return top == arr.length;
		}
		public int pop()
		{
			if(isEmpty()) 
			{
				System.out.println("Empty Stack, Can't Pop anything");
				return (Integer) null;
			}
			return arr[top++];
		}
		public void push(int value)
		{
			if(isFull())
			{
				System.out.println("Stack is Full, OverFlow");
				return;
			}
			arr[--top] = value;
		}
		
		public int peek()
		{
			if(isEmpty()) 
			{
				System.out.println("Empty Stack, Can't Peek anything");
				return (Integer) null;
			}
			return arr[top];
		}
	}
	public static void main(String[] args) 
	{
		
		DeStack dst = new DeStack(4);
		dst.push(2);
		
	}
}
