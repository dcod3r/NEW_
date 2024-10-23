package Assignment_2_7;

import java.util.Arrays;
import java.util.Stack;

public class ReverseUsingStack {

	
	public static void reverseUsingStack(int arr[], int N)
	{
		Stack<Integer> st = new Stack<Integer>(); 
		for(int i = 0; i < N; i++)
		{
			st.push(arr[i]);
		}
		//System.out.println(st);
		
		for(int i = 0; i < N; i++)
			arr[i] = st.pop();
	}
	public static void main(String[] args) {
		
		int arr[] = {66, 55, 88, 33, 11 , 22, 44 };
		
		System.out.println("Original Array");
		System.out.println(Arrays.toString(arr));
		reverseUsingStack(arr, arr.length);
		System.out.println("Reversed Array");
		System.out.println(Arrays.toString(arr));
	}
}
