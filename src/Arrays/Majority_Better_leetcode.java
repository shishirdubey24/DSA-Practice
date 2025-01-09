package Arrays;
import java.util.*;

public class Majority_Better_leetcode {
    public static int Check(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;

        // Fill the HashMap with frequency counts
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // Check if any element appears more than n / 2 times
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n / 2) {
                return entry.getKey(); // Return the element, not its frequency
            }
        }

        return -1; // No majority element found
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2, 2};
        int ans = Check(arr);
        System.out.println("Majority Element is " + ans);
    }
}
