package Assignment_7_2;



public class Heap {
	private int SIZE;
	private int [] arr;
	public Heap() {
		SIZE = 0;
	}
	public Heap(int size) {
		SIZE= 0;
		arr = new int[size+1];
	}
	
	public void addHeap(int value) {
		if (SIZE == arr.length - 1) {
            System.out.println("Heap is full");
            return;
        }
		//0. increment heap size by one
		SIZE++;
		arr[SIZE] = value;
		//2.find correct position of newly added element,
			// by comparing with all ancestors one by one
		int ci = SIZE;
		int pi = ci / 2;
		while(pi >= 1  && arr[pi] > arr[ci]) {
			int temp = arr[pi];
			arr[pi] = arr[ci];
			arr[ci] = temp;
			//5. update parent and child index
			ci = pi;
			pi = ci / 2;
		}
	}
	
	public int deleteHeap() {
		  if (SIZE == 0) {
	            System.out.println("Heap is empty");
	            return -1; // or any other sentinel value
	        }
		
		//1. swap first and last element of the heap
		int min = arr[1];
		arr[1] = arr[SIZE];
		//arr[SIZE] = min;
		//3. decrement size of heap by one
		SIZE--;
		//4. find correct position of element which is placed at root index
			// by comparing with all its descendants
		int pi = 1;
		int ci = pi * 2;
		while(ci <= SIZE) {
			//5. find index of min child
			if( (ci + 1) <= SIZE && arr[ci + 1] < arr[ci])
				ci = ci + 1;
			//6. if min child is already greater than its parent, then stop
			if(arr[pi] <= arr[ci])
				break;
			//7. if min child is less than its parent, then swap parent and min child
			int temp = arr[pi];
			arr[pi] = arr[ci];
			arr[ci] = temp;
			//8. update parent and child indices
			pi = ci;
			ci = pi * 2;
		}
		return min;
	}
	
	public void printHeap() {
		System.out.println("Heap Element : ");
		for(int i=1; i<= SIZE; i++) {
			System.out.println(arr[i] + " ");
		}
		
		System.out.println();
	}
	
	public int peek() {
        if (SIZE == 0) {
            System.out.println("Heap is empty");
            return -1; 
        }
        return arr[1];
    }

}
















