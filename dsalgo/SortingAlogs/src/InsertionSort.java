import java.util.ArrayList;

public class InsertionSort {

    public static void noOfComparision(ArrayList<Integer> arr) {
        //int compare = 0;
        for (int i = 1; i < arr.size(); i++) {
            int temp = arr.get(i);
            int j = i - 1;
            
            while (j >= 0 && arr.get(j) > temp) {
               // ++compare;
                arr.set(j + 1, arr.get(j));  // Use set() to update the element
                j--;
            }
            arr.set(j + 1, temp);  // Place the element in the correct position
        }
       // System.out.println("Compare = " + compare);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>() {{
            add(55); add(44); add(66); add(11); add(33); 
        }};
        
        System.out.println("Before Sort " + arr.toString());
        noOfComparision(arr);
        System.out.println("After Sort = " + arr.toString());
    }
}
