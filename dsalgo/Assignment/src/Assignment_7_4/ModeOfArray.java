package Assignment_7_4;

import java.util.HashMap;
import java.util.Map;

public class ModeOfArray {
    public static void main(String[] args) {
        // Example array
        int[] arr = {1, 3, 4, 2, 4, 1, 4, 2, 4};

        // Find the mode
        int mode = findMode(arr);
        System.out.println("Mode of the array: " + mode);
    }

    public static int findMode(int[] arr) {
        // HashMap to store element frequencies
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Variable to store the mode and its frequency
        int mode = arr[0];
        int maxCount = 0;

        // Count frequencies of elements
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);

            // Update mode if the current element's count is greater
            if (frequencyMap.get(num) > maxCount) {
                maxCount = frequencyMap.get(num);
                mode = num;
            }
        }

        return mode;
    }
}