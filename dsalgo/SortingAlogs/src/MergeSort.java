import java.util.Arrays;

public class MergeSort {

	public static void mergerSort(int arr[], int  left, int right)
	{
		
	}
	
	public static void main(String[] args) {
		
		int arr[]= {99, 88, 66, 22, 11, 66, 33, 55, 44, 77};
		
		System.out.println("Before Sort : " + Arrays.toString(arr));
		
		mergeSort(arr, 0, arr.length-1);
		
		System.out.println("After Sort : " + Arrays.toString(arr));
		
	}
}