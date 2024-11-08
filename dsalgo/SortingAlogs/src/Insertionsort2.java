
public class Insertionsort2 {

	public static void Sort(int arr[],int n) 
	{
		for(int i=1; i<n; i++)
		{
			int temp = arr[i];
			int j = i-1;
			
			while(j >= 0 && arr[j] > temp) 
			{
					arr[j+1] = arr[j];
					j--;
			}
			arr[j+1] = temp;
		}
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int arr[] = {3,4,6,7,8,9,2,1,10,5};
		
		System.out.println("Before sort : " );
		for(int a : arr)
			System.out.print(a + " ");
		
		Sort(arr,arr.length);
		
		System.out.println("\nAfter sort : " );
		for(int a : arr)
			System.out.print(a + " ");
		
	}

}
