

public class BubbleSort {

	public static void bubble(int arr[], int n) {
		
		int flag;
		for(int i = 0; i < n - 1 ; i++)
		{
			flag = 0;
			for(int j = 0; j < n - i - 1 ; j++)
			{
				if(arr[j] > arr[j+1])
				{
					flag = 1;
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			if(flag == 0)	return;
		}
		
	}
	public static void main(String[] args) {
		
		int arr[] = {1,3,4,8,7,5,2};
		
		System.out.println("Before Sort -");
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		
		bubble(arr, arr.length);
		System.out.println();
		
		System.out.println("After Sort -");
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}
}
